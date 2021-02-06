package project.Creators;

import project.Models.AbstractModel;
import project.Models.PreviousAddress;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class PreviousAddressCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> previousAddressList = new ArrayList<>();

        if (element.children().size() > 0) {
            for (Element address : element.children()) {
                PreviousAddress previousAddress = new PreviousAddress();

                previousAddress.setSparkID(sparkid);

                previousAddress.setActualDate(NodeCreatorUtil.getJsoupElemAttrib(address, "ActualDate"));

                previousAddress.setAddress(NodeCreatorUtil.getJsoupElemAttrib(address, "Address"));

                previousAddress.setBuildingNumber(NodeCreatorUtil.getJsoupElemAttrib(address, "BuildingNumber"));

                previousAddress.setCity(NodeCreatorUtil.getJsoupElemAttrib(address, "City"));

                previousAddress.setFiasArea(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasArea"));

                previousAddress.setFiasCity(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasCity"));

                previousAddress.setFiasCode(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasCode"));

                previousAddress.setFiasGUID(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasGUID"));

                previousAddress.setFiasPlace(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasPlace"));

                previousAddress.setFiasPlan(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasPlan"));

                previousAddress.setFiasRegion(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasRegion"));

                previousAddress.setFiasStreet(NodeCreatorUtil.getJsoupElemAttrib(address, "FiasStreet"));

                previousAddress.setPostCode(NodeCreatorUtil.getJsoupElemAttrib(address, "PostCode"));

                previousAddress.setRayon(NodeCreatorUtil.getJsoupElemAttrib(address, "Rayon"));

                previousAddress.setRegion(NodeCreatorUtil.getJsoupElemAttrib(address, "Region"));

                previousAddress.setStreetName(NodeCreatorUtil.getJsoupElemAttrib(address, "StreetName"));

                previousAddress.setLastchgdatetime(TimeStamp.getTimeStamp());

                previousAddress.setCurr("1");

                previousAddress.setGUID(NodeCreatorUtil.createGuid());

                previousAddressList.add(previousAddress);

            }

        }
        return previousAddressList;
    }
}
