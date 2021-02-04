package Creators;

import Models.AbstractModel;
import Models.IncludeInList;
import Models.PhoneList;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class PhoneListCreator implements Create {


    public PhoneListCreator() {

    }

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {

        List<AbstractModel> phoneListsList = new ArrayList<>();

        Element phoneListsListElement = element;

        if (phoneListsListElement.children().size() > 0) {

            for (Element phone : phoneListsListElement.children()) {

                PhoneList phoneList = createPhoneList(sparkid, phone);

                phoneListsList.add(phoneList);
            }
        }
        return phoneListsList;
    }

    private PhoneList createPhoneList(String sparkid, Element phone) {

        PhoneList phoneList = new PhoneList();

        phoneList.setSparkId(sparkid);

        phoneList.setNumber(NodeCreatorUtil.getJsoupElemAttrib(phone, "Number"));

        phoneList.setCode(NodeCreatorUtil.getJsoupElemAttrib(phone, "Code"));

        phoneList.setVerificationDate(NodeCreatorUtil.getJsoupElemAttrib(phone, "VerificationDate"));

        phoneList.setStatus(NodeCreatorUtil.getJsoupElemAttrib(phone, "Status"));

        phoneList.setGUID(NodeCreatorUtil.createGuid());

        phoneList.setCurr("1");

        phoneList.setLastchgdatetime(TimeStamp.getTimeStamp());

        return phoneList;
    }
}