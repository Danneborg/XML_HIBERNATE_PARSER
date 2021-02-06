package project.Creators;

import project.Models.AbstractModel;
import project.Models.StructureInfo;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class StructureInfoCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> structureInfoList = new ArrayList<>();

        Element structureInfoElement = element;

        if (NodeCreatorUtil.checkJsoupElem(structureInfoElement)) {

            StructureInfo structureInfo = new StructureInfo();

            structureInfo.setSparkID(sparkid);

            structureInfo.setCountCoownerFCSM(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("CountCoownerFCSM")));

            structureInfo.setCountCoownerRosstat(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("CountCoownerRosstat")));

            structureInfo.setCountCoownerEGRUL(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("CountCoownerEGRUL")));

            structureInfo.setCountBranch(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("CountBranch")));

            structureInfo.setCountBranchRosstat(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("CountBranchRosstat")));

            structureInfo.setCountBranchEGRUL(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("CountBranchEGRUL")));

            structureInfo.setCountAffiliatedCompanyFCSM(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("CountAffiliatedCompanyFCSM")));

            structureInfo.setCountAffiliatedCompanyRosstat(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("CountAffiliatedCompanyRosstat")));

            structureInfo.setCountAffiliatedCompanyEGRUL(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("CountAffiliatedCompanyEGRUL")));

            structureInfo.setNonprofitOrganizationRosstat(NodeCreatorUtil.getJsoupElemText(structureInfoElement.selectFirst("NonprofitOrganizationRosstat")));

            structureInfo.setCurr("1");

            structureInfo.setLastchgdatetime(TimeStamp.getTimeStamp());

            structureInfo.setGUID(NodeCreatorUtil.createGuid());

            structureInfoList.add(structureInfo);
        }
        return structureInfoList;
    }
}
