package project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leaderlist")
public class LeaderList extends AbstractModel{

    @Column(name = "sparkid")
    private String sparkId;

    @Column(name = "Position")
    private String position;

    @Column(name = "INN")
    private String inn;

    @Column(name = "ManagementCompany")
    private String managementCompany;

    @Column(name = "ManagementCompanyINN")
    private String managementCompanyINN;

    @Column(name = "ActualDate")
    private String actualDate;

    @Column(name = "FIO")
    private String fio;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public LeaderList() {
    }

    public LeaderList(String sparkId, String position, String inn, String managementCompany, String managementCompanyINN, String actualDate, String fio, String lastchgdatetime, String curr, String GUID) {
        this.sparkId = sparkId;
        this.position = position;
        this.inn = inn;
        this.managementCompany = managementCompany;
        this.managementCompanyINN = managementCompanyINN;
        this.actualDate = actualDate;
        this.fio = fio;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getManagementCompany() {
        return managementCompany;
    }

    public void setManagementCompany(String managementCompany) {
        this.managementCompany = managementCompany;
    }

    public String getManagementCompanyINN() {
        return managementCompanyINN;
    }

    public void setManagementCompanyINN(String managementCompanyINN) {
        this.managementCompanyINN = managementCompanyINN;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
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
        return "LeaderList{" +
                "sparkId='" + sparkId + '\'' +
                ", position='" + position + '\'' +
                ", inn='" + inn + '\'' +
                ", managementCompany='" + managementCompany + '\'' +
                ", managementCompanyINN='" + managementCompanyINN + '\'' +
                ", actualDate='" + actualDate + '\'' +
                ", fio='" + fio + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
