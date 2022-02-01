/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zDesignPatterns.RepositoryJoinWithFactory;

import com.mysql.cj.Session;
import java.io.File;


/*
    --it must exists a class that implements the repository interface
*/

public class HibernatePersonPersister implements CustomerRepository {
    public  HibernatePersonPersister(){
       
    }
    
    Session sesion = null; // a session serve to run diffferent mysql cluster
    
    @Override
    public void create(Person customer){
        
    }
    @Override
    public Person read(int id){
        Person person = new Person();
        return person;
    }
    @Override
    public void update(Person customer){
        
    }
    @Override
    public void delete(Person customer){
        
    }
    
    static HibernatePersonPersister newInstance(){
        return new HibernatePersonPersister();
    }
}
