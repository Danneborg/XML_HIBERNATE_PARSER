package Creators;

import Models.AbstractModel;
import Models.Okved2List;
import Models.RegistrationCertificates;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class Okved2ListCreator implements Create{
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> okver2ListModels = new ArrayList<>();

        if (element.children().size() > 0) {

            for (Element okved : element.children()) {
                Okved2List okved2ListRow = new Okved2List();

                okved2ListRow.setSparkID(sparkid);

                okved2ListRow.setIsMain(NodeCreatorUtil.getJsoupElemAttrib(okved,"IsMain"));

                okved2ListRow.setName(NodeCreatorUtil.getJsoupElemAttrib(okved,"Name"));

                okved2ListRow.setCode(NodeCreatorUtil.getJsoupElemAttrib(okved,"Code"));

                okved2ListRow.setLastchgdatetime(TimeStamp.getTimeStamp());

                okved2ListRow.setGUID(NodeCreatorUtil.createGuid());

                okved2ListRow.setCurr("1");

                okver2ListModels.add(okved2ListRow);

            }

        }

        return okver2ListModels;
    }
}
