package Test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.sql.*;

public class test {
    public static void main(String[] args) throws SQLException {
        String selectSQLXMLQUERY1 = "select  xmlreport from mdm.COMPANY where sparkid =675";
        String host = "jdbc:sqlserver://10.42.43.100:1433;";
        String db = "databaseName=SPARK;user=java;password=123";
        Connection con = DriverManager.getConnection(host + db);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(selectSQLXMLQUERY1);
        String sparkid = "";
        String xml = "";

        StringBuilder s = new StringBuilder();
        while (rs.next()) {
            s.append(rs.getString(1));
        }

        Document document = Jsoup.parse(s.toString());


        System.out.println(document.selectFirst("report"));

        System.out.println(document.selectFirst("report1"));
    }
}
