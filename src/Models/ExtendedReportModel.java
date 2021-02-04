package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ExtendedReport")
public class ExtendedReportModel extends AbstractModel {

    @Column(name = "sparkid")
    private String sparkId;

    @Column(name = "CompanyType")
    private int companyType;

    @Column(name = "Status_Date")
    private String statusDate;

    @Column(name = "Status_Type")
    private String statusType;

    @Column(name = "Status_Code")
    private int statusCode;

    @Column(name = "EGRPOIncluded")
    private String EGRPOIncluded;

    @Column(name = "IsActing")
    private String isActing;

    @Column(name = "EGRULLikvidation")
    private String EGRULLikvidation;

    @Column(name = "DateFirstReg")
    private String dateFirstReg;

    @Column(name = "ShortNameRus")
    private String shortNameRus;

    @Column(name = "ShortNameEn")
    private String shortNameEn;

    @Column(name = "FullNameRus")
    private String fullNameRus;

    @Column(name = "NormName")
    private String normName;

    @Column(name = "INN")
    private String INN;

    @Column(name = "KPP")
    private String KPP;

    @Column(name = "OGRN")
    private String OGRN;

    @Column(name = "OKPO")
    private String OKPO;

    @Column(name = "BIK")
    private String BIK;

    @Column(name = "FCSMCode")
    private String FCSMCode;

    @Column(name = "RTS")
    private String RTS;

    @Column(name = "OKATO")
    private String OKATO;

    @Column(name = "OKTMO")
    private String OKTMO;

    @Column(name = "OKOGU")
    private String OKOGU;

    @Column(name = "OKFS")
    private String OKFS;

    @Column(name = "OKOPF")
    private String OKOPF;

    @Column(name = "CharterCapital")
    private String charterCapital;

    @Column(name = "AdjustAddress")
    private String adjustAddress;

    @Column(name = "Email")
    private String email;

    @Column(name = "Www")
    private String www;

    @Column(name = "WorkersRange")
    private String workersRange;

    @Column(name = "ConsolidatedIndicator")
    private String consolidatedIndicator;

    @Column(name = "IndexOfDueDiligence")
    private String indexOfDueDiligence;

    @Column(name = "FailureScore")
    private String failureScore;

    @Column(name = "PaymentIndex")
    private String paymentIndex;

    @Column(name = "CompanySize")
    private String companySize;

    @Column(name = "FederalTaxRegistration")
    private String federalTaxRegistration;

    @Column(name = "Finance")
    private int finance;

    @Column(name = "CompanyWithSameInfo")
    private int companyWithSameInfo;

