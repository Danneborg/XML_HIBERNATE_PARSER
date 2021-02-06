package project.Creators;


import project.Models.AbstractModel;
import project.Models.StaffNumberFTS;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class StaffNumberFTSCreator implements Create {

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {

        List<AbstractModel> staffNumberFTSList = new ArrayList<>();

        if (element.children().size() > 0) {

            element.children().forEach((i) -> {
                StaffNumberFTS staffNumberFTS = new StaffNumberFTS();

                staffNumberFTS.setSparkID(sparkid);

                staffNumberFTS.setActualDate(NodeCreatorUtil.getJsoupElemAttrib(i,"ActualDate"));

                staffNumberFTS.setValue((NodeCreatorUtil.getJsoupElemText(i)));

                staffNumberFTS.setLastchgdatetime(TimeStamp.getTimeStamp());

                staffNumberFTS.setCurr("1");

                staffNumberFTS.setGUID(NodeCreatorUtil.createGuid());

                staffNumberFTSList.add(staffNumberFTS);
            });

        }

        return staffNumberFTSList;
    }
}
