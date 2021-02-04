package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registrationcertificates")
public class RegistrationCertificates extends AbstractModel {

    @Column(name = "SparkID")
    private String sparkid;

    @Column(name = "GRN")
    private String GRN;

    @Column(name = "IssueDate")
    private String issueDate;

    @Column(name = "Number")
    private String number;

    @Column(name = "Series")
    private String series;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public RegistrationCertificates() {
    }

    public String getSparkid() {
        return sparkid;
    }

    public void setSparkid(String sparkid) {
        this.sparkid = sparkid;
    }

    public String getGRN() {
        return GRN;
    }

    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
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
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }
}
