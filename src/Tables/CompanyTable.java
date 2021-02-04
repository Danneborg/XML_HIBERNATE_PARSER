package Tables;

import org.hibernate.Session;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

//Нужно вызвать только 1 процедуру апдейта таблицы Company
public class CompanyTable implements Table {

    private String SparkId;
    private String hashes;
    private String procedureName;

    public CompanyTable(String sparkId, String hashes, String procedureName) {
        this.SparkId = sparkId;
        this.hashes = hashes;
        this.procedureName = procedureName;
    }

    @Override
    public void tableInfo() {
        System.out.println("Company table");
    }

    @Override
    public void setElementsToSave() {

    }

    @Override
    public void save(Session session) {

        StoredProcedureQuery query = session
                .createStoredProcedureQuery(this.procedureName)
                .registerStoredProcedureParameter("sparkid", Integer.class, ParameterMode.IN)
                .setParameter("sparkid", Integer.parseInt(SparkId))
                .registerStoredProcedureParameter("JSONhash", String.class, ParameterMode.IN)
                .setParameter("JSONhash", hashes);

        query.executeUpdate();
    }
}

