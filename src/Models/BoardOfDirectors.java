package Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boardofdirectors")
public class BoardOfDirectors extends AbstractModel {
    @Column(name = "SparkID")
    private String sparkid;

    @Column(name = "Name")
    private String name;

    @Column(name = "BirthdayYear")
    private String birthdayYear;

    @Column(name = "INN")
    private String INN;

    @Column(name = "SharePart")
    private String sharePart;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public BoardOfDirectors() {
    }

    public BoardOfDirectors(String sparkid, String type, String name, String birthdayYear, String INN, String sharePart, String lastchgdatetime, String curr, String GUID) {
        this.sparkid = sparkid;
        this.name = name;
        this.birthdayYear = birthdayYear;
        this.INN = INN;
        this.sharePart = sharePart;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(String birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getSharePart() {
        return sharePart;
    }

    public void setSharePart(String sharePart) {
        this.sharePart = sharePart;
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
