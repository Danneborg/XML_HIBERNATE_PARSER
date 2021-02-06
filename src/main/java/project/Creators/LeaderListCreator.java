package project.Creators;

import project.Models.AbstractModel;
import project.Models.LeaderList;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class LeaderListCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> leaderList = new ArrayList<>();

        Element leaderListElement = element;

        if (NodeCreatorUtil.checkJsoupElem(leaderListElement)) {

            for (Element leader : leaderListElement.children()) {

                LeaderList leaderListTable = setLeaderListTable(sparkid, leader);

                leaderList.add(leaderListTable);

                //Создаем таблицу Disqualification
                if (leader.children().size() > 0) {

                    DisqualificationCreator disqualificationCreator = new DisqualificationCreator(leaderListTable.getGUID());

                    List<AbstractModel> disqualificationList = disqualificationCreator.createModels(leader, sparkid);

                    if (disqualificationList.size() > 0) {

                        leaderList.addAll(disqualificationList);

                    }
                }
            }
        }
        return leaderList;
    }

    private LeaderList setLeaderListTable(String sparkid, Element leader) {

        LeaderList leaderListTable = new LeaderList();

        leaderListTable.setSparkId(sparkid);

        leaderListTable.setPosition(NodeCreatorUtil.getJsoupElemAttrib(leader, "Postition"));

        leaderListTable.setInn(NodeCreatorUtil.getJsoupElemAttrib(leader, "INN"));

        leaderListTable.setManagementCompany(NodeCreatorUtil.getJsoupElemAttrib(leader, "ManagementCompany"));

        leaderListTable.setManagementCompanyINN(NodeCreatorUtil.getJsoupElemAttrib(leader, "ManagementCompanyINN"));

        leaderListTable.setActualDate(NodeCreatorUtil.getJsoupElemAttrib(leader, "ActualDate"));

        leaderListTable.setFio(NodeCreatorUtil.getJsoupElemAttrib(leader, "FIO"));

        leaderListTable.setCurr("1");

        leaderListTable.setGUID(NodeCreatorUtil.createGuid());

        leaderListTable.setLastchgdatetime(TimeStamp.getTimeStamp());

        return leaderListTable;
    }

}
