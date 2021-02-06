package project.Models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StaffNumberFTS")
public class StaffNumberFTS extends AbstractModel {

    @Column (name ="SparkID")
    private String sparkID;

    @Column (name = "ActualDate")
    private String actualDate;

    @Column (name = "Value")
    private String value;

    @Column (name = "lastchgdatetime")
    private  String lastchgdatetime;

    @Column (name = "curr")
    private  String curr;

    @Column (name = "extendedReportID")
    private String extendedReportID;

    @Id
    @Column (name = "GUID")
    private String GUID;

    public StaffNumberFTS(){}

    public String getSparkID() {
        return sparkID;
    }

    public void setSparkID(String sparkID) {
        this.sparkID = sparkID;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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

    public String getExtendedReportID() {
        return extendedReportID;
    }

    public void setExtendedReportID(String extendedReportID) {
        this.extendedReportID = extendedReportID;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }
}
