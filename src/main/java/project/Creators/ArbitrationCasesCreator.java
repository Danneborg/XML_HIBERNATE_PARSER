package project.Creators;

import project.Models.AbstractModel;
import project.Models.ArbitrationCases;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class ArbitrationCasesCreator implements Create {

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {

        List<AbstractModel> arbitrationCasesList = new ArrayList<>();

        Element arbitrationCasesElement = element;

        if (NodeCreatorUtil.checkJsoupElem(arbitrationCasesElement)) {

            ArbitrationCases arbitrationCases = setSingleArbitrationCase(arbitrationCasesElement, sparkid);

            arbitrationCasesList.add(arbitrationCases);

            //Создаем дочение записи в таблице ArbitrationCases_Year
            if (arbitrationCasesElement.children().size() > 0) {

                List<AbstractModel> arbitrationCasesYearList = createArbitrationCasesYearList(sparkid, arbitrationCasesElement, arbitrationCases);

                if (arbitrationCasesYearList.size() > 0) {
                    arbitrationCasesList.addAll(arbitrationCasesYearList);
                }

            }

        }

        return arbitrationCasesList;
    }

    private List<AbstractModel> createArbitrationCasesYearList(String sparkid, Element arbitrationCasesElement, ArbitrationCases arbitrationCases) {

        ArbitrationCasesYearCreator arbitrationCasesYearCreator = new ArbitrationCasesYearCreator(arbitrationCases.getGUID());

        List<AbstractModel> arbitrationCasesYearList;

        arbitrationCasesYearList = arbitrationCasesYearCreator.createModels(arbitrationCasesElement, sparkid);

        return arbitrationCasesYearList;
    }

    private ArbitrationCases setSingleArbitrationCase(Element element, String sparkid) {
        ArbitrationCases arbitrationCases = new ArbitrationCases();

        arbitrationCases.setSparkid(sparkid);

        arbitrationCases.setAppealed(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(element, "Appealed")));

        arbitrationCases.setConsidered(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(element, "Considered")));

        arbitrationCases.setDecisionsAndRulings(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(element, "DecisionsAndRulings")));

        arbitrationCases.setTotal(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(element, "Total")));

        arbitrationCases.setCompleted(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(element, "Completed")));

        arbitrationCases.setLastchgdatetime(TimeStamp.getTimeStamp());

        arbitrationCases.setGUID(NodeCreatorUtil.createGuid());

        arbitrationCases.setCurr("1");

        return arbitrationCases;
    }
}
