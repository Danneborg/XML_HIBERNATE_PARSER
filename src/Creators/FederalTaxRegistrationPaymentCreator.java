package Creators;

import Models.AbstractModel;
import Models.FederalTaxRegistrationCurrent;
import Models.FederalTaxRegistrationPayment;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class FederalTaxRegistrationPaymentCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> federalTaxRegistrationPaymentList = new ArrayList<>();

        Element federalTaxRegistrationPaymentElement = element;

        if (NodeCreatorUtil.checkJsoupElem(federalTaxRegistrationPaymentElement)) {

            FederalTaxRegistrationPayment federalTaxRegistrationPayment = createFederalTaxRegistrationCurrent(sparkid, federalTaxRegistrationPaymentElement);

            federalTaxRegistrationPaymentList.add(federalTaxRegistrationPayment);
        }
        return federalTaxRegistrationPaymentList;
    }

    private FederalTaxRegistrationPayment createFederalTaxRegistrationCurrent(String sparkid, Element federalTaxRegistrationPaymentElement) {
        FederalTaxRegistrationPayment federalTaxRegistrationPayment = new FederalTaxRegistrationPayment();

        federalTaxRegistrationPayment.setSparkID(sparkid);

        federalTaxRegistrationPayment.setRegAuthority(NodeCreatorUtil.getJsoupElemText(federalTaxRegistrationPaymentElement.selectFirst("RegAuthority")));

        federalTaxRegistrationPayment.setRegAuthorityAddress(NodeCreatorUtil.getJsoupElemText(federalTaxRegistrationPaymentElement.selectFirst("RegAuthorityAddress")));

        federalTaxRegistrationPayment.setRegAuthorityCode(NodeCreatorUtil.getJsoupElemText(federalTaxRegistrationPaymentElement.selectFirst("RegAuthorityCode")));

        federalTaxRegistrationPayment.setRegDate(NodeCreatorUtil.getJsoupElemText(federalTaxRegistrationPaymentElement.selectFirst("RegDate")));

        federalTaxRegistrationPayment.setCurr("1");

        federalTaxRegistrationPayment.setLastchgdatetime(TimeStamp.getTimeStamp());

        federalTaxRegistrationPayment.setGUID(NodeCreatorUtil.createGuid());

        return federalTaxRegistrationPayment;
    }
}
