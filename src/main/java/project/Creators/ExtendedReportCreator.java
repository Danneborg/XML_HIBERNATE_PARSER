package project.Creators;

import project.Models.AbstractModel;
import project.Models.ExtendedReportModel;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

//Самая большая таблица, на основе почти всех дочерних тегов тега Report
//Да простят меня за это те, кто попытается в этом разобраться

public class ExtendedReportCreator implements Create {

    /**
     * @param element - нужно подавать тег Data, это критически важно для выполнения селектов в дереву тегов
     * @param sparkid - sparkid
     * @return - таблица ExtendedReport
     */
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {

        List<AbstractModel> extendedReportList = new ArrayList<>();

        ExtendedReportModel extendedReportModel = new ExtendedReportModel();

        Element extendedReportElement = element;

        extendedReportModel.setSparkId(sparkid);

        extendedReportModel.setCompanyType(getElementTextInInt(extendedReportElement, "CompanyType"));

        extendedReportModel.setStatusDate(getElementAttribInString(extendedReportElement, "Status", "Date"));

        extendedReportModel.setStatusType(getElementAttribInString(extendedReportElement, "Status", "Type"));

        extendedReportModel.setStatusCode(getElementAttribInInt(extendedReportElement, "Status", "Code"));

        extendedReportModel.setIsActing(getElementAttribInString(extendedReportElement, "Status", "IsActing"));

        extendedReportModel.setEGRPOIncluded(getElementText(extendedReportElement, "EGRPOIncluded"));

        extendedReportModel.setEGRULLikvidation(getElementText(extendedReportElement, "EGRULLikvidation"));

        extendedReportModel.setDateFirstReg(getElementText(extendedReportElement, "DateFirstReg"));

        extendedReportModel.setDateFirstReg(getElementText(extendedReportElement, "DateFirstReg"));

        extendedReportModel.setShortNameRus(getElementText(extendedReportElement, "ShortNameRus"));

        extendedReportModel.setShortNameEn(getElementText(extendedReportElement, "ShortNameEn"));

        extendedReportModel.setFullNameRus(getElementText(extendedReportElement, "FullNameRus"));

        extendedReportModel.setNormName(getElementText(extendedReportElement, "NormName"));

        extendedReportModel.setINN(getElementText(extendedReportElement, "INN"));

        extendedReportModel.setKPP(getElementText(extendedReportElement, "KPP"));

        extendedReportModel.setOGRN(getElementText(extendedReportElement, "OGRN"));

        extendedReportModel.setOKPO(getElementText(extendedReportElement, "OKPO"));

        extendedReportModel.setBIK(getElementText(extendedReportElement, "BIK"));

        extendedReportModel.setFCSMCode(getElementText(extendedReportElement, "FCSMCode"));

        extendedReportModel.setRTS(getElementText(extendedReportElement, "RTS"));

        extendedReportModel.setOKATO(getElementAttribInString(extendedReportElement, "OKATO", "Code"));

        extendedReportModel.setOKATO_RegionName(getElementAttribInString(extendedReportElement, "OKATO", "RegionName"));

        extendedReportModel.setOKATO_RegionCode(getElementAttribInInt(extendedReportElement, "OKATO", "RegionCode"));

        extendedReportModel.setOKTMO(getElementAttribInString(extendedReportElement, "OKTMO", "Code"));

        extendedReportModel.setOKOGU(getElementAttribInString(extendedReportElement, "OKOGU", "Name"));

        extendedReportModel.setOKFS(getElementAttribInString(extendedReportElement, "OKFS", "Name"));

        extendedReportModel.setOKOPF(getElementAttribInString(extendedReportElement, "OKOPF", "Name"));

        extendedReportModel.setOKOPF_Code(getElementAttribInInt(extendedReportElement, "OKOPF", "Code"));

        extendedReportModel.setOKOPF_CodeNew(getElementAttribInInt(extendedReportElement, "OKOPF", "CodeNew"));

        extendedReportModel.setCharterCapital(getElementText(extendedReportElement, "CharterCapital"));

        extendedReportModel.setAdjustAddress(getElementAttribInString(extendedReportElement, "AdjustAddress > Address", "Address"));

        extendedReportModel.setEmail(getElementText(extendedReportElement, "Email"));

        extendedReportModel.setWww(getElementText(extendedReportElement, "Www"));

        extendedReportModel.setWorkersRange(getElementText(extendedReportElement, "WorkersRange"));

        extendedReportModel.setConsolidatedIndicator(getElementAttribInString(extendedReportElement, "ConsolidatedIndicator", "Value"));

        extendedReportModel.setIndexOfDueDiligence(getElementAttribInString(extendedReportElement, "IndexOfDueDiligence", "Index"));

        extendedReportModel.setIndexDesc(getElementAttribInString(extendedReportElement, "IndexOfDueDiligence", "IndexDesc"));

        extendedReportModel.setFailureScore(getElementAttribInString(extendedReportElement, "FailureScore", "FailureScoreValue"));

        extendedReportModel.setFailureScoreDesc(getElementAttribInString(extendedReportElement, "FailureScore", "FailureScoreDesc"));

        extendedReportModel.setPaymentIndex(getElementAttribInString(extendedReportElement, "PaymentIndex", "PaymentIndexValue"));

        extendedReportModel.setPaymentIndexDesc(getElementAttribInString(extendedReportElement, "PaymentIndex", "PaymentIndexDesc"));

        extendedReportModel.setCompanySize(getElementAttribInString(extendedReportElement, "CompanySize", "Revenue"));

        extendedReportModel.setCompanySize_Description(getElementAttribInString(extendedReportElement, "CompanySize", "Description"));

        extendedReportModel.setFederalTaxRegistration(getElementText(extendedReportElement, "FederalTaxRegistration > RegAuthority"));

        extendedReportModel.setFinance(getElementAttribInInt(extendedReportElement, "Finance", "BalanceType"));

        extendedReportModel.setExecutionProceedings_Active(getElementAttribInInt(extendedReportElement, "ExecutionProceedings", "Active"));

        extendedReportModel.setExecutionProceedings_Executed(getElementAttribInInt(extendedReportElement, "ExecutionProceedings", "Executed"));

        extendedReportModel.setArbitrationCases(getElementAttribInInt(extendedReportElement, "ArbitrationCases", "Total"));

        extendedReportModel.setCompanyWithSameInfo(getElementTextInInt(extendedReportElement, "CompanyWithSameInfo > AddressCount"));

        extendedReportModel.setCurr("1");

        extendedReportModel.setLastchgdatetime(TimeStamp.getTimeStamp());

        extendedReportModel.setGUID(NodeCreatorUtil.createGuid());

        extendedReportList.add(extendedReportModel);

        return extendedReportList;
    }

    public String getElementText(Element element, String elementName) {

        return NodeCreatorUtil.getJsoupElemText(element.select("report > " + elementName).first());
    }

    public int getElementTextInInt(Element element, String elementName) {

        String result = NodeCreatorUtil.getJsoupElemText(element.select("report > " + elementName).first());

        return result.equals("") ? 0 : Integer.parseInt(result);
    }

    private String getElementAttribInString(Element element, String elementName, String attribName) {

        return NodeCreatorUtil.getJsoupElemAttrib(element.select("report > " + elementName).first(), attribName);
    }

    private int getElementAttribInInt(Element element, String elementName, String attribName) {

        String result = NodeCreatorUtil.getJsoupElemAttrib(element.select("report > " + elementName).first(), attribName);

        return result.equals("") ? 0 : Integer.parseInt(result);
    }
}
