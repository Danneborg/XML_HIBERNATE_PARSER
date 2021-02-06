package project.Tables;


import org.hibernate.Session;
import project.Models.AbstractModel;

import java.util.List;

public interface Table {

    public void tableInfo();

    public List<AbstractModel> getRowsToUpdate();

    public void dropCurrMarker(Session session);

}
