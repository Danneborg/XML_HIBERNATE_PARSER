package project.Tables;

import org.hibernate.Session;
import project.Models.AbstractModel;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.ArrayList;
import java.util.List;

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
    public List<AbstractModel> getRowsToUpdate() {
        return new ArrayList<AbstractModel>();
    }

    @Override
    public void dropCurrMarker(Session session) {

        StoredProcedureQuery query = session
                .createStoredProcedureQuery(this.procedureName)
                .registerStoredProcedureParameter("sparkid", Integer.class, ParameterMode.IN)
                .setParameter("sparkid", Integer.parseInt(SparkId))
                .registerStoredProcedureParameter("JSONhash", String.class, ParameterMode.IN)
                .setParameter("JSONhash", hashes);

        query.executeUpdate();
    }
}

