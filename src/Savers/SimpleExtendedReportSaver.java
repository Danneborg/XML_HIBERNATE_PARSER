package Savers;

import Containers.ExtendedReport;
import Tables.Table;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

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

                    Transaction transaction = session.getTransaction();
                    transaction.begin();

                    for (Table singleTable : tablesToSave) {

                        singleTable.save(session);

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
