package project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FederalTaxRegistrationCurrent")
public class FederalTaxRegistrationCurrent extends AbstractModel {
    @Column(name = "SparkID")
    private String SparkID;

    @Column(name = "RegAuthority")
    private String regAuthority;

    @Column(name = "RegAuthorityAddress")
    private String regAuthorityAddress;

    @Column(name = "RegAuthorityCode")
    private String regAuthorityCode;

    @Column(name = "RegDate")
    private String regDate;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public FederalTaxRegistrationCurrent() {
    }

    public FederalTaxRegistrationCurrent(String sparkID, String regAuthority, String regAuthorityAddress, String regAuthorityCode, String regDate, String lastchgdatetime, String curr, String GUID) {
        SparkID = sparkID;
        this.regAuthority = regAuthority;
        this.regAuthorityAddress = regAuthorityAddress;
        this.regAuthorityCode = regAuthorityCode;
        this.regDate = regDate;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.GUID = GUID;
    }

    public String getSparkID() {
        return SparkID;
    }

    public void setSparkID(String sparkID) {
        SparkID = sparkID;
    }

    public String getRegAuthority() {
        return regAuthority;
    }

    public void setRegAuthority(String regAuthority) {
        this.regAuthority = regAuthority;
    }

    public String getRegAuthorityAddress() {
        return regAuthorityAddress;
    }

    public void setRegAuthorityAddress(String regAuthorityAddress) {
        this.regAuthorityAddress = regAuthorityAddress;
    }

    public String getRegAuthorityCode() {
        return regAuthorityCode;
    }

    public void setRegAuthorityCode(String regAuthorityCode) {
        this.regAuthorityCode = regAuthorityCode;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
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
        return "FederalTaxRegistrationCurrent{" +
                "SparkID='" + SparkID + '\'' +
                ", regAuthority='" + regAuthority + '\'' +
                ", regAuthorityAddress='" + regAuthorityAddress + '\'' +
                ", regAuthorityCode='" + regAuthorityCode + '\'' +
                ", regDate='" + regDate + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
