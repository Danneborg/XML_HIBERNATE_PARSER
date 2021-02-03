package Tables;


import org.hibernate.Session;

public interface Table{

    public void tableInfo();

    public void setElementsToSave();

    public void save(Session session);

}
