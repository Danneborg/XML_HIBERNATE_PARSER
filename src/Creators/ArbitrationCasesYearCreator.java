package Creators;

import Models.AbstractModel;
import Models.ArbitrationCases;
import Models.ArbitrationCasesYear;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class ArbitrationCasesYearCreator implements Create {

    private String parentGuid;

    public ArbitrationCasesYearCreator(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {

        List<AbstractModel> arbitrationCasesYearList = new ArrayList<>();

        Element arbitrationCasesElement = element;

        if (NodeCreatorUtil.checkJsoupElem(arbitrationCasesElement)) {

            for (Element singleYear : arbitrationCasesElement.children()) {

                ArbitrationCasesYear arbitrationCasesYear = setSingleArbitrationCasesYear(singleYear);

                arbitrationCasesYearList.add(arbitrationCasesYear);

            }

        }

        return arbitrationCasesYearList;

    }

    private ArbitrationCasesYear setSingleArbitrationCasesYear(Element singleYear) {

        ArbitrationCasesYear arbitrationCasesYear = new ArbitrationCasesYear();

        arbitrationCasesYear.setYear(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(singleYear, "Year")));

        arbitrationCasesYear.setDefendantCasesNumber(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(singleYear.selectFirst("Defendant"), "CasesNumber")));

        arbitrationCasesYear.setDefendantSum(NodeCreatorUtil.getJsoupElemAttrib(singleYear.selectFirst("Defendant"), "Sum"));

        arbitrationCasesYear.setPlaintiffCasesNumber(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(singleYear.selectFirst("Plaintiff"), "CasesNumber")));

        arbitrationCasesYear.setPlaintiffSum(NodeCreatorUtil.getJsoupElemAttrib(singleYear.selectFirst("Plaintiff"), "Sum"));

        arbitrationCasesYear.setThirdOrOtherPersonCasesNumber(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(singleYear.selectFirst("ThirdOrOtherPerson"), "CasesNumber")));

        arbitrationCasesYear.setGUID(NodeCreatorUtil.createGuid());

        arbitrationCasesYear.setLastchgdatetime(TimeStamp.getTimeStamp());

        arbitrationCasesYear.setCurr("1");

        arbitrationCasesYear.setArbitrationCasesGUID(parentGuid);

        return arbitrationCasesYear;
    }
}
