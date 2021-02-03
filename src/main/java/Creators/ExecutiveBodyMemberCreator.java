package Creators;

import Models.AbstractModel;
import Models.ExecutiveBody;
import Models.ExecutiveBodyMember;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class ExecutiveBodyMemberCreator implements Create {

    private String parentGUID;

    public ExecutiveBodyMemberCreator(String parentGUID) {
        this.parentGUID = parentGUID;
    }

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> executiveBodyMemberList = new ArrayList<>();

        Element executiveBodyMemberElement = element;

        if (NodeCreatorUtil.checkJsoupElem(executiveBodyMemberElement)) {

            for (Element singleMember : executiveBodyMemberElement.children()) {

                ExecutiveBodyMember executiveBodyMember = createExecutiveBodyMemberelement(singleMember);

                executiveBodyMemberList.add(executiveBodyMember);
            }

        }

        return executiveBodyMemberList;
    }

    private ExecutiveBodyMember createExecutiveBodyMemberelement(Element singleMember) {
        ExecutiveBodyMember executiveBodyMember = new ExecutiveBodyMember();

        executiveBodyMember.setExecutiveBodyGUID(parentGUID);

        executiveBodyMember.setSharePart(NodeCreatorUtil.getJsoupElemText(singleMember.selectFirst("SharePart")));

        executiveBodyMember.setINN(NodeCreatorUtil.getJsoupElemText(singleMember.selectFirst("INN")));

        executiveBodyMember.setBirthdayYear(NodeCreatorUtil.getJsoupElemText(singleMember.selectFirst("BirthdayYear")));

        executiveBodyMember.setName(NodeCreatorUtil.getJsoupElemText(singleMember.selectFirst("Name")));

        executiveBodyMember.setPosition(NodeCreatorUtil.getJsoupElemAttrib(singleMember.selectFirst("Position"), "Name"));

        executiveBodyMember.setCurr("1");

        executiveBodyMember.setGUID(NodeCreatorUtil.createGuid());

        executiveBodyMember.setLastchgdatetime(TimeStamp.getTimeStamp());

        return executiveBodyMember;
    }
}
