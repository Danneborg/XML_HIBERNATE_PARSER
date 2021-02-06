package project.Creators;

import project.Models.AbstractModel;
import project.Models.ChangesInNameAndLegalForm;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class ChangesInNameAndLegalFormCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> changeInNameAndLegalFormList = new ArrayList<>();

        if (element.children().size() > 0) {

            for (org.jsoup.nodes.Element change : element.children()) {
                ChangesInNameAndLegalForm changeInNameAndLegalForm = new ChangesInNameAndLegalForm();

                changeInNameAndLegalForm.setSparkId(sparkid);
                changeInNameAndLegalForm.setCurr("1");
                changeInNameAndLegalForm.setLastchgdatetime(TimeStamp.getTimeStamp());
                changeInNameAndLegalForm.setGUID(NodeCreatorUtil.createGuid());

                changeInNameAndLegalForm.setChangeDate(NodeCreatorUtil.getJsoupElemText(change.selectFirst("ChangeDate")));
                changeInNameAndLegalForm.setINN(NodeCreatorUtil.getJsoupElemText(change.selectFirst("INN")));
                changeInNameAndLegalForm.setName(NodeCreatorUtil.getJsoupElemText(change.selectFirst("Name")));
                changeInNameAndLegalForm.setOGRN(NodeCreatorUtil.getJsoupElemText(change.selectFirst("OGRN")));
                changeInNameAndLegalForm.setOKOPF(NodeCreatorUtil.getJsoupElemText(change.selectFirst("OKOPF")));

                changeInNameAndLegalFormList.add(changeInNameAndLegalForm);
            }
        }
        return changeInNameAndLegalFormList;
    }
}
