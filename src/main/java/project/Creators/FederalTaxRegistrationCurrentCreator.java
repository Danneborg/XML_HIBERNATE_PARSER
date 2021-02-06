package project.Creators;

import project.Models.AbstractModel;
import project.Models.FederalTaxRegistrationCurrent;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class FederalTaxRegistrationCurrentCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> federalTaxRegistrationCurrentList = new ArrayList<>();

        Element federalTaxRegistrationCurrentElement = element;

        if (NodeCreatorUtil.checkJsoupElem(federalTaxRegistrationCurrentElement)) {

            FederalTaxRegistrationCurrent federalTaxRegistrationCurrent = createFederalTaxRegistrationCurrent(sparkid, federalTaxRegistrationCurrentElement);

            federalTaxRegistrationCurrentList.add(federalTaxRegistrationCurrent);
        }
        return federalTaxRegistrationCurrentList;
    }

    private FederalTaxRegistrationCurrent createFederalTaxRegistrationCurrent(String sparkid, Element federalTaxRegistrationCurrentElement) {
        FederalTaxRegistrationCurrent federalTaxRegistrationCurrent = new FederalTaxRegistrationCurrent();

        federalTaxRegistrationCurrent.setSparkID(sparkid);

        federalTaxRegistrationCurrent.setRegAuthority(NodeCreatorUtil.getJsoupElemText(federalTaxRegistrationCurrentElement.selectFirst("RegAuthority")));

        federalTaxRegistrationCurrent.setRegAuthorityAddress(NodeCreatorUtil.getJsoupElemText(federalTaxRegistrationCurrentElement.selectFirst("RegAuthorityAddress")));

        federalTaxRegistrationCurrent.setRegAuthorityCode(NodeCreatorUtil.getJsoupElemText(federalTaxRegistrationCurrentElement.selectFirst("RegAuthorityCode")));

        federalTaxRegistrationCurrent.setRegDate(NodeCreatorUtil.getJsoupElemText(federalTaxRegistrationCurrentElement.selectFirst("RegDate")));

        federalTaxRegistrationCurrent.setCurr("1");

        federalTaxRegistrationCurrent.setLastchgdatetime(TimeStamp.getTimeStamp());

        federalTaxRegistrationCurrent.setGUID(NodeCreatorUtil.createGuid());
        return federalTaxRegistrationCurrent;
    }
}
