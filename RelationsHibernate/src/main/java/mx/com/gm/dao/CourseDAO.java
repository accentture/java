package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Course;

public class CourseDAO extends GenericDAO {
    public List<Course> list() {
        String queryHQL = "SELECT c FROM Course c"; //c : in the query it is an aliase
        em = getEntityManager();
        Query query = em.createQuery(queryHQL);
        return query.getResultList();
    }

    public void insert(Course course) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.persist(course);
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

    public void update(Course course) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.merge(course); // merge : to update and syncronizate state of a object
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

    public void remove(Course course) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.remove(em.merge(course)); // syncronizing and removing record
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
    
    public Object searchById(Course course){
        em = getEntityManager();
        return em.find(Course.class, course.getIdCourse());
    }
}
