package project.Tables;

import project.Creators.Create;
import project.Models.AbstractModel;
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
        getRowsToUpdate();
    }

    @Override
    public void tableInfo() {
        System.out.println("ParsingXMLStat table");
    }

    @Override
    public List<AbstractModel> getRowsToUpdate() {

        models = creator.createModels(element, SparkId);
        return models;
    }

    @Override
    public void dropCurrMarker(Session session) {
        if (models.size() > 0) {
            for (AbstractModel message : models) {
                session.save(message);
            }
        }
    }
}

