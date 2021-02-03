package Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "submittedstatements")
public class SubmittedStatements extends AbstractModel {

    @Column(name = "SparkID")
    private String sparkID;

    @Column(name = "AvailabilityDate")
    private String availabilityDate;

    @Column(name = "DecisionType")
    private String decisionType;

    @Column(name = "Form")
    private String form;

    @Column(name = "GRN")
    private String GRN;

    @Column(name = "ReferenceNumber")
    private String referenceNumber;

    @Column(name = "SubmissionDate")
    private String submissionDate;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public SubmittedStatements() {
    }

    public String getSparkID() {
        return sparkID;
    }

    public void setSparkID(String sparkID) {
        this.sparkID = sparkID;
    }

    public String getAvailabilityDate() {
        return availabilityDate;
    }

    public void setAvailabilityDate(String availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    public String getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(String decisionType) {
        this.decisionType = decisionType;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getGRN() {
        return GRN;
    }

    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getLastchgdatetime() {
        return lastchgdatetime;
    }

    public void setLastchgdatetime(String lastchgdatetime) {
        this.lastchgdatetime = lastchgdatetime;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public String getGUID() {
        return this.GUID;
    }

    public void setGUID(String submiGUIDssionDate) {
        this.GUID = submiGUIDssionDate;
    }
}
