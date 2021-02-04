package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CompanyWithsameInfo_PhoneList")
public class CompanyWithsameInfoPhoneList extends AbstractModel {

    @Column(name = "Code")
    private String code;

    @Column(name = "Number")
    private String number;

    @Column(name = "Value")
    private String value;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Column(name = "CompanyWithSameInfoGUID")
    private String companyWithsameInfoGUID;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public CompanyWithsameInfoPhoneList() {
    }

    public CompanyWithsameInfoPhoneList(String code, String number, String value, String lastchgdatetime, String curr, String companyWithsameInfoGUID, String GUID) {
        this.code = code;
        this.number = number;
        this.value = value;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.companyWithsameInfoGUID = companyWithsameInfoGUID;
        this.GUID = GUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getCompanyWithsameInfoGUID() {
        return companyWithsameInfoGUID;
    }

    public void setCompanyWithsameInfoGUID(String companyWithsameInfoGUID) {
        this.companyWithsameInfoGUID = companyWithsameInfoGUID;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }
}
