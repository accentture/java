package mx.com.gm.HiSpirng2.service;

import java.util.List;
import mx.com.gm.HiSpirng2.domain.Person;

public interface PersonService {
    public List<Person> listPeople();
    
    public void save(Person person);

    public void remove(Person person);
    
    public Person findPerson(Person person);
}
