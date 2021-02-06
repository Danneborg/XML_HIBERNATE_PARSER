package project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Parsing_XML_Stat")
public class ParsingXMLStat extends AbstractModel{

    @Column(name = "sparkid")
    private String sparkId;

    @Column(name = "NodeNamesToChange")
    private String nodeNamesToChange;

    @Column(name = "NodeNamesToChangeSize")
    private String nodeNamesToChangeSize;


    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public ParsingXMLStat() {
    }

    public ParsingXMLStat(String sparkId, String nodeNamesToChange, String nodeNamesToChangeSize, String lastchgdatetime, String GUID) {
        this.sparkId = sparkId;
        this.nodeNamesToChange = nodeNamesToChange;
        this.nodeNamesToChangeSize = nodeNamesToChangeSize;
        this.lastchgdatetime = lastchgdatetime;
        this.GUID = GUID;
    }

    public String getSparkId() {
        return sparkId;
    }

    public void setSparkId(String sparkId) {
        this.sparkId = sparkId;
    }

    public String getNodeNamesToChange() {
        return nodeNamesToChange;
    }

    public void setNodeNamesToChange(String nodeNamesToChange) {
        this.nodeNamesToChange = nodeNamesToChange;
    }

    public String getNodeNamesToChangeSize() {
        return nodeNamesToChangeSize;
    }

    public void setNodeNamesToChangeSize(String nodeNamesToChangeSize) {
        this.nodeNamesToChangeSize = nodeNamesToChangeSize;
    }

    public String getLastchgdatetime() {
        return lastchgdatetime;
    }

    public void setLastchgdatetime(String lastchgdatetime) {
        this.lastchgdatetime = lastchgdatetime;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    @Override
    public String toString() {
        return "ParsingXMLStat{" +
                "sparkId='" + sparkId + '\'' +
                ", nodeNamesToChange='" + nodeNamesToChange + '\'' +
                ", nodeNamesToChangeSize='" + nodeNamesToChangeSize + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
