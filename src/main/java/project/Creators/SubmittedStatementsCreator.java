package project.Creators;

import project.Models.AbstractModel;
import project.Models.SubmittedStatements;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class SubmittedStatementsCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> submittedStatementsList = new ArrayList<>();

        if (element.children().size() > 0) {

            for (Element statement : element.children()) {
                SubmittedStatements submittedStatementRow = new SubmittedStatements();

                submittedStatementRow.setSparkID(sparkid);

                submittedStatementRow.setAvailabilityDate(NodeCreatorUtil.getJsoupElemAttrib(statement,"AvailabilityDate"));

                submittedStatementRow.setDecisionType(NodeCreatorUtil.getJsoupElemAttrib(statement,"DecisionType"));

                submittedStatementRow.setForm(NodeCreatorUtil.getJsoupElemAttrib(statement,"Form"));

                submittedStatementRow.setGRN(NodeCreatorUtil.getJsoupElemAttrib(statement,"GRN"));

                submittedStatementRow.setReferenceNumber(NodeCreatorUtil.getJsoupElemAttrib(statement,"ReferenceNumber"));

                submittedStatementRow.setSubmissionDate(NodeCreatorUtil.getJsoupElemAttrib(statement,"SubmissionDate"));

                submittedStatementRow.setLastchgdatetime(TimeStamp.getTimeStamp());

                submittedStatementRow.setGUID(NodeCreatorUtil.createGuid());

                submittedStatementRow.setCurr("1");

                submittedStatementsList.add(submittedStatementRow);

            }

        }

        return submittedStatementsList;
    }
}
