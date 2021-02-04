package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CompanyWithsameInfo")
public class CompanyWithsameInfo extends AbstractModel {

    @Column(name = "SparkID")
    private String sparkid;

    @Column(name = "AddressCount")
    private int addressCount;

    @Column(name = "AddressFTSCount")
    private int addressFTSCount;

    @Column(name = "AddressNotAffiliatedCount")
    private int addressNotAffiliatedCount;

    @Column(name = "AddressWithoutRoomCount")
    private int addressWithoutRoomCount;

    @Column(name = "ManagerCountInCountry")
    private int managerCountInCountry;

    @Column(name = "ManagerCountInRegion")
    private int managerCountInRegion;

    @Column(name = "ManagerInnCount")
    private int managerInnCount;

    @Column(name = "Value")
    private int value;

    @Column(name = "PhoneCode")
    private String phoneCode;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public CompanyWithsameInfo() {
    }

    public CompanyWithsameInfo(String sparkid, int addressCount, int addressFTSCount, int addressNotAffiliatedCount, int addressWithoutRoomCount, int managerCountInCountry, int managerCountInRegion, int managerInnCount, int value, String phoneCode, String phoneNumber, String lastchgdatetime, String curr, String GUID) {
        this.sparkid = sparkid;
        this.addressCount = addressCount;
        this.addressFTSCount = addressFTSCount;
        this.addressNotAffiliatedCount = addressNotAffiliatedCount;
        this.addressWithoutRoomCount = addressWithoutRoomCount;
        this.managerCountInCountry = managerCountInCountry;
        this.managerCountInRegion = managerCountInRegion;
        this.managerInnCount = managerInnCount;
        this.value = value;
        this.phoneCode = phoneCode;
        this.phoneNumber = phoneNumber;
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

    public int getAddressCount() {
        return addressCount;
    }

    public void setAddressCount(int addressCount) {
        this.addressCount = addressCount;
    }

    public int getAddressFTSCount() {
        return addressFTSCount;
    }

    public void setAddressFTSCount(int addressFTSCount) {
        this.addressFTSCount = addressFTSCount;
    }

    public int getAddressNotAffiliatedCount() {
        return addressNotAffiliatedCount;
    }

    public void setAddressNotAffiliatedCount(int addressNotAffiliatedCount) {
        this.addressNotAffiliatedCount = addressNotAffiliatedCount;
    }

    public int getAddressWithoutRoomCount() {
        return addressWithoutRoomCount;
    }

    public void setAddressWithoutRoomCount(int addressWithoutRoomCount) {
        this.addressWithoutRoomCount = addressWithoutRoomCount;
    }

    public int getManagerCountInCountry() {
        return managerCountInCountry;
    }

    public void setManagerCountInCountry(int managerCountInCountry) {
        this.managerCountInCountry = managerCountInCountry;
    }

    public int getManagerCountInRegion() {
        return managerCountInRegion;
    }

    public void setManagerCountInRegion(int managerCountInRegion) {
        this.managerCountInRegion = managerCountInRegion;
    }

    public int getManagerInnCount() {
        return managerInnCount;
    }

    public void setManagerInnCount(int managerInnCount) {
        this.managerInnCount = managerInnCount;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
