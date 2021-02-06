package project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ArbitrationCases")
public class ArbitrationCases extends AbstractModel {

    @Column(name = "SparkID")
    private String sparkid;

    @Column(name = "Appealed")
    private int appealed;

    @Column(name = "Completed")
    private int completed;

    @Column(name = "Considered")
    private int considered;

    @Column(name = "DecisionsAndRulings")
    private int decisionsAndRulings;

    @Column(name = "Total")
    private int total;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public ArbitrationCases() {
    }

    public ArbitrationCases(String sparkid, int appealed, int completed, int considered, int decisionsAndRulings, int total, String lastchgdatetime, String curr, String GUID) {
        this.sparkid = sparkid;
        this.appealed = appealed;
        this.completed = completed;
        this.considered = considered;
        this.decisionsAndRulings = decisionsAndRulings;
        this.total = total;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.GUID = GUID;
    }

    public String getSparkid() {
        return sparkid;
    }

    public void setSparkid(String sparkid) {
        this.sparkid = sparkid;
    }

    public int getAppealed() {
        return appealed;
    }

    public void setAppealed(int appealed) {
        this.appealed = appealed;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getConsidered() {
        return considered;
    }

    public void setConsidered(int considered) {
        this.considered = considered;
    }

    public int getDecisionsAndRulings() {
        return decisionsAndRulings;
    }

    public void setDecisionsAndRulings(int decisionsAndRulings) {
        this.decisionsAndRulings = decisionsAndRulings;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
        return "ArbitrationCases{" +
                "sparkid='" + sparkid + '\'' +
                ", appealed=" + appealed +
                ", completed=" + completed +
                ", considered=" + considered +
                ", decisionsAndRulings=" + decisionsAndRulings +
                ", total=" + total +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
