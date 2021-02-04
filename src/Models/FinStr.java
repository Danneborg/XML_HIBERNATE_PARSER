package Models;

import javax.persistence.*;

@Entity
@Table(name = "finstr")
public class FinStr extends AbstractModel{

    @Column(name = "code")
    private String code;

    @Column(name = "form")
    private String form;

    @Column(name = "idfinpok")
    private int idFinPok;

    @Column(name = "name")
    private String name;

    @Column(name = "section")
    private String section;

    @Column(name = "value")
    private String value;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    @Column(name = "finperiodguid")
    private String finPeriodGUID;

    public FinStr() {
    }

    public FinStr(String code, String form, int idFinPok, String name, String section, String value, String lastchgdatetime, String curr, String GUID) {
        this.code = code;
        this.form = form;
        this.idFinPok = idFinPok;
        this.name = name;
        this.section = section;
        this.value = value;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.GUID = GUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getIdFinPok() {
        return idFinPok;
    }

    public void setIdFinPok(int idFinPok) {
        this.idFinPok = idFinPok;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
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

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public String getFinPeriodGUID() {
        return finPeriodGUID;
    }

    public void setFinPeriodGUID(String finPeriodGUID) {
        this.finPeriodGUID = finPeriodGUID;
    }
}
