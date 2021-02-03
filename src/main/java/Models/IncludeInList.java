package Models;

import javax.persistence.*;

@Entity
@Table(name = "IncludeInList")
public class IncludeInList extends AbstractModel{

    @Column(name = "SparkID")
    private String SparkID;

    @Column(name = "InListID")
    private String inListId;

    @Column(name = "Text")
    private String text;

    @Column(name = "IsNegative")
    private String isNegative;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public IncludeInList() {
    }

    public IncludeInList(String sparkID, String inListId, String text, String isNegative, String lastchgdatetime, String curr, String GUID) {
        this.SparkID = sparkID;
        this.inListId = inListId;
        this.text = text;
        this.isNegative = isNegative;
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

    public String getInListId() {
        return inListId;
    }

    public void setInListId(String inListId) {
        this.inListId = inListId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIsNegative() {
        return isNegative;
    }

    public void setIsNegative(String isNegative) {
        this.isNegative = isNegative;
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
        return "IncludeInList{" +
                "SparkID='" + SparkID + '\'' +
                ", inListId='" + inListId + '\'' +
                ", text='" + text + '\'' +
                ", isNegative='" + isNegative + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
