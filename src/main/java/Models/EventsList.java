package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EventsList")
public class EventsList extends AbstractModel {
    @Column(name = "sparkid")
    private String sparkId;

    @Column(name = "EventDate")
    private String eventDate;

    @Column(name = "EventTypeDescription")
    private String eventTypeDescription;

    @Column(name = "EventTypeId")
    private int eventTypeId;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public EventsList() {
    }

    public EventsList(String sparkId, String eventDate, String eventTypeDescription, int eventTypeId, String lastchgdatetime, String curr, String GUID) {
        this.sparkId = sparkId;
        this.eventDate = eventDate;
        this.eventTypeDescription = eventTypeDescription;
        this.eventTypeId = eventTypeId;
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

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTypeDescription() {
        return eventTypeDescription;
    }

    public void setEventTypeDescription(String eventTypeDescription) {
        this.eventTypeDescription = eventTypeDescription;
    }

    public int getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
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
        return "EventsList{" +
                "sparkId='" + sparkId + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", eventTypeDescription='" + eventTypeDescription + '\'' +
                ", eventTypeId=" + eventTypeId +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