    @Column(name = "ArbitrationCases")
    private int arbitrationCases;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "IndexDesc")
    private String indexDesc;

    @Column(name = "FailureScoreDesc")
    private String failureScoreDesc;

    @Column(name = "PaymentIndexDesc")
    private String paymentIndexDesc;

    @Column(name = "CompanySize_Description")
    private String companySize_Description;

    @Column(name = "ExecutionProceedings_Active")
    private int executionProceedings_Active;

    @Column(name = "ExecutionProceedings_Executed")
    private int executionProceedings_Executed;

    @Column(name = "OKATO_RegionCode")
    private int OKATO_RegionCode;

    @Column(name = "OKATO_RegionName")
    private String OKATO_RegionName;

    @Column(name = "OKOPF_Code")
    private int OKOPF_Code;

    @Column(name = "OKOPF_CodeNew")
    private int OKOPF_CodeNew;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID_XML")
    private String GUID;

    public ExtendedReportModel() {
    }

    public ExtendedReportModel(String sparkId, int companyType, String statusDate, String statusType, int statusCode, String EGRPOIncluded, String isActing, String EGRULLikvidation, String dateFirstReg, String shortNameRus, String shortNameEn, String fullNameRus, String normName, String INN, String KPP, String OGRN, String OKPO, String BIK, String FCSMCode, String RTS, String OKATO, String OKTMO, String OKOGU, String OKFS, String OKOPF, String charterCapital, String adjustAddress, String email, String www, String workersRange, String consolidatedIndicator, String indexOfDueDiligence, String failureScore, String paymentIndex, String companySize, String federalTaxRegistration, int finance, int companyWithSameInfo, int arbitrationCases, String lastchgdatetime, String indexDesc, String failureScoreDesc, String paymentIndexDesc, String companySize_Description, int executionProceedings_Active, int executionProceedings_Executed, int OKATO_RegionCode, String OKATO_RegionName, int OKOPF_Code, int OKOPF_CodeNew, String curr, String GUID) {
        this.sparkId = sparkId;
        this.companyType = companyType;
        this.statusDate = statusDate;
        this.statusType = statusType;
        this.statusCode = statusCode;
        this.EGRPOIncluded = EGRPOIncluded;
        this.isActing = isActing;
        this.EGRULLikvidation = EGRULLikvidation;
        this.dateFirstReg = dateFirstReg;
        this.shortNameRus = shortNameRus;
        this.shortNameEn = shortNameEn;
        this.fullNameRus = fullNameRus;
        this.normName = normName;
        this.INN = INN;
        this.KPP = KPP;
        this.OGRN = OGRN;
        this.OKPO = OKPO;
        this.BIK = BIK;
        this.FCSMCode = FCSMCode;
        this.RTS = RTS;
        this.OKATO = OKATO;
        this.OKTMO = OKTMO;
        this.OKOGU = OKOGU;
        this.OKFS = OKFS;
        this.OKOPF = OKOPF;
        this.charterCapital = charterCapital;
        this.adjustAddress = adjustAddress;
        this.email = email;
        this.www = www;
        this.workersRange = workersRange;
        this.consolidatedIndicator = consolidatedIndicator;
        this.indexOfDueDiligence = indexOfDueDiligence;
        this.failureScore = failureScore;
        this.paymentIndex = paymentIndex;
        this.companySize = companySize;
        this.federalTaxRegistration = federalTaxRegistration;
        this.finance = finance;
        this.companyWithSameInfo = companyWithSameInfo;
        this.arbitrationCases = arbitrationCases;
        this.lastchgdatetime = lastchgdatetime;
        this.indexDesc = indexDesc;
        this.failureScoreDesc = failureScoreDesc;
        this.paymentIndexDesc = paymentIndexDesc;
        this.companySize_Description = companySize_Description;
        this.executionProceedings_Active = executionProceedings_Active;
        this.executionProceedings_Executed = executionProceedings_Executed;
        this.OKATO_RegionCode = OKATO_RegionCode;
        this.OKATO_RegionName = OKATO_RegionName;
        this.OKOPF_Code = OKOPF_Code;
        this.OKOPF_CodeNew = OKOPF_CodeNew;
        this.curr = curr;
        this.GUID = GUID;
    }

    public String getSparkId() {
        return sparkId;
    }

    public void setSparkId(String sparkId) {
        this.sparkId = sparkId;
    }

    public int getCompanyType() {
        return companyType;
    }

    public void setCompanyType(int companyType) {
        this.companyType = companyType;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getEGRPOIncluded() {
        return EGRPOIncluded;
    }

    public void setEGRPOIncluded(String EGRPOIncluded) {
        this.EGRPOIncluded = EGRPOIncluded;
    }

    public String getIsActing() {
        return isActing;
    }

    public void setIsActing(String isActing) {
        this.isActing = isActing;
    }

    public String getEGRULLikvidation() {
        return EGRULLikvidation;
    }

    public void setEGRULLikvidation(String EGRULLikvidation) {
        this.EGRULLikvidation = EGRULLikvidation;
    }

    public String getDateFirstReg() {
        return dateFirstReg;
    }

    public void setDateFirstReg(String dateFirstReg) {
        this.dateFirstReg = dateFirstReg;
    }

    public String getShortNameRus() {
        return shortNameRus;
    }

    public void setShortNameRus(String shortNameRus) {
        this.shortNameRus = shortNameRus;
    }

    public String getShortNameEn() {
        return shortNameEn;
    }

    public void setShortNameEn(String shortNameEn) {
        this.shortNameEn = shortNameEn;
    }

    public String getFullNameRus() {
        return fullNameRus;
    }

    public void setFullNameRus(String fullNameRus) {
        this.fullNameRus = fullNameRus;
    }

    public String getNormName() {
        return normName;
    }

    public void setNormName(String normName) {
        this.normName = normName;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getKPP() {
        return KPP;
    }

    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    public String getOGRN() {
        return OGRN;
    }

    public void setOGRN(String OGRN) {
        this.OGRN = OGRN;
    }

    public String getOKPO() {
        return OKPO;
    }

    public void setOKPO(String OKPO) {
        this.OKPO = OKPO;
    }

    public String getBIK() {
        return BIK;
    }

    public void setBIK(String BIK) {
        this.BIK = BIK;
    }

    public String getFCSMCode() {
        return FCSMCode;
    }

    public void setFCSMCode(String FCSMCode) {
        this.FCSMCode = FCSMCode;
    }

    public String getRTS() {
        return RTS;
    }

    public void setRTS(String RTS) {
        this.RTS = RTS;
    }

    public String getOKATO() {
        return OKATO;
    }

    public void setOKATO(String OKATO) {
        this.OKATO = OKATO;
    }

    public String getOKTMO() {
        return OKTMO;
    }

    public void setOKTMO(String OKTMO) {
        this.OKTMO = OKTMO;
    }

    public String getOKOGU() {
        return OKOGU;
    }

    public void setOKOGU(String OKOGU) {
        this.OKOGU = OKOGU;
    }

    public String getOKFS() {
        return OKFS;
    }

    public void setOKFS(String OKFS) {
        this.OKFS = OKFS;
    }

    public String getOKOPF() {
        return OKOPF;
    }

    public void setOKOPF(String OKOPF) {
        this.OKOPF = OKOPF;
    }

    public String getCharterCapital() {
        return charterCapital;
    }

    public void setCharterCapital(String charterCapital) {
        this.charterCapital = charterCapital;
    }

    public String getAdjustAddress() {
        return adjustAddress;
    }

    public void setAdjustAddress(String adjustAddress) {
        this.adjustAddress = adjustAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public String getWorkersRange() {
        return workersRange;
    }

    public void setWorkersRange(String workersRange) {
        this.workersRange = workersRange;
    }

    public String getConsolidatedIndicator() {
        return consolidatedIndicator;
    }

    public void setConsolidatedIndicator(String consolidatedIndicator) {
        this.consolidatedIndicator = consolidatedIndicator;
    }

    public String getIndexOfDueDiligence() {
        return indexOfDueDiligence;
    }

    public void setIndexOfDueDiligence(String indexOfDueDiligence) {
        this.indexOfDueDiligence = indexOfDueDiligence;
    }

    public String getFailureScore() {
        return failureScore;
    }

    public void setFailureScore(String failureScore) {
        this.failureScore = failureScore;
    }

    public String getPaymentIndex() {
        return paymentIndex;
    }

    public void setPaymentIndex(String paymentIndex) {
        this.paymentIndex = paymentIndex;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getFederalTaxRegistration() {
        return federalTaxRegistration;
    }

    public void setFederalTaxRegistration(String federalTaxRegistration) {
        this.federalTaxRegistration = federalTaxRegistration;
    }

    public int getFinance() {
        return finance;
    }

    public void setFinance(int finance) {
        this.finance = finance;
    }

    public int getCompanyWithSameInfo() {
        return companyWithSameInfo;
    }

    public void setCompanyWithSameInfo(int companyWithSameInfo) {
        this.companyWithSameInfo = companyWithSameInfo;
    }

    public int getArbitrationCases() {
        return arbitrationCases;
    }

    public void setArbitrationCases(int arbitrationCases) {
        this.arbitrationCases = arbitrationCases;
    }

    public String getLastchgdatetime() {
        return lastchgdatetime;
    }

    public void setLastchgdatetime(String lastchgdatetime) {
        this.lastchgdatetime = lastchgdatetime;
    }

    public String getIndexDesc() {
        return indexDesc;
    }

    public void setIndexDesc(String indexDesc) {
        this.indexDesc = indexDesc;
    }

    public String getFailureScoreDesc() {
        return failureScoreDesc;
    }

    public void setFailureScoreDesc(String failureScoreDesc) {
        this.failureScoreDesc = failureScoreDesc;
    }

    public String getPaymentIndexDesc() {
        return paymentIndexDesc;
    }

    public void setPaymentIndexDesc(String paymentIndexDesc) {
        this.paymentIndexDesc = paymentIndexDesc;
    }

    public String getCompanySize_Description() {
        return companySize_Description;
    }

    public void setCompanySize_Description(String companySize_Description) {
        this.companySize_Description = companySize_Description;
    }

    public int getExecutionProceedings_Active() {
        return executionProceedings_Active;
    }

    public void setExecutionProceedings_Active(int executionProceedings_Active) {
        this.executionProceedings_Active = executionProceedings_Active;
    }

    public int getExecutionProceedings_Executed() {
        return executionProceedings_Executed;
    }

    public void setExecutionProceedings_Executed(int executionProceedings_Executed) {
        this.executionProceedings_Executed = executionProceedings_Executed;
    }

    public int getOKATO_RegionCode() {
        return OKATO_RegionCode;
    }

    public void setOKATO_RegionCode(int OKATO_RegionCode) {
        this.OKATO_RegionCode = OKATO_RegionCode;
    }

    public String getOKATO_RegionName() {
        return OKATO_RegionName;
    }

    public void setOKATO_RegionName(String OKATO_RegionName) {
        this.OKATO_RegionName = OKATO_RegionName;
    }

    public int getOKOPF_Code() {
        return OKOPF_Code;
    }

    public void setOKOPF_Code(int OKOPF_Code) {
        this.OKOPF_Code = OKOPF_Code;
    }

    public int getOKOPF_CodeNew() {
        return OKOPF_CodeNew;
    }

    public void setOKOPF_CodeNew(int OKOPF_CodeNew) {
        this.OKOPF_CodeNew = OKOPF_CodeNew;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    @Override
    public String toString() {
        return "ExtendedReportModel{" +
                "sparkId='" + sparkId + '\'' +
                ", companyType='" + companyType + '\'' +
                ", statusDate='" + statusDate + '\'' +
                ", statusType='" + statusType + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", EGRPOIncluded='" + EGRPOIncluded + '\'' +
                ", isActing='" + isActing + '\'' +
                ", EGRULLikvidation='" + EGRULLikvidation + '\'' +
                ", dateFirstReg='" + dateFirstReg + '\'' +
                ", shortNameRus='" + shortNameRus + '\'' +
                ", shortNameEn='" + shortNameEn + '\'' +
                ", fullNameRus='" + fullNameRus + '\'' +
                ", normName='" + normName + '\'' +
                ", INN='" + INN + '\'' +
                ", KPP='" + KPP + '\'' +
                ", OGRN='" + OGRN + '\'' +
                ", OKPO='" + OKPO + '\'' +
                ", BIK='" + BIK + '\'' +
                ", FCSMCode='" + FCSMCode + '\'' +
                ", RTS='" + RTS + '\'' +
                ", OKATO='" + OKATO + '\'' +
                ", OKTMO='" + OKTMO + '\'' +
                ", OKOGU='" + OKOGU + '\'' +
                ", OKFS='" + OKFS + '\'' +
                ", OKOPF='" + OKOPF + '\'' +
                ", charterCapital='" + charterCapital + '\'' +
                ", adjustAddress='" + adjustAddress + '\'' +
                ", email='" + email + '\'' +
                ", www='" + www + '\'' +
                ", workersRange='" + workersRange + '\'' +
                ", consolidatedIndicator='" + consolidatedIndicator + '\'' +
                ", indexOfDueDiligence='" + indexOfDueDiligence + '\'' +
                ", failureScore='" + failureScore + '\'' +
                ", paymentIndex='" + paymentIndex + '\'' +
                ", companySize='" + companySize + '\'' +
                ", federalTaxRegistration='" + federalTaxRegistration + '\'' +
                ", finance='" + finance + '\'' +
                ", companyWithSameInfo='" + companyWithSameInfo + '\'' +
                ", arbitrationCases='" + arbitrationCases + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", indexDesc='" + indexDesc + '\'' +
                ", failureScoreDesc='" + failureScoreDesc + '\'' +
                ", paymentIndexDesc='" + paymentIndexDesc + '\'' +
                ", companySize_Description='" + companySize_Description + '\'' +
                ", executionProceedings_Active='" + executionProceedings_Active + '\'' +
                ", executionProceedings_Executed='" + executionProceedings_Executed + '\'' +
                ", OKATO_RegionCode='" + OKATO_RegionCode + '\'' +
                ", OKATO_RegionName='" + OKATO_RegionName + '\'' +
                ", OKOPF_Code='" + OKOPF_Code + '\'' +
                ", OKOPF_CodeNew='" + OKOPF_CodeNew + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
