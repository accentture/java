package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import static mx.com.gm.dao.GenericDAO.em;
import mx.com.gm.domain.Contact;

public class ContacDAO extends GenericDAO {
    
    //ctr+ h : to replace code
    public List<Contact> list() {
        String queryHQL = "SELECT c FROM Contact c"; //c : in the query it is an aliase
        em = getEntityManager();
        Query query = em.createQuery(queryHQL);
        return query.getResultList();
    }

    public void insert(Contact contact) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.persist(contact);
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

    public void update(Contact contact) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.merge(contact); // merge : to update and syncronizate state of a object
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

    public void remove(Contact contact) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.remove(em.merge(contact)); // syncronizing and removing record
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
    
    public Object searchById(Contact contact){
        em = getEntityManager();
        return em.find(Contact.class, contact.getIdContact());
    }
}
