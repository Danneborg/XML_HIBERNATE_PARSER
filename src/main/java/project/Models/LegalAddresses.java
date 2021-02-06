package project.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "legaladdresses")
public class LegalAddresses extends AbstractModel {

    @Column(name = "SparkID")
    private String sparkID;

    @Column(name = "Housing")
    private String housing;

    @Column(name = "Block")
    private String block;

    @Column(name = "BlockType")
    private String blockType;

    @Column(name = "BuildingType")
    private String buildingType;

    @Column(name = "BusinessCenterName")
    private String businessCenterName;

    @Column(name = "HousingType")
    private String housingType;

    @Column(name = "Room")
    private String room;

    @Column(name = "RoomType")
    private String roomType;

    @Column(name = "ActualDate")
    private String actualDate;

    @Column(name = "Address")
    private String address;

    @Column(name = "BuildingNumber")
    private String buildingNumber;

    @Column(name = "City")
    private String city;

    @Column(name = "FiasArea")
    private String fiasArea;

    @Column(name = "FiasCity")
    private String fiasCity;

    @Column(name = "FiasCode")
    private String fiasCode;

    @Column(name = "FiasGUID")
    private String fiasGUID;

    @Column(name = "FiasPlace")
    private String fiasPlace;

    @Column(name = "FiasPlan")
    private String fiasPlan;

    @Column(name = "FiasRegion")
    private String fiasRegion;

    @Column(name = "FiasStreet")
    private String fiasStreet;

    @Column(name = "PostCode")
    private String postCode;

    @Column(name = "Rayon")
    private String rayon;

    @Column(name = "Region")
    private String region;

    @Column(name = "StreetName")
    private String streetName;

    @Column(name = "lastchgdatetime")
    private String lastchgdatetime;

    @Column(name = "curr")
    private String curr;

    @Id
    @Column(name = "GUID")
    private String GUID;


    public LegalAddresses() {
    }

    public String getSparkID() {
        return sparkID;
    }

    public void setSparkID(String sparkID) {
        this.sparkID = sparkID;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getBlockType() {
        return blockType;
    }

    public void setBlockType(String blockType) {
        this.blockType = blockType;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getBusinessCenterName() {
        return businessCenterName;
    }

    public void setBusinessCenterName(String businessCenterName) {
        this.businessCenterName = businessCenterName;
    }

    public String getHousingType() {
        return housingType;
    }

    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFiasArea() {
        return fiasArea;
    }

    public void setFiasArea(String fiasArea) {
        this.fiasArea = fiasArea;
    }

    public String getFiasCity() {
        return fiasCity;
    }

    public void setFiasCity(String fiasCity) {
        this.fiasCity = fiasCity;
    }

    public String getFiasCode() {
        return fiasCode;
    }

    public void setFiasCode(String fiasCode) {
        this.fiasCode = fiasCode;
    }

    public String getFiasGUID() {
        return fiasGUID;
    }

    public void setFiasGUID(String fiasGUID) {
        this.fiasGUID = fiasGUID;
    }

    public String getFiasPlace() {
        return fiasPlace;
    }

    public void setFiasPlace(String fiasPlace) {
        this.fiasPlace = fiasPlace;
    }

    public String getFiasPlan() {
        return fiasPlan;
    }

    public void setFiasPlan(String fiasPlan) {
        this.fiasPlan = fiasPlan;
    }

    public String getFiasRegion() {
        return fiasRegion;
    }

    public void setFiasRegion(String fiasRegion) {
        this.fiasRegion = fiasRegion;
    }

    public String getFiasStreet() {
        return fiasStreet;
    }

    public void setFiasStreet(String fiasStreet) {
        this.fiasStreet = fiasStreet;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getRayon() {
        return rayon;
    }

    public void setRayon(String rayon) {
        this.rayon = rayon;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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
