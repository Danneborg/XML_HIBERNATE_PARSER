package Creators;

import Models.AbstractModel;
import Models.AdjustAddress;
import Models.LegalAddresses;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class LegalAddressesCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> legalAddressLists = new ArrayList<>();

        if (element.children().size() > 0) {
            for (Element address : element.children()) {

                LegalAddresses legalAddresses = new LegalAddresses();

                legalAddresses.setSparkID(sparkid);

                legalAddresses.setHousing(NodeCreatorUtil.getJsoupElemAttrib(address, "Housing"));

                legalAddresses.setBlock(NodeCreatorUtil.getJsoupElemAttrib(address, "Block"));

                legalAddresses.setBlockType(NodeCreatorUtil.getJsoupElemAttrib(address, "BlockType"));

                legalAddresses.setBuildingType(NodeCreatorUtil.getJsoupElemAttrib(address, "BuildingType"));

                legalAddresses.setBusinessCenterName(NodeCreatorUtil.getJsoupElemAttrib(address, "BusinessCenterName"));

                legalAddresses.setHousingType(NodeCreatorUtil.getJsoupElemAttrib(address, "HousingType"));

                legalAddresses.setRoom(NodeCreatorUtil.getJsoupElemAttrib(address, "Room"));

                legalAddresses.setRoomType(NodeCreatorUtil.getJsoupElemAttrib(address, "RoomType"));

                legalAddresses.setActualDate(NodeCreatorUtil.getJsoupElemAttrib(address, "ActualDate"));

                legalAddresses.setAddress(NodeCreatorUtil.getJsoupElemAttrib(address, "Address"));

                legalAddresses.setBuildingNumber(NodeCreatorUtil.getJsoupElemAttrib(address, "BuildingNumber"));

                legalAddresses.setCity(NodeCreatorUtil.getJsoupElemAttrib(address, "City"));

                legalAddresses.setFiasArea(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasArea"));

                legalAddresses.setFiasCity(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasCity"));

                legalAddresses.setFiasCode(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasCode"));

                legalAddresses.setFiasGUID(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasGUID"));

                legalAddresses.setFiasPlace(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasPlace"));

                legalAddresses.setFiasPlan(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasPlan"));

                legalAddresses.setFiasRegion(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasRegion"));

                legalAddresses.setFiasStreet(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasStreet"));

                legalAddresses.setPostCode(NodeCreatorUtil.getJsoupElemAttrib(address, "PostCode"));

                legalAddresses.setRayon(NodeCreatorUtil.getJsoupElemAttrib(address, "Rayon"));

                legalAddresses.setRegion(NodeCreatorUtil.getJsoupElemAttrib(address, "Region"));

                legalAddresses.setStreetName(NodeCreatorUtil.getJsoupElemAttrib(address, "StreetName"));

                legalAddresses.setLastchgdatetime(TimeStamp.getTimeStamp());

                legalAddresses.setCurr("1");

                legalAddresses.setGUID(NodeCreatorUtil.createGuid());

                legalAddressLists.add(legalAddresses);

            }
        }


        return legalAddressLists;
    }
}
