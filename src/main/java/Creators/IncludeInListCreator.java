package Creators;

import Models.AbstractModel;
import Models.IncludeInList;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class IncludeInListCreator implements Create {


    public IncludeInListCreator() {

    }

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> includeInLists = new ArrayList<>();
        Element includeInListElements = element;
        if (includeInListElements.children().size() > 0) {

            for (org.jsoup.nodes.Element list : includeInListElements.children()) {

                IncludeInList includeInList = new IncludeInList();

                includeInList.setSparkID(sparkid);

                includeInList.setInListId(list.attr("Id"));

                includeInList.setText(list.ownText());

                includeInList.setIsNegative(list.attr("IsNegative"));

                includeInList.setGUID(NodeCreatorUtil.createGuid());

                includeInList.setCurr("1");

                includeInList.setLastchgdatetime(TimeStamp.getTimeStamp());

                includeInLists.add(includeInList);
            }
        }
        return includeInLists;
    }
}