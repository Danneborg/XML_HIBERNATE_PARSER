package project.Creators;

import project.Models.AbstractModel;
import project.Models.SpecialTaxRegimes;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class SpecialTaxRegimesCreator implements Create {

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> specialTaxRegimesList = new ArrayList<>();

        Element specialTaxRegimeElement = element;

        if (NodeCreatorUtil.checkJsoupElem(specialTaxRegimeElement)) {

            SpecialTaxRegimes specialTaxRegimes = createSpecialTaxRegimes(sparkid, specialTaxRegimeElement);

            specialTaxRegimesList.add(specialTaxRegimes);

            //Формируем дочернюю таблицу
            if (specialTaxRegimeElement.children().size() > 0) {

                RegimeCreator regimeCreator = new RegimeCreator(specialTaxRegimes.getGUID());

                List<AbstractModel> regimeList = regimeCreator.createModels(specialTaxRegimeElement, sparkid);

                if (regimeList.size() > 0) {

                    specialTaxRegimesList.addAll(regimeList);

                }
            }

        }

        return specialTaxRegimesList;
    }

    private SpecialTaxRegimes createSpecialTaxRegimes(String sparkid, Element specialTaxRegimesElement) {
        SpecialTaxRegimes specialTaxRegimes = new SpecialTaxRegimes();

        specialTaxRegimes.setSparkId(sparkid);

        specialTaxRegimes.setActualDate(NodeCreatorUtil.getJsoupElemAttrib(specialTaxRegimesElement, "ActualDate"));

        specialTaxRegimes.setCurr("1");

        specialTaxRegimes.setGUID(NodeCreatorUtil.createGuid());

        specialTaxRegimes.setLastchgdatetime(TimeStamp.getTimeStamp());

        return specialTaxRegimes;
    }
}
