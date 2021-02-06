package project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ExecutiveBody")
public class ExecutiveBody extends AbstractModel {

    @Column(name = "sparkid")
    private String sparkId;

    @Column(name = "ActualDate")
    private String actualDate;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public ExecutiveBody() {
    }

    public ExecutiveBody(String sparkId, String actualDate, String lastchgdatetime, String curr, String GUID) {
        this.sparkId = sparkId;
        this.actualDate = actualDate;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.GUID = GUID;
    }

    public String getSparkId() {
        return sparkId;
    }

    public void setSparkId(String sparkId) {
        this.sparkId = sparkId;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
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
        return "ExecutiveBody{" +
                "sparkId='" + sparkId + '\'' +
                ", actualDate='" + actualDate + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
