package project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ExecutiveBodyMember")
public class ExecutiveBodyMember extends AbstractModel {

    @Column(name = "ExecutiveBodyGUID")
    private String executiveBodyGUID;

    @Column(name = "SharePart")
    private String sharePart;

    @Column(name = "INN")
    private String INN;

    @Column(name = "BirthdayYear")
    private String birthdayYear;

    @Column(name = "Name")
    private String name;

    @Column(name = "Position")
    private String position;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public ExecutiveBodyMember() {
    }

    public ExecutiveBodyMember(String executiveBodyGUID, String sharePart, String INN, String birthdayYear, String name, String position, String lastchgdatetime, String curr, String GUID) {
        this.executiveBodyGUID = executiveBodyGUID;
        this.sharePart = sharePart;
        this.INN = INN;
        this.birthdayYear = birthdayYear;
        this.name = name;
        this.position = position;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.GUID = GUID;
    }

    public String getExecutiveBodyGUID() {
        return executiveBodyGUID;
    }

    public void setExecutiveBodyGUID(String executiveBodyGUID) {
        this.executiveBodyGUID = executiveBodyGUID;
    }

    public String getSharePart() {
        return sharePart;
    }

    public void setSharePart(String sharePart) {
        this.sharePart = sharePart;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(String birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        return "ExecutiveBodyMember{" +
                "executiveBodyGUID='" + executiveBodyGUID + '\'' +
                ", sharePart='" + sharePart + '\'' +
                ", INN='" + INN + '\'' +
                ", birthdayYear='" + birthdayYear + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
