package Containers;

import Creators.*;
import Tables.CommonTable;
import Tables.Table;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ExtendedReport {


    private String sparkid;
    private Element rootNode;

    public ExtendedReport(String xmlReport, String sparkid) {
        this.sparkid = sparkid;
        this.rootNode = parseRootNode(xmlReport);
    }

    private Element parseRootNode(String xmlReport) {
        return Jsoup.parse(xmlReport).select("report").first();
    }


    public List<Table> getTablesToSave(Set<String> tableNames) {
        List<Table> tablesToSave = new ArrayList<>();
        for (String table : tableNames) {

            if (table.equals("includeinlist")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new IncludeInListCreator(), "test.update_IncludeInList"));
            } else if (table.equals("bankruptcymessage")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new BancruptcyMessageCreator(), "test.update_BankruptcyMessage"));
            } else if (table.equals("boardofdirectors")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new BoardOfDirectorsCreator(), "test.update_BoardOfDirectors"));
            } else if (table.equals("registrationcertificates")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new RegistrationCertificatesCreator(), "test.update_registrationcertificates"));
            } else if (table.equals("submittedstatements")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new SubmittedStatementsCreator(), "test.update_submittedstatements"));
            } else if (table.equals("okved2list")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new Okved2ListCreator(), "test.update_okved2list"));
            } else if (table.equals("adjustaddress")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new AdjustAddressesCreator(), "test.update_adjustaddress"));
            } else if (table.equals("legaladdresses")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new LegalAddressesCreator(), "test.update_legaladdresses"));
            } else if (table.equals("previousaddress")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new PreviousAddressCreator(), "test.update_previousaddress"));
            } else if (table.equals("changesinnameandlegalform")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new ChangesInNameAndLegalFormCreator(), "test.update_changesinnameandlegalform"));
            } else if (table.equals("finance")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new FinPeriodCreator(), "test.update_FinPeriod_FOR_HIBERNATE"));
            } else if (table.equals("arbitrationcases")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new ArbitrationCasesCreator(), "test.update_ArbitrationCases_FOR_HIBERNATE"));
            } else if (table.equals("companywithsameinfo")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new CompanyWithsameInfoCreator(), "test.update_CompanyWithSameInfo_FOR_HIBERNATE"));
            } else if (table.equals("leaderlist")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new LeaderListCreator(), "test.update_leaderlist_FOR_HIBERNATE"));
            } else if (table.equals("eventslist")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new EventsListCreator(), "test.update_eventslist"));
            }else if (table.equals("executivebody")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new ExecutiveBodyCreator(), "test.update_ExecutiveBody_FOR_HIBERNATE"));
            }else if (table.equals("federaltaxregistrationcurrent")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new FederalTaxRegistrationCurrentCreator(), "test.update_federaltaxregistrationcurrent"));
            }else if (table.equals("federaltaxregistrationpayment")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new FederalTaxRegistrationPaymentCreator(), "test.update_federaltaxregistrationpayment"));
            }else if (table.equals("phonelist")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new PhoneListCreator(), "test.update_phonelist"));
            }else if (table.equals("specialtaxregimes")) {
                tablesToSave.add(new CommonTable(sparkid, rootNode.selectFirst(table), new SpecialTaxRegimesCreator(), "test.update_SpecialTaxRegimes_FOR_HIBERNATE"));
            }
        }

        return tablesToSave;
    }


}
