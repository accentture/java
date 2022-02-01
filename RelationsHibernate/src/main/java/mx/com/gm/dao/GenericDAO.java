package mx.com.gm.dao;

//we don't instantiate abstract class

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericDAO {
    
    //we can access from child classes
    protected static EntityManager em;
    
    private static EntityManagerFactory emf;
    
    private static final String PU  = "HibernateJpaPU";


    public GenericDAO(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PU);
        }
    }
    
    protected EntityManager getEntityManager(){
        if(em == null){
            em = emf.createEntityManager();
        }
        return em;
    }
    
    
}
