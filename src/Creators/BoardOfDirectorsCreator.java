package Creators;

import Models.AbstractModel;
import Models.BoardOfDirectors;
import Util.NodeCreatorUtil;
import Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class BoardOfDirectorsCreator implements Create {
    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {
        List<AbstractModel> boardOfDirectorsList = new ArrayList<>();

        if (element.children().size() > 0) {

            for (Element director : element.children()) {
                BoardOfDirectors directorRow = new BoardOfDirectors();

                directorRow.setSparkid(sparkid);

                directorRow.setName(NodeCreatorUtil.getJsoupElemText(director.selectFirst("Name")));

                directorRow.setBirthdayYear(NodeCreatorUtil.getJsoupElemText(director.selectFirst("BirthdayYear")));

                directorRow.setSharePart(NodeCreatorUtil.getJsoupElemText(director.selectFirst("SharePart")));

                directorRow.setINN(NodeCreatorUtil.getJsoupElemText(director.selectFirst("INN")));

                directorRow.setLastchgdatetime(TimeStamp.getTimeStamp());

                directorRow.setGUID(NodeCreatorUtil.createGuid());

                directorRow.setCurr("1");

                boardOfDirectorsList.add(directorRow);

            }

        }

        return boardOfDirectorsList;
    }
}
