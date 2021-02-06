package project.Savers;

import project.Containers.ExtendedReport;
import project.Models.AbstractModel;
import project.Tables.Table;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.json.JSONObject;
import org.jsoup.Jsoup;

import java.security.NoSuchAlgorithmException;
import java.util.*;

public class SimpleExtendedReportSaver extends AbstractExtendedReportSaver {

    private Map<String, String> JSONhashes;
    private String sparkid;
    private String xml;
    private Session session;

    public SimpleExtendedReportSaver(String sparkid, Map<String, String> JSONhashes, String xml, Session session) {
        this.JSONhashes = JSONhashes;
        this.sparkid = sparkid;
        this.xml = xml;
        this.session = session;
    }

    @Override
    public void saveAll() {
        try {
            List<Table> tablesToSave = defineTablesToSave();
            if (tablesToSave.size() > 0) {
                try {
                    List<AbstractModel> modelsToSave = new ArrayList<>();

                    Transaction transaction = session.getTransaction();

                    transaction.begin();

                    //Сбрасываем метки curr
                    for (Table singleTable : tablesToSave) {

                        modelsToSave.addAll(singleTable.getRowsToUpdate());
                        singleTable.dropCurrMarker(session);

                    }

                    //Сохраняем все записи в БД
                    int i = 0;
                    for (AbstractModel singleModel : modelsToSave) {

                        //Бьем на батчи по 25 штук
                        if (i != 0 && i % 25 == 0) {
                            session.flush();
                            session.clear();
                        }

                        session.save(singleModel);

                        i++;
                    }

                    transaction.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    public List<Table> defineTablesToSave() throws NoSuchAlgorithmException {

        JSONObject object = new JSONObject(JSONhashes.getOrDefault(sparkid, "{}"));

        ExtendedReport extendedReport = prepareExtendedReportObject(xml, object, sparkid);

        return extendedReport.getTablesToSave();
    }

    @Override
    public ExtendedReport prepareExtendedReportObject(String xml, JSONObject HashdocOld, String sparkid) throws NoSuchAlgorithmException {

        ExtendedReport extendedReport = new ExtendedReport();

        Set<String> methods = new HashSet<>();

        for (org.jsoup.nodes.Element e : Jsoup.parse(xml).select("Report").first().children()) {
            if (nodesToParse.contains(e.nodeName())) {
                try {

                    //Только теги с новыми хэшами подлежат парсингу
                    if (!getHash(e.toString()).equals(HashdocOld.get(e.nodeName()))) {
//                        System.out.println(e.nodeName());
                        methods.add(e.nodeName());
                        HashdocOld.put(e.nodeName(), getHash(e.toString()));
                    }

                } catch (Exception e1) {
                    methods.add(e.nodeName());
                    HashdocOld.put(e.nodeName(), getHash(e.toString()));
                }
            }
        }

        extendedReport.setSparkid(sparkid);

        extendedReport.setXmlReport(xml);

        extendedReport.setRootNode(Jsoup.parse(xml).select("Data").first());

        extendedReport.setTableNames(methods);

        extendedReport.setHashes(HashdocOld.toString());

        return extendedReport;
    }

}
