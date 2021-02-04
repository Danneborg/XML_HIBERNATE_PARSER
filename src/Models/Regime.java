package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Regime")
public class Regime extends AbstractModel {


    @Column(name = "SpecialTaxRegimesGUID")
    private String specialTaxRegimesGUID;

    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;



    public Regime() {
    }

    public Regime(String specialTaxRegimesGUID, String code, String name, String lastchgdatetime, String curr, String GUID) {
        this.specialTaxRegimesGUID = specialTaxRegimesGUID;
        this.code = code;
        this.name = name;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.GUID = GUID;
    }

    public String getSpecialTaxRegimesGUID() {
        return specialTaxRegimesGUID;
    }

    public void setSpecialTaxRegimesGUID(String specialTaxRegimesGUID) {
        this.specialTaxRegimesGUID = specialTaxRegimesGUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Regime{" +
                "specialTaxRegimesGUID='" + specialTaxRegimesGUID + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
