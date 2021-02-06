package project;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class test {


    public static void main(String[] args) throws SQLException {
        //Словарь хмл и СпаркИд
        Map<String, String> xmlFiles = new HashMap<>();
        //Словарь спаркИД и их хэшей
        Map<String, String> xmlHASH = new HashMap<>();

//        String selectSQLXMLQUERY1 = "select  sparkid,xmlreport,JSON from mdm.COMPANY where sparkid =10231402";
        String selectSQLXMLQUERY1 = "select  sparkid,xmlreport,JSON from TEST.COMPANY where sparkid =143677";
//        String selectSQLXMLQUERY1 = "select top 5  sparkid,xmlreport,JSON from TEST.COMPANY ";
//        String selectSQLXMLQUERY1 = "select top 1000  sparkid,xmlreport,JSON from mdm.COMPANY ";
//        String selectSQLXMLQUERY1 = "select top 100  sparkid,xmlreport,JSON from mdm.COMPANY ";
//        String selectSQLXMLQUERY1 = "select top 100  sparkid,xmlreport,JSON from mdm.COMPANY where sparkid in(143677,67046,53243,615308,1284446) ";
//        String selectSQLXMLQUERY1 = "select top 10  sparkid,xmlreport,JSON from mdm.COMPANY where sparkid in(select distinct top 20  sparkid from mdm.structureinfo where curr = 1 order by 1 asc) ";
//        String selectSQLXMLQUERY1 = "select  sparkid,xmlreport,JSON from mdm.Company where  sparkid in (select top 10 sparkid from test.ExtendedReport order by 1 asc)";
        String host = "jdbc:sqlserver://10.42.43.100:1433;";
        String db = "databaseName=SPARK;user=java;password=123";
        Connection con = DriverManager.getConnection(host + db);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(selectSQLXMLQUERY1);

        while (rs.next()) {
            xmlFiles.put(rs.getString(1), rs.getString(2));
            if (rs.getString(3) != null) {
                xmlHASH.put(rs.getString(1), rs.getString(3));
            } else {
                xmlHASH.put(rs.getString(1), "{}");
            }
            xmlFiles.put(rs.getString(1), rs.getString(2));
        }
        Inserter i = new Inserter();

        long s = System.currentTimeMillis();
        i.insert(xmlFiles, xmlHASH);
        System.out.println((System.currentTimeMillis() - s));
    }

}
