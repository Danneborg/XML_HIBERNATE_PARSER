package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PhoneList")
public class PhoneList extends AbstractModel {

    @Column(name = "sparkid")
    private String sparkId;

    @Column(name = "Code")
    private String code;

    @Column(name = "Number")
    private String number;

    @Column(name = "Status")
    private String status;

    @Column(name = "VerificationDate")
    private String verificationDate;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public PhoneList() {
    }

    public PhoneList(String sparkId, String code, String number, String status, String verificationDate, String lastchgdatetime, String curr, String GUID) {
        this.sparkId = sparkId;
        this.code = code;
        this.number = number;
        this.status = status;
        this.verificationDate = verificationDate;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(String verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getSparkId() {
        return sparkId;
    }

    public void setSparkId(String sparkId) {
        this.sparkId = sparkId;
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
        return "PhoneList{" +
                "sparkId='" + sparkId + '\'' +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", status='" + status + '\'' +
                ", verificationDate='" + verificationDate + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
