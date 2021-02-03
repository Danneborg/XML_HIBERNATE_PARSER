package Creators;

import Models.AbstractModel;
import Models.FinStr;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class FinStrCreator implements Create {

    private String parentGUID;

    public FinStrCreator(String parrentGUID) {

        this.parentGUID = parrentGUID;

    }

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> finStrList = new ArrayList<>();

        //Тег StringList
        Element stringList = element;

        for (Element singleString : stringList.children()) {

            FinStr finStr = new FinStr();

            finStr.setCode(NodeCreatorUtil.getJsoupElemAttrib(singleString, "Code"));

            finStr.setForm(NodeCreatorUtil.getJsoupElemAttrib(singleString, "Form"));

            finStr.setIdFinPok(Integer.parseInt(NodeCreatorUtil.getJsoupElemAttrib(singleString, "IdFinPok")));

            finStr.setName(NodeCreatorUtil.getJsoupElemAttrib(singleString, "Name"));

            finStr.setSection(NodeCreatorUtil.getJsoupElemAttrib(singleString, "Section"));

            finStr.setValue(NodeCreatorUtil.getJsoupElemAttrib(singleString, "Value"));

            finStr.setCurr("1");

            finStr.setGUID(NodeCreatorUtil.createGuid());

            finStr.setLastchgdatetime(TimeStamp.getTimeStamp());

            finStr.setFinPeriodGUID(parentGUID);

            finStrList.add(finStr);
        }

        return finStrList;
    }
}
