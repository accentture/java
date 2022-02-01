package mx.com.gm.dao;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.com.gm.domain.Person;

public class PersonDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public List<Person> list() {
        //p: it is an aliase
        String hql = "SELECT p FROM Person p";
        Query query = em.createQuery(hql);
        List<Person> people = query.getResultList();

//        System.out.println("people" + people);
//        for (Person p : people) {
//            System.out.println("p = " + p);
//        }
        return people;
    }

    public void insert(Person person) {
        //if we are using a server glassfish, jboss (business servers) we don't need to use transactions, but if we aren't using all these servers, we must to declare our transactions

        //start the transaction
        try {
            em.getTransaction().begin();
            em.persist(person); //to insert in database
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();

        } finally {
            //closing connection
            //but when we work with a enterprise server it is not necessary to close the connection
            if (em != null) {
                em.close();
            }
        }

    }

    public void modify(Person person) {
        try {
            em.getTransaction().begin();
            em.merge(person); //to update in database
            //syncronizing state of object with the database
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();

        }

        //we will no close connection to allow keep data not modified    
//        finally{
//            //closing connection
//            //but when we work with a enterprise server it is not necessary to close the connection
//            if(em != null){
//                em.close();
//            }
//        }
    }

    public Person findPersonById(Person p) {
        //Person.class : specifiying the object type what I want retrieve
        //we don't need to start a transaction because only we are retriving the information from datase, we are not modifiying state of database
        return em.find(Person.class, p.getIdPerson());
    }

    public void remove(Person person) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(person)); //to remove data from database, we need first to sincronize(merge method) any change in datase and after remove the record
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();

        }
//        finally{
//            //closing connection
//            //but when we work with a enterprise server it is not necessary to close the connection
//            if(em != null){
//                em.close();
//            }
//        }   
    }
}
