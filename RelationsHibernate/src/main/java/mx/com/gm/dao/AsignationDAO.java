package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Asignation;

public class AsignationDAO extends GenericDAO {
    //ctr+ h : to replace code
    public List<Asignation> list() {
        String queryHQL = "SELECT c FROM Asignation c"; //c : in the query it is an aliase
        em = getEntityManager();
        Query query = em.createQuery(queryHQL);
        return query.getResultList();
    }

    public void insert(Asignation asignation) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.persist(asignation);
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

    public void update(Asignation asignation) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.merge(asignation); // merge : to update and syncronizate state of a object
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

    public void remove(Asignation asignation) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.remove(em.merge(asignation)); // syncronizing and removing record
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
    
    public Object searchById(Asignation asignation){
        em = getEntityManager();
        return em.find(Asignation.class, asignation.getIdAsignation());
    }
}
