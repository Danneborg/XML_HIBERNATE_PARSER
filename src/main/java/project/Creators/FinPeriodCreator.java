package project.Creators;

import project.Models.AbstractModel;
import project.Models.FinPeriod;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FinPeriodCreator implements Create {

    //Текущий год
    private int currentGlovalYear = Calendar.getInstance().get(Calendar.YEAR);
    private DateTimeFormatter globalDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> finPeriodList = new ArrayList<>();

        //Тег Finance
        Element finance = element;

        if (finance.children().size() > 0) {

            for (Element singleFinPeriod : finance.children()) {

                //Нужно заносить в бд отчеты не старше 3х лет
                String dateEndYear = NodeCreatorUtil.getJsoupElemAttrib(singleFinPeriod, "DateEnd");

                if ((currentGlovalYear - LocalDate.parse(dateEndYear, globalDateFormatter).getYear()) <= 3) {

                    FinPeriod finPeriod = createFinPeriod(sparkid, singleFinPeriod);

                    finPeriodList.add(finPeriod);

                    //Передаем в метод Ноду по адресу //Response/Data/Report/Finance/FinPeriod/StringList
                    if (singleFinPeriod.children().first().children().size() > 0) {

                        List<AbstractModel> finstrList = createFinStrForFinPeriod(sparkid, singleFinPeriod, finPeriod);

                        if (finstrList.size() > 0) {

                            finPeriodList.addAll(finstrList);

                        }
                    }

                }

            }

        }

        return finPeriodList;
    }

    private List<AbstractModel> createFinStrForFinPeriod(String sparkid, Element singleFinPeriod, FinPeriod finPeriod) {
        FinStrCreator finStrCreator = new FinStrCreator(finPeriod.getGUID());

        List<AbstractModel> finStrList;

        finStrList = finStrCreator.createModels(singleFinPeriod.children().first(), sparkid);

        return finStrList;
    }

    private FinPeriod createFinPeriod(String sparkid, Element singleFinPeriod) {
        FinPeriod finPeriod = new FinPeriod();

        finPeriod.setSparkId(sparkid);

        finPeriod.setDateBegin(NodeCreatorUtil.getJsoupElemAttrib(singleFinPeriod, "DateBegin"));

        finPeriod.setDateEnd(NodeCreatorUtil.getJsoupElemAttrib(singleFinPeriod, "DateEnd"));

        finPeriod.setPeriodName(NodeCreatorUtil.getJsoupElemAttrib(singleFinPeriod, "PeriodName"));

        finPeriod.setCurr("1");

        finPeriod.setLastchgdatetime(TimeStamp.getTimeStamp());

        finPeriod.setGUID(NodeCreatorUtil.createGuid());

        return finPeriod;
    }

}
