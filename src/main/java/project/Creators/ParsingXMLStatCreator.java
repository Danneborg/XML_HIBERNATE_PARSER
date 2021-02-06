package project.Creators;

import project.Models.AbstractModel;
import project.Models.ParsingXMLStat;
import project.Util.NodeCreatorUtil;
import project.Util.TimeStamp;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ParsingXMLStatCreator implements Create {

    private Set<String> methods;

    public ParsingXMLStatCreator(Set<String> methods) {
        this.methods = methods;
    }

    @Override
    public List<AbstractModel> createModels(Element element, String sparkid) {

        List<AbstractModel> parsingXMLStatList = new ArrayList<>();

        ParsingXMLStat parsingXMLStat = new ParsingXMLStat();

        parsingXMLStat.setNodeNamesToChange(methods.toString());

        parsingXMLStat.setNodeNamesToChangeSize(String.valueOf(methods.size()));

        parsingXMLStat.setSparkId(sparkid);

        parsingXMLStat.setGUID(NodeCreatorUtil.createGuid());

        parsingXMLStat.setLastchgdatetime(TimeStamp.getTimeStamp());

        parsingXMLStatList.add(parsingXMLStat);

        return parsingXMLStatList;
    }
}
