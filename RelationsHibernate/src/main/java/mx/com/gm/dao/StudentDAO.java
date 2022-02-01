package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Student;

public class StudentDAO extends GenericDAO {
    public List<Student> list() {
        String queryHQL = "SELECT s FROM Student s"; //c : in the query it is an aliase
        em = getEntityManager();
        Query query = em.createQuery(queryHQL);
        return query.getResultList();
    }

    public void insert(Student student) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        } catch (Exception ex) {
            //System.out : sending the exception the standart console
            ex.printStackTrace(System.out);
        } finally {
            //closing our object entityManager
            if (em != null) {
                em.close();
            }
        }

    }

    public void update(Student student) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.merge(student); // merge : to update and syncronizate state of a object
            em.getTransaction().commit();
        } catch (Exception ex) {
            //System.out : sending the exception the standart console
            ex.printStackTrace(System.out);
        } finally {
            //closing our object entityManager
            if (em != null) {
                em.close();
            }
        }

    }

    public void remove(Student student) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.remove(em.merge(student)); // syncronizing and removing record
            em.getTransaction().commit();
        } catch (Exception ex) {
            //System.out : sending the exception the standart console
            ex.printStackTrace(System.out);
        } finally {
            //closing our object entityManager
            if (em != null) {
                em.close();
            }
        }

    }
    
    public Object searchById(Student student){
        em = getEntityManager();
        return em.find(Student.class, student.getIdStudent());
    }
}
