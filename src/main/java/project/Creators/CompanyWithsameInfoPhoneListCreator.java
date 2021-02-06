package project.Creators;

import project.Models.AbstractModel;
import project.Models.CompanyWithsameInfoPhoneList;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class CompanyWithsameInfoPhoneListCreator implements Create {

    private String parentGUID;

    public CompanyWithsameInfoPhoneListCreator(String parentGUID) {
        this.parentGUID = parentGUID;
    }

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {

        List<AbstractModel> companyWithsameInfoPhoneListList = new ArrayList<>();

        Element companyWithsameInfoPhoneListElement = element;

        if (NodeCreatorUtil.checkJsoupElem(companyWithsameInfoPhoneListElement)) {

            for (Element singlePhone : companyWithsameInfoPhoneListElement.children()) {

                CompanyWithsameInfoPhoneList singleCompanyWithsameInfoPhoneList = new CompanyWithsameInfoPhoneList();

                singleCompanyWithsameInfoPhoneList.setCode(NodeCreatorUtil.getJsoupElemAttrib(singlePhone, "Code"));

                singleCompanyWithsameInfoPhoneList.setNumber(NodeCreatorUtil.getJsoupElemAttrib(singlePhone, "Number"));

                singleCompanyWithsameInfoPhoneList.setValue(NodeCreatorUtil.getJsoupElemText(singlePhone));

                singleCompanyWithsameInfoPhoneList.setCurr("1");

                singleCompanyWithsameInfoPhoneList.setGUID(NodeCreatorUtil.createGuid());

                singleCompanyWithsameInfoPhoneList.setLastchgdatetime(TimeStamp.getTimeStamp());

                singleCompanyWithsameInfoPhoneList.setCompanyWithsameInfoGUID(parentGUID);

                companyWithsameInfoPhoneListList.add(singleCompanyWithsameInfoPhoneList);

            }

        }

        return companyWithsameInfoPhoneListList;

    }
}
