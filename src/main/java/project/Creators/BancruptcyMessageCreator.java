package project.Creators;

import project.Models.AbstractModel;
import project.Models.BankruptcyMessage;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class BancruptcyMessageCreator implements Create{


    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> bankruptcyMessages = new ArrayList<>();
        Element bancruptcyMessageElements = element;
        if (bancruptcyMessageElements.children().size() > 0) {
            for (org.jsoup.nodes.Element message : bancruptcyMessageElements.children()) {
                BankruptcyMessage bankruptcyMessage = new BankruptcyMessage();


                bankruptcyMessage.setSparkid(sparkid);

                bankruptcyMessage.setType(message.attr("Type"));

                bankruptcyMessage.setDate(message.attr("Date"));

                bankruptcyMessage.setCaseNumber(message.attr("CaseNumber"));

                bankruptcyMessage.setCaseId(message.attr("CaseId"));

                String decisionDate = message.attr("DecisionDate");

                if(decisionDate.equals("")){
                    bankruptcyMessage.setDecisionDate(null);
                }else {
                    bankruptcyMessage.setDecisionDate(message.attr("DecisionDate"));
                }


                bankruptcyMessage.setIdType(message.attr("IdType"));

                bankruptcyMessage.setLastchgdatetime(TimeStamp.getTimeStamp());

                bankruptcyMessage.setCurr("1");

                bankruptcyMessage.setGUID(NodeCreatorUtil.createGuid());

                bankruptcyMessages.add(bankruptcyMessage);
            }
        }
        return bankruptcyMessages;
    }
}
