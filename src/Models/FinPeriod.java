package Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "finperiod")
public class FinPeriod extends AbstractModel {

    @Column(name = "sparkid")
    private String sparkId;

    @Column(name = "datebegin")
    private String dateBegin;

    @Column(name = "dateend")
    private String dateEnd;

    @Column(name = "periodname")
    private String periodName;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public FinPeriod() {
    }

    public FinPeriod(String sparkId, String dateBegin, String dateEnd, String periodName, String lastchgdatetime, String curr, String GUID) {
        this.sparkId = sparkId;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.periodName = periodName;
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

    public String getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
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
