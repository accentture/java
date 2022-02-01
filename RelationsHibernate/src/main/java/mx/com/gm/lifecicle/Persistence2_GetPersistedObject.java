package mx.com.gm.lifecicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.domain.Contact;

public class Persistence2_GetPersistedObject {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager(); //it serve to open connection with the database
    
        //recover a object from database
        Contact contact = null;
        
        em.getTransaction().begin(); //start a transaction
        //recovery the object
        contact = em.find(Contact.class, 3);
        
        //detached
        System.out.println("contact " + contact);
        
    }
}
