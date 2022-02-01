package mx.com.gm.service;

import java.util.List;
import mx.com.gm.dao.PersonDAO;

import mx.com.gm.domain.Person;
public class PeopleService {
    private PersonDAO personDao; 
    
    public PeopleService(){
        this.personDao = new PersonDAO();
    }
    public List<Person> listPeople(){
        return this.personDao.list();
    }
}
