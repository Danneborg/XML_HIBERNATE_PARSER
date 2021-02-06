package project.Creators;

import project.Models.AbstractModel;
import project.Models.AdjustAddress;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class AdjustAddressesCreator implements Create {

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> adjustAddressesCreatorList = new ArrayList<>();

        if (element.children().size() > 0) {

            for (Element address : element.children()) {
                AdjustAddress adjustAddress = new AdjustAddress();

                adjustAddress.setSparkID(sparkid);

                adjustAddress.setHousing(NodeCreatorUtil.getJsoupElemAttrib(address, "Housing"));

                adjustAddress.setBlock(NodeCreatorUtil.getJsoupElemAttrib(address, "Block"));

                adjustAddress.setBlockType(NodeCreatorUtil.getJsoupElemAttrib(address, "BlockType"));

                adjustAddress.setBuildingType(NodeCreatorUtil.getJsoupElemAttrib(address, "BuildingType"));

                adjustAddress.setBusinessCenterName(NodeCreatorUtil.getJsoupElemAttrib(address, "BusinessCenterName"));

                adjustAddress.setHousingType(NodeCreatorUtil.getJsoupElemAttrib(address, "HousingType"));

                adjustAddress.setRoom(NodeCreatorUtil.getJsoupElemAttrib(address, "Room"));

                adjustAddress.setRoomType(NodeCreatorUtil.getJsoupElemAttrib(address, "RoomType"));

                adjustAddress.setActualDate(NodeCreatorUtil.getJsoupElemAttrib(address, "ActualDate"));

                adjustAddress.setAddress(NodeCreatorUtil.getJsoupElemAttrib(address, "Address"));

                adjustAddress.setBuildingNumber(NodeCreatorUtil.getJsoupElemAttrib(address, "BuildingNumber"));

                adjustAddress.setCity(NodeCreatorUtil.getJsoupElemAttrib(address, "City"));

                adjustAddress.setFiasArea(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasArea"));

                adjustAddress.setFiasCity(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasCity"));

                adjustAddress.setFiasCode(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasCode"));

                adjustAddress.setFiasGUID(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasGUID"));

                adjustAddress.setFiasPlace(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasPlace"));

                adjustAddress.setFiasPlan(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasPlan"));

                adjustAddress.setFiasRegion(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasRegion"));

                adjustAddress.setFiasStreet(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasStreet"));

                adjustAddress.setPostCode(NodeCreatorUtil.getJsoupElemAttrib(address, "PostCode"));

                adjustAddress.setRayon(NodeCreatorUtil.getJsoupElemAttrib(address, "Rayon"));

                adjustAddress.setRegion(NodeCreatorUtil.getJsoupElemAttrib(address, "Region"));

                adjustAddress.setStreetName(NodeCreatorUtil.getJsoupElemAttrib(address, "StreetName"));

                adjustAddress.setLastchgdatetime(TimeStamp.getTimeStamp());

                adjustAddress.setCurr("1");

                adjustAddress.setGUID(NodeCreatorUtil.createGuid());

                adjustAddressesCreatorList.add(adjustAddress);
            }
        }

        return adjustAddressesCreatorList;
    }
}
