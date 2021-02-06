package project.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StructureInfo")
public class StructureInfo extends AbstractModel {

    @Column(name = "SparkID")
    private String sparkID;

    @Column(name = "CountCoownerFCSM")
    private String countCoownerFCSM;

    @Column(name = "CountCoownerRosstat")
    private String countCoownerRosstat;

    @Column(name = "CountCoownerEGRUL")
    private String countCoownerEGRUL;

    @Column(name = "CountBranch")
    private String countBranch;

    @Column(name = "CountBranchRosstat")
    private String countBranchRosstat;

    @Column(name = "CountBranchEGRUL")
    private String countBranchEGRUL;

    @Column(name = "CountAffiliatedCompanyFCSM")
    private String countAffiliatedCompanyFCSM;

    @Column(name = "CountAffiliatedCompanyRosstat")
    private String countAffiliatedCompanyRosstat;

    @Column(name = "CountAffiliatedCompanyEGRUL")
    private String countAffiliatedCompanyEGRUL;

    @Column(name = "NonprofitOrganizationRosstat")
    private String nonprofitOrganizationRosstat;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    public StructureInfo() {
    }

    public StructureInfo(String sparkID, String countCoownerFCSM, String countCoownerRosstat, String countCoownerEGRUL, String countBranch, String countBranchRosstat, String countBranchEGRUL, String countAffiliatedCompanyFCSM, String countAffiliatedCompanyRosstat, String countAffiliatedCompanyEGRUL, String nonprofitOrganizationRosstat, String lastchgdatetime, String curr, String GUID) {
        this.sparkID = sparkID;
        this.countCoownerFCSM = countCoownerFCSM;
        this.countCoownerRosstat = countCoownerRosstat;
        this.countCoownerEGRUL = countCoownerEGRUL;
        this.countBranch = countBranch;
        this.countBranchRosstat = countBranchRosstat;
        this.countBranchEGRUL = countBranchEGRUL;
        this.countAffiliatedCompanyFCSM = countAffiliatedCompanyFCSM;
        this.countAffiliatedCompanyRosstat = countAffiliatedCompanyRosstat;
        this.countAffiliatedCompanyEGRUL = countAffiliatedCompanyEGRUL;
        this.nonprofitOrganizationRosstat = nonprofitOrganizationRosstat;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.GUID = GUID;
    }

    public String getSparkID() {
        return sparkID;
    }

    public void setSparkID(String sparkID) {
        this.sparkID = sparkID;
    }

    public String getCountCoownerFCSM() {
        return countCoownerFCSM;
    }

    public void setCountCoownerFCSM(String countCoownerFCSM) {
        this.countCoownerFCSM = countCoownerFCSM;
    }

    public String getCountCoownerRosstat() {
        return countCoownerRosstat;
    }

    public void setCountCoownerRosstat(String countCoownerRosstat) {
        this.countCoownerRosstat = countCoownerRosstat;
    }

    public String getCountCoownerEGRUL() {
        return countCoownerEGRUL;
    }

    public void setCountCoownerEGRUL(String countCoownerEGRUL) {
        this.countCoownerEGRUL = countCoownerEGRUL;
    }

    public String getCountBranch() {
        return countBranch;
    }

    public void setCountBranch(String countBranch) {
        this.countBranch = countBranch;
    }

    public String getCountBranchRosstat() {
        return countBranchRosstat;
    }

    public void setCountBranchRosstat(String countBranchRosstat) {
        this.countBranchRosstat = countBranchRosstat;
    }

    public String getCountBranchEGRUL() {
        return countBranchEGRUL;
    }

    public void setCountBranchEGRUL(String countBranchEGRUL) {
        this.countBranchEGRUL = countBranchEGRUL;
    }

    public String getCountAffiliatedCompanyFCSM() {
        return countAffiliatedCompanyFCSM;
    }

    public void setCountAffiliatedCompanyFCSM(String countAffiliatedCompanyFCSM) {
        this.countAffiliatedCompanyFCSM = countAffiliatedCompanyFCSM;
    }

    public String getCountAffiliatedCompanyRosstat() {
        return countAffiliatedCompanyRosstat;
    }

    public void setCountAffiliatedCompanyRosstat(String countAffiliatedCompanyRosstat) {
        this.countAffiliatedCompanyRosstat = countAffiliatedCompanyRosstat;
    }

    public String getCountAffiliatedCompanyEGRUL() {
        return countAffiliatedCompanyEGRUL;
    }

    public void setCountAffiliatedCompanyEGRUL(String countAffiliatedCompanyEGRUL) {
        this.countAffiliatedCompanyEGRUL = countAffiliatedCompanyEGRUL;
    }

    public String getNonprofitOrganizationRosstat() {
        return nonprofitOrganizationRosstat;
    }

    public void setNonprofitOrganizationRosstat(String nonprofitOrganizationRosstat) {
        this.nonprofitOrganizationRosstat = nonprofitOrganizationRosstat;
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
        return "StructureInfo{" +
                "sparkID='" + sparkID + '\'' +
                ", countCoownerFCSM='" + countCoownerFCSM + '\'' +
                ", countCoownerRosstat='" + countCoownerRosstat + '\'' +
                ", countCoownerEGRUL='" + countCoownerEGRUL + '\'' +
                ", countBranch='" + countBranch + '\'' +
                ", countBranchRosstat='" + countBranchRosstat + '\'' +
                ", countBranchEGRUL='" + countBranchEGRUL + '\'' +
                ", countAffiliatedCompanyFCSM='" + countAffiliatedCompanyFCSM + '\'' +
                ", countAffiliatedCompanyRosstat='" + countAffiliatedCompanyRosstat + '\'' +
                ", countAffiliatedCompanyEGRUL='" + countAffiliatedCompanyEGRUL + '\'' +
                ", nonprofitOrganizationRosstat='" + nonprofitOrganizationRosstat + '\'' +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                '}';
    }
}
