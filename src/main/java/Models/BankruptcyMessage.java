package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankruptcymessage")
public class BankruptcyMessage extends AbstractModel{

    @Column(name = "SparkID")
    private String sparkid;

    @Column(name = "Type")
    private String type;

    @Column(name = "Date")
    private String date;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "CaseNumber")
    private String CaseNumber;

    @Column(name = "CaseId")
    private String CaseId;

    @Column(name = "DecisionDate")
    private String DecisionDate;

    @Column(name = "IdType")
    private String IdType;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public BankruptcyMessage() {
    }

    public String getSparkid() {
        return sparkid;
    }

    public void setSparkid(String sparkid) {
        this.sparkid = sparkid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLastchgdatetime() {
        return lastchgdatetime;
    }

    public void setLastchgdatetime(String lastchgdatetime) {
        this.lastchgdatetime = lastchgdatetime;
    }

    public String getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        CaseNumber = caseNumber;
    }

    public String getCaseId() {
        return CaseId;
    }

    public void setCaseId(String caseId) {
        CaseId = caseId;
    }

    public String getDecisionDate() {
        return DecisionDate;
    }

    public void setDecisionDate(String decisionDate) {
        DecisionDate = decisionDate;
    }

    public String getIdType() {
        return IdType;
    }

    public void setIdType(String idType) {
        IdType = idType;
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
        return "BankruptcyMessageTable{" +
                "sparkid='" + sparkid + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", CaseNumber='" + CaseNumber + '\'' +
                ", CaseId='" + CaseId + '\'' +
                ", DecisionDate='" + DecisionDate + '\'' +
                ", IdType='" + IdType + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
