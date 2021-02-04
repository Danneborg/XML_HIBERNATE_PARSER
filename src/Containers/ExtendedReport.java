package Containers;

import Creators.*;
import Tables.CommonTable;
import Tables.CompanyTable;
import Tables.ParsingXMLStatTable;
import Tables.Table;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ExtendedReport {


    private String sparkid;
    private Element rootNode;
    private String xmlReport;
    private Set<String> tableNames;
    private String hashes;

    public ExtendedReport() {

    }

    public ExtendedReport(String xmlReport, String sparkid) {
        this.sparkid = sparkid;
        this.rootNode = parseDataNode(xmlReport);
        this.xmlReport = xmlReport;
    }

    private Element parseDataNode(String xmlReport) {

        return Jsoup.parse(xmlReport).select("data").first();

    }


    private Element getElement(String elementName) {

        return rootNode.select("report > " + elementName).first();

    }

    public List<Table> getTablesToSave() {
        List<Table> tablesToSave = new ArrayList<>();

        //Заполняем служебные таблицы
        tablesToSave.add(new CommonTable(sparkid, parseDataNode(xmlReport), new ExtendedReportCreator(), "test.update_ExtendedReport"));

        tablesToSave.add(new ParsingXMLStatTable(sparkid, parseDataNode(xmlReport), new ParsingXMLStatCreator(tableNames)));

        if (tableNames.size() > 0) {
            //Заполняем остальные таблицы
            for (String table : tableNames) {

                if (table.equals("includeinlist")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement( table), new IncludeInListCreator(), "test.update_IncludeInList"));
                } else if (table.equals("bankruptcymessage")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new BancruptcyMessageCreator(), "test.update_BankruptcyMessage"));
                } else if (table.equals("boardofdirectors")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new BoardOfDirectorsCreator(), "test.update_BoardOfDirectors"));
                } else if (table.equals("registrationcertificates")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new RegistrationCertificatesCreator(), "test.update_registrationcertificates"));
                } else if (table.equals("submittedstatements")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new SubmittedStatementsCreator(), "test.update_submittedstatements"));
                } else if (table.equals("okved2list")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new Okved2ListCreator(), "test.update_okved2list"));
                } else if (table.equals("adjustaddress")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new AdjustAddressesCreator(), "test.update_adjustaddress"));
                } else if (table.equals("legaladdresses")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new LegalAddressesCreator(), "test.update_legaladdresses"));
                } else if (table.equals("previousaddress")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new PreviousAddressCreator(), "test.update_previousaddress"));
                } else if (table.equals("changesinnameandlegalform")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new ChangesInNameAndLegalFormCreator(), "test.update_changesinnameandlegalform"));
                } else if (table.equals("finance")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new FinPeriodCreator(), "test.update_FinPeriod_FOR_HIBERNATE"));
                } else if (table.equals("arbitrationcases")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new ArbitrationCasesCreator(), "test.update_ArbitrationCases_FOR_HIBERNATE"));
                } else if (table.equals("companywithsameinfo")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new CompanyWithsameInfoCreator(), "test.update_CompanyWithSameInfo_FOR_HIBERNATE"));
                } else if (table.equals("leaderlist")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new LeaderListCreator(), "test.update_leaderlist_FOR_HIBERNATE"));
                } else if (table.equals("eventslist")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new EventsListCreator(), "test.update_eventslist"));
                } else if (table.equals("executivebody")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new ExecutiveBodyCreator(), "test.update_ExecutiveBody_FOR_HIBERNATE"));
                } else if (table.equals("federaltaxregistrationcurrent")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new FederalTaxRegistrationCurrentCreator(), "test.update_federaltaxregistrationcurrent"));
                } else if (table.equals("federaltaxregistrationpayment")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new FederalTaxRegistrationPaymentCreator(), "test.update_federaltaxregistrationpayment"));
                } else if (table.equals("phonelist")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new PhoneListCreator(), "test.update_phonelist"));
                } else if (table.equals("specialtaxregimes")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new SpecialTaxRegimesCreator(), "test.update_SpecialTaxRegimes_FOR_HIBERNATE"));
                } else if (table.equals("structureinfo")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new StructureInfoCreator(), "test.update_structureinfo"));
                } else if (table.equals("staffnumberfts")) {
                    tablesToSave.add(new CommonTable(sparkid, getElement(table), new StaffNumberFTSCreator(), "test.update_staffnumberfts"));
                }
            }
        }

        tablesToSave.add(new CompanyTable(sparkid, hashes, "[mdm].[update_test_COMPANY]"));

        return tablesToSave;
    }

    public void setSparkid(String sparkid) {
        this.sparkid = sparkid;
    }

    public void setRootNode(Element rootNode) {
        this.rootNode = rootNode;
    }

    public void setXmlReport(String xmlReport) {
        this.xmlReport = xmlReport;
    }

    public void setTableNames(Set<String> tableNames) {
        this.tableNames = tableNames;
    }

    public void setHashes(String hashes) {
        this.hashes = hashes;
    }
}
