package mx.com.gm.HiSpirng2.service;

import java.util.List;
import mx.com.gm.HiSpirng2.dao.PersonDao;
import mx.com.gm.HiSpirng2.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; //use transaction from SpringBoot

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonDao personDao;
    
    @Override
                    //readOnly = true : only to read
    @Transactional(readOnly = true) //we can make a transaction from domain layer, it will prevent save data when we work with many tables or one table
    public List<Person> listPeople() {
                
              //cast to list
        return (List<Person>) personDao.findAll();
    }

    @Override
    @Transactional
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    @Transactional
    public void remove(Person person) {
        personDao.delete(person);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findPerson(Person person) {
                                                    //orElse(null) : to return null if doesn't exist the object
        return personDao.findById(person.getIdPerson()).orElse(null);
        
    }
    
    
    
}
