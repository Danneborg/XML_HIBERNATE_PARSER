package Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OKVED2List")
public class Okved2List extends AbstractModel {
    @Column(name = "SparkID")
    private String SparkID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Code")
    private String code;

    @Column(name = "curr")
    private String curr;

    @Column(name = "IsMain")
    private String isMain;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public Okved2List() {
    }

    public String getSparkID() {
        return SparkID;
    }

    public void setSparkID(String sparkID) {
        SparkID = sparkID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public String getIsMain() {
        return isMain;
    }

    public void setIsMain(String isMain) {
        this.isMain = isMain;
    }

    public String getLastchgdatetime() {
        return lastchgdatetime;
    }

    public void setLastchgdatetime(String lastchgdatetime) {
        this.lastchgdatetime = lastchgdatetime;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }
}
