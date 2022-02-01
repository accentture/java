package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Query;
import mx.com.gm.domain.Address;

public class AddressDAO extends GenericDAO {

    public List<Address> list() {
        String queryHQL = "SELECT d FROM Address d";
        em = getEntityManager();
        Query query = em.createQuery(queryHQL);
        return query.getResultList();
    }

    public void insert(Address address) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.persist(address);
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

    public void update(Address address) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.merge(address); // merge : to update and syncronizate state of a object
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

    public void remove(Address address) {

        try {
            em = getEntityManager();

            //due that will modify our database we will start a transaction
            em.getTransaction().begin();
            em.remove(em.merge(address)); // syncronizing and removing record
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
    
    public Object searchById(Address address){
        em = getEntityManager();
        return em.find(Address.class, address.getIdAddress());
    }
}
