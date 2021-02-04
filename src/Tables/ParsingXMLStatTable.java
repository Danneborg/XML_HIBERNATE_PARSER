package Tables;

import Creators.Create;
import Models.AbstractModel;
import org.hibernate.Session;
import org.jsoup.nodes.Element;

import java.util.List;

public class ParsingXMLStatTable implements Table {

    private String SparkId;
    private Create creator;
    private Element element;

    private List<AbstractModel> models;

    public ParsingXMLStatTable(String sparkId, Element element, Create creator) {
        this.SparkId = sparkId;
        this.creator = creator;
        this.element = element;
        setElementsToSave();
    }

    @Override
    public void tableInfo() {
        System.out.println("ParsingXMLStat table");
    }

    @Override
    public void setElementsToSave() {

        models = creator.createModels(element, SparkId);

    }

    @Override
    public void save(Session session) {
        if (models.size() > 0) {
            for (AbstractModel message : models) {
                session.save(message);
            }
        }
    }
}

