package project.Creators;

import project.Models.AbstractModel;
import project.Models.CompanyWithsameInfo;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class CompanyWithsameInfoCreator implements Create {

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> companyWithsameInfoList = new ArrayList<>();

        Element companyWithsameInfoElement = element;

        if (NodeCreatorUtil.checkJsoupElem(companyWithsameInfoElement)) {

            CompanyWithsameInfo companyWithsameInfo = setSingleCompanyWithSameInfo(sparkid, companyWithsameInfoElement);

            companyWithsameInfoList.add(companyWithsameInfo);

            //Добавляем дочернюю таблицу CompanyWithSameInfoPhoneList
            if (NodeCreatorUtil.checkJsoupElem(companyWithsameInfoElement.selectFirst("PhoneList")) && companyWithsameInfoElement.selectFirst("PhoneList").children().size() > 0) {

                List<AbstractModel> companyWithsameInfoPhoneLists = createCompanyWithsameInfoPhoneList(companyWithsameInfoElement.selectFirst("PhoneList"), sparkid, companyWithsameInfo);

                if (companyWithsameInfoPhoneLists.size() > 0) {

                    companyWithsameInfoList.addAll(companyWithsameInfoPhoneLists);

                }

            }

        }

        return companyWithsameInfoList;
    }

    private CompanyWithsameInfo setSingleCompanyWithSameInfo(String sparkid, Element companyWithsameInfoElement) {

        CompanyWithsameInfo companyWithsameInfo = new CompanyWithsameInfo();

        companyWithsameInfo.setSparkid(sparkid);

        companyWithsameInfo.setAddressCount(Integer.parseInt(NodeCreatorUtil.getJsoupElemText(companyWithsameInfoElement.selectFirst("AddressCount"))));

        companyWithsameInfo.setAddressFTSCount(Integer.parseInt(NodeCreatorUtil.getJsoupElemText(companyWithsameInfoElement.selectFirst("AddressFTSCount"))));

        companyWithsameInfo.setAddressNotAffiliatedCount(Integer.parseInt(NodeCreatorUtil.getJsoupElemText(companyWithsameInfoElement.selectFirst("AddressNotAffiliatedCount"))));

        companyWithsameInfo.setAddressWithoutRoomCount(Integer.parseInt(NodeCreatorUtil.getJsoupElemText(companyWithsameInfoElement.selectFirst("AddressWithoutRoomCount"))));

        companyWithsameInfo.setManagerCountInCountry(Integer.parseInt(NodeCreatorUtil.getJsoupElemText(companyWithsameInfoElement.selectFirst("ManagerCountInCountry"))));

        companyWithsameInfo.setManagerCountInRegion(Integer.parseInt(NodeCreatorUtil.getJsoupElemText(companyWithsameInfoElement.selectFirst("ManagerCountInRegion"))));

        companyWithsameInfo.setManagerInnCount(Integer.parseInt(NodeCreatorUtil.getJsoupElemText(companyWithsameInfoElement.selectFirst("ManagerInnCount"))));

        companyWithsameInfo.setValue(Integer.parseInt(NodeCreatorUtil.getJsoupElemText(companyWithsameInfoElement.selectFirst("TelephoneCount"))));

        companyWithsameInfo.setPhoneCode(NodeCreatorUtil.getJsoupElemAttrib(companyWithsameInfoElement.selectFirst("TelephoneCount"), "PhoneCode"));

        companyWithsameInfo.setPhoneNumber(NodeCreatorUtil.getJsoupElemAttrib(companyWithsameInfoElement.selectFirst("TelephoneCount"), "PhoneNumber"));

        companyWithsameInfo.setCurr("1");

        companyWithsameInfo.setLastchgdatetime(TimeStamp.getTimeStamp());

        companyWithsameInfo.setGUID(NodeCreatorUtil.createGuid());

        return companyWithsameInfo;
    }

    private List<AbstractModel> createCompanyWithsameInfoPhoneList(Element phoneList, String sparkid, CompanyWithsameInfo companyWithsameInfo) {

        CompanyWithsameInfoPhoneListCreator companyWithsameInfoPhoneListCreator = new CompanyWithsameInfoPhoneListCreator(companyWithsameInfo.getGUID());

        List<AbstractModel> companyWithsameInfoPhoneListList;

        companyWithsameInfoPhoneListList = companyWithsameInfoPhoneListCreator.createModels(phoneList, sparkid);

        return companyWithsameInfoPhoneListList;
    }
}
