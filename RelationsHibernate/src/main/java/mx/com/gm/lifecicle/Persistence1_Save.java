package mx.com.gm.lifecicle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.domain.Contact;

public class Persistence1_Save {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager(); //it serve to open connection with the database
    
        //1. transitive state : it has not a representation in the database
        Contact contact = new Contact();
        contact.setEmail("clara");
        contact.setPhone("9515637895");
        
        //2 persisted state:
        //we need to start a transaction
        em.getTransaction().begin();
        em.persist(contact); //persist : we use persist() method instead of save() method to sincronize with the database
//        em.flush(); //flush() :only sincronize our data with the database

        em.getTransaction().commit();
        
        //3. detached : our object is sincronized with the database, but if we make a modification over our object it will be losed due that this object is not sincronized with the database between a transaction
        
        System.out.println("contact " + contact);
        
    }
}
