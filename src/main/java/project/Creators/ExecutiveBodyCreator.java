package project.Creators;

import project.Models.AbstractModel;
import project.Models.ExecutiveBody;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class ExecutiveBodyCreator implements Create {

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> executiveBodyList = new ArrayList<>();

        Element executiveBodyElement = element;

        if (NodeCreatorUtil.checkJsoupElem(executiveBodyElement)) {

            ExecutiveBody executiveBodyTable = createExecutiveBody(sparkid, executiveBodyElement);

            executiveBodyList.add(executiveBodyTable);

            //Формируем дочернюю таблицу
            if (executiveBodyElement.children().size() > 0) {

                ExecutiveBodyMemberCreator executiveBodyMemberCreator = new ExecutiveBodyMemberCreator(executiveBodyTable.getGUID());

                List<AbstractModel> disqualificationList = executiveBodyMemberCreator.createModels(executiveBodyElement, sparkid);

                if (disqualificationList.size() > 0) {

                    executiveBodyList.addAll(disqualificationList);

                }
            }

        }

        return executiveBodyList;
    }

    private ExecutiveBody createExecutiveBody(String sparkid, Element executiveBodyElement) {
        ExecutiveBody executiveBody = new ExecutiveBody();

        executiveBody.setSparkId(sparkid);

        executiveBody.setActualDate(NodeCreatorUtil.getJsoupElemAttrib(executiveBodyElement, "ActualDate"));

        executiveBody.setCurr("1");

        executiveBody.setGUID(NodeCreatorUtil.createGuid());

        executiveBody.setLastchgdatetime(TimeStamp.getTimeStamp());
        return executiveBody;
    }
}
