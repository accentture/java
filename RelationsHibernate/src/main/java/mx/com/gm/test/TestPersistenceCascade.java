package mx.com.gm.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.domain.Address;
import mx.com.gm.domain.Contact;
import mx.com.gm.domain.Student;

public class TestPersistenceCascade {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager(); //it serve to open connection with the database

        Address address = new Address();
        address.setStreet("Nogales");
        address.setNoStreet("10");
        address.setCountry("México");
    
        Contact contact = new Contact();
        contact.setEmail("clara@mail.com");
        contact.setPhone("951533654");
    
    
        //the order to store will be the next: address, contact and student
        Student student = new Student();
        student.setNames("Carlos");
        student.setSurnames("Lara");
        student.setContact(contact);
        student.setAddress(address);
        
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        
        System.out.println("student" + student);
        
    }

}
