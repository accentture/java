package mx.com.gm.lifecicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.domain.Contact;

public class Persistence4_DeletePersistedObject {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager(); //it serve to open connection with the database
   
        Contact contact = null;
        
        //1. transitive
        contact = em.find(Contact.class, 3);//recovery the object
        
        //modify object
        contact.setEmail("clara@mail.com");
        
        //start a transaction
        em.getTransaction().begin(); 
        
        //2. remove
        //remove: exist delete method(), but is is more recommendable to use remove() method due that it is aligned with JPA standard
        em.remove(em.merge(contact)); //merge() : to syncronizate the information with the database
        
        
        em.getTransaction().commit();
        
        //3. transitive : we can to syncronize with the database due that it is removed
        System.out.println("contact " + contact);
        
    }
}
