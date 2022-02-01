package SECTION_105_HibernateFrameworkIntroduction.test;
import java.util.List;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import SECTION_105_HibernateFrameworkIntroduction.mx.com.gm.domain.Person1;

public class HiWorldHibernate {
    public static void main(String[] args) {

        String hql = "SELECT p FROM Person p";
                //hql : hibernate query language
                //p: it is the name aliased of our java class
                //Person: it is name of our entity class
                
        //using class entity manager factory to connect  with database
        //this configuration was added in src/main/resources
                                                                        //HibernateExample1: this name was provided in our persistence.xml    
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("HibernateExample1");
        EntityManager entityManager = factory.createEntityManager();
    
        Query query = entityManager.createQuery(hql);
        List<Person1> people = query.getResultList();
        
        for(Person1 p: people){
            System.out.println("Person " + p);
        }
    }
}

