package project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disqualification")
public class Disqualification extends AbstractModel{

    @Column(name = "registernumber")
    private String registerNumber;

    @Column(name = "article")
    private String article;

    @Column(name = "startdate")
    private String startdate;

    @Column(name = "enddate")
    private String endDate;

    @Column(name = "period")
    private String period;

    @Column(name = "disqualifiedincompany")
    private String disqualifiedInCompany;

    @Column(name = "leaderlistguid")
    private String leaderListGuid;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public Disqualification() {
    }

    public Disqualification(String registerNumber, String article, String startdate, String endDate, String period, String disqualifiedInCompany, String leaderListGuid, String lastchgdatetime, String curr, String GUID) {
        this.registerNumber = registerNumber;
        this.article = article;
        this.startdate = startdate;
        this.endDate = endDate;
        this.period = period;
        this.disqualifiedInCompany = disqualifiedInCompany;
        this.leaderListGuid = leaderListGuid;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.GUID = GUID;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDisqualifiedInCompany() {
        return disqualifiedInCompany;
    }

    public void setDisqualifiedInCompany(String disqualifiedInCompany) {
        this.disqualifiedInCompany = disqualifiedInCompany;
    }

    public String getLeaderListGuid() {
        return leaderListGuid;
    }

    public void setLeaderListGuid(String leaderListGuid) {
        this.leaderListGuid = leaderListGuid;
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

    @Override
    public String toString() {
        return "Disqualification{" +
                "registerNumber='" + registerNumber + '\'' +
                ", article='" + article + '\'' +
                ", startdate='" + startdate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", period='" + period + '\'' +
                ", disqualifiedInCompany='" + disqualifiedInCompany + '\'' +
                ", leaderListGuid='" + leaderListGuid + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
