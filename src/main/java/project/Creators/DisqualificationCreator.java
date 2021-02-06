package project.Creators;

import project.Models.AbstractModel;
import project.Models.Disqualification;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class DisqualificationCreator implements Create {

    private String parentGUID;

    public DisqualificationCreator(String parentGUID) {
        this.parentGUID = parentGUID;
    }

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {

        List<AbstractModel> disqualificationList = new ArrayList<>();

        Element leaderElement = element;

        for (Element disqualification : leaderElement.children()) {

            Disqualification disqualificationTable = setDisqualification(disqualification);

            disqualificationList.add(disqualificationTable);
        }

        return disqualificationList;
    }

    private Disqualification setDisqualification(Element disqualification) {

        Disqualification disqualificationTable = new Disqualification();

        disqualificationTable.setRegisterNumber(NodeCreatorUtil.getJsoupElemAttrib(disqualification, "RegisterNumber"));

        disqualificationTable.setArticle(NodeCreatorUtil.getJsoupElemAttrib(disqualification, "Article"));

        disqualificationTable.setStartdate(NodeCreatorUtil.getJsoupElemAttrib(disqualification, "StartDate"));

        disqualificationTable.setEndDate(NodeCreatorUtil.getJsoupElemAttrib(disqualification, "EndDate"));

        disqualificationTable.setPeriod(NodeCreatorUtil.getJsoupElemAttrib(disqualification, "Period"));

        disqualificationTable.setDisqualifiedInCompany(NodeCreatorUtil.getJsoupElemAttrib(disqualification, "DisqualifiedInCompany"));

        disqualificationTable.setLeaderListGuid(parentGUID);

        disqualificationTable.setCurr("1");

        disqualificationTable.setGUID(NodeCreatorUtil.createGuid());

        disqualificationTable.setLastchgdatetime(TimeStamp.getTimeStamp());

        return disqualificationTable;
    }

}
