package ssau.esa.lab1.beans;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ssau.esa.lab1.entities.Employee;
import javax.ejb.Singleton;
import java.util.Collection;

@Singleton
public class EmployeeBean{

    @PersistenceContext(unitName = "esa")
    private EntityManager em;

    public Collection<Employee> findAll(){
        return em.createQuery("SELECT c FROM Employee c", Employee.class).getResultList();
    }
}