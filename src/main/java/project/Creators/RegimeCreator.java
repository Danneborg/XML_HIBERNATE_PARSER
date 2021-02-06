package project.Creators;

import project.Models.AbstractModel;
import project.Models.Regime;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class RegimeCreator implements Create {

    private String parentGUID;

    public RegimeCreator(String parentGUID) {
        this.parentGUID = parentGUID;
    }

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> regimeList = new ArrayList<>();

        Element specialTaxRegimesElement = element;

        if (NodeCreatorUtil.checkJsoupElem(specialTaxRegimesElement)) {

            for (Element sigleRegime : specialTaxRegimesElement.children()) {

                Regime regime = createRegimeElement(sigleRegime);

                regimeList.add(regime);
            }

        }

        return regimeList;
    }

    private Regime createRegimeElement(Element singleRegime) {
        Regime regime = new Regime();

        regime.setSpecialTaxRegimesGUID(parentGUID);

        regime.setCode(NodeCreatorUtil.getJsoupElemAttrib(singleRegime, "Code"));

        regime.setName(NodeCreatorUtil.getJsoupElemAttrib(singleRegime, "Name"));

        regime.setCurr("1");

        regime.setGUID(NodeCreatorUtil.createGuid());

        regime.setLastchgdatetime(TimeStamp.getTimeStamp());

        return regime;
    }
}
