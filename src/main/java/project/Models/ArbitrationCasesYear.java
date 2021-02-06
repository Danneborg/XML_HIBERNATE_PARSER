package project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ArbitrationCases_Year")
public class ArbitrationCasesYear extends AbstractModel {

    @Column(name = "Year")
    private int year;

    @Column(name = "Defendant_CasesNumber")
    private float defendantCasesNumber;

    @Column(name = "Defendant_Sum")
    private String defendantSum;

    @Column(name = "Plaintiff_CasesNumber")
    private float plaintiffCasesNumber;

    @Column(name = "Plaintiff_Sum")
    private String plaintiffSum;

    @Column(name = "ThirdOrOtherPerson_CasesNumber")
    private float thirdOrOtherPersonCasesNumber;


    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;

    @Column(name = "ArbitrationCasesGUID")
    private String arbitrationCasesGUID;

    public ArbitrationCasesYear() {
    }

    public ArbitrationCasesYear(int year, int defendantCasesNumber, String defendantSum, int plaintiffCasesNumber, String plaintiffSum, int thirdOrOtherPersonCasesNumber, String lastchgdatetime, String curr, String GUID, String arbitrationCasesGUID) {
        this.year = year;
        this.defendantCasesNumber = defendantCasesNumber;
        this.defendantSum = defendantSum;
        this.plaintiffCasesNumber = plaintiffCasesNumber;
        this.plaintiffSum = plaintiffSum;
        this.thirdOrOtherPersonCasesNumber = thirdOrOtherPersonCasesNumber;
        this.lastchgdatetime = lastchgdatetime;
        this.curr = curr;
        this.GUID = GUID;
        this.arbitrationCasesGUID = arbitrationCasesGUID;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getDefendantCasesNumber() {
        return defendantCasesNumber;
    }

    public void setDefendantCasesNumber(float defendantCasesNumber) {
        this.defendantCasesNumber = defendantCasesNumber;
    }

    public String getDefendantSum() {
        return defendantSum;
    }

    public void setDefendantSum(String defendantSum) {
        this.defendantSum = defendantSum;
    }

    public float getPlaintiffCasesNumber() {
        return plaintiffCasesNumber;
    }

    public void setPlaintiffCasesNumber(float plaintiffCasesNumber) {
        this.plaintiffCasesNumber = plaintiffCasesNumber;
    }

    public String getPlaintiffSum() {
        return plaintiffSum;
    }

    public void setPlaintiffSum(String plaintiffSum) {
        this.plaintiffSum = plaintiffSum;
    }

    public float getThirdOrOtherPersonCasesNumber() {
        return thirdOrOtherPersonCasesNumber;
    }

    public void setThirdOrOtherPersonCasesNumber(float thirdOrOtherPersonCasesNumber) {
        this.thirdOrOtherPersonCasesNumber = thirdOrOtherPersonCasesNumber;
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

    public String getArbitrationCasesGUID() {
        return arbitrationCasesGUID;
    }

    public void setArbitrationCasesGUID(String arbitrationCasesGUID) {
        this.arbitrationCasesGUID = arbitrationCasesGUID;
    }

    @Override
    public String toString() {
        return "ArbitrationCasesYear{" +
                "  year=" + year +
                ", defendantCasesNumber=" + defendantCasesNumber +
                ", defendantSum=" + defendantSum +
                ", plaintiffCasesNumber=" + plaintiffCasesNumber +
                ", plaintiffSum=" + plaintiffSum +
                ", thirdOrOtherPersonCasesNumber=" + thirdOrOtherPersonCasesNumber +
                ", lastchgdatetime='" + lastchgdatetime + '\'' +
                ", curr='" + curr + '\'' +
                ", GUID='" + GUID + '\'' +
                ", arbitrationCasesGUID='" + arbitrationCasesGUID + '\'' +
                '}';
    }
}
