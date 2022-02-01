package mx.com.gm.lifecicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.domain.Contact;

public class Persistence3_ModifyPersistedObject {
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
        
        //2. persistence
        //em.persist(contact);
        em.merge(contact); // it is more recommendable to use merge instead of persist
        
        
        em.getTransaction().commit();
        
        //3. detached
        System.out.println("contact " + contact);
        
    }
}
