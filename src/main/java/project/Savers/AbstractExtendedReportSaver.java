package project.Savers;

import project.Containers.ExtendedReport;
import project.Tables.Table;
import org.hibernate.Session;
import org.json.JSONObject;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class AbstractExtendedReportSaver implements ExtendedReportSaver {

    //Коллекция нод,которая подлежит распарсиванию и анализу
    protected Set<String> nodesToParse = new HashSet<String>() {{
        add("adjustAddress");
        add("status");
        add("arbitrationcases");
        add("bankruptcymessage");
        add("boardofdirectors");
        add("changesinnameandlegalform");
        add("companywithsameinfo");
        add("leaderlist");
        add("eventslist");
        add("executivebody");
        add("federaltaxregistrationcurrent");
        add("federaltaxregistrationpayment");
        add("finance");
        add("includeinlist");
        add("legaladdresses");
        add("okved2list");
        add("phonelist");
        add("previousaddress");
        add("specialtaxregimes");
        add("registrationcertificates");
        add("staffnumberfts");
        add("structureinfo");
        add("submittedstatements");
    }};

    private Map<String, String> JSONhashes;
    private String sparkid;
    private String xml;
    private Session session;


    @Override
    public void saveAll() { }

    protected abstract ExtendedReport prepareExtendedReportObject(String xml, JSONObject HashdocOld, String sparkid)throws NoSuchAlgorithmException;

    protected abstract List<Table> defineTablesToSave() throws NoSuchAlgorithmException;

    protected String getHash(String str) throws NoSuchAlgorithmException {
        //String s="f78spx";
        MessageDigest m;
        m = MessageDigest.getInstance("MD5");
        m.reset();
        //передаем в MessageDigest байты строки. Русские символы учитываются.
        m.update(str.getBytes(StandardCharsets.UTF_8));
        //получаем MD5-хеш строки без лидирующих нулей
        //возвращаем MD5-хеш
        return new BigInteger(1, m.digest()).toString(16);

    }

}
