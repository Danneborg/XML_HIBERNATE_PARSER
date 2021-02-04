package Tables;

import Creators.Create;
import Models.AbstractModel;
import org.hibernate.Session;
import org.jsoup.nodes.Element;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

public class CommonTable implements Table {
    private Element element;
    private String SparkId;
    private String procedureName;
    private Create creator;


    private List<AbstractModel> models;

    public CommonTable(String sparkId, Element element, Create creator, String procedureName) {
        this.element = element;
        this.SparkId = sparkId;
        this.procedureName = procedureName;
        this.creator = creator;
        setElementsToSave();
    }

    @Override
    public void setElementsToSave() {
        models = creator.createModels(element, SparkId);

    }

    @Override
    public void save(Session session) {

        if (models.size() > 0) {

            StoredProcedureQuery query = session
                    .createStoredProcedureQuery(this.procedureName)
                    .registerStoredProcedureParameter("sparkid", Integer.class, ParameterMode.IN)
                    .setParameter("sparkid", Integer.parseInt(SparkId));

            query.executeUpdate();


            int i = 0;
            for (AbstractModel message : models) {

                //Бьем на батчи по 10 штук
                if (i != 0 && i % 10 == 0) {
                    session.flush();
                    session.clear();
                }

                session.save(message);

                i++;
            }

        }

    }

    @Override
    public void tableInfo() {
        System.out.println(element.nodeName() + ", size of models " + models.size());
    }
}
