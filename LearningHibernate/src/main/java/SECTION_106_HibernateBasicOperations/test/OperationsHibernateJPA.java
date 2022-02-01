package SECTION_106_HibernateBasicOperations.test;

import SECTION_106_HibernateBasicOperations.mx.com.gm.dao.PersonDAO;
import SECTION_106_HibernateBasicOperations.mx.com.gm.domain.Person;

public class OperationsHibernateJPA {

    public static void main(String[] args) {
          insert();
//        update();
//        remove();
    }

    static void insert() {
        PersonDAO personDao = new PersonDAO();
        personDao.list();

        Person person = new Person();
        person.setName("Carlos");
        person.setSurnames("Lara");
        person.setEmail("carlos@lara.com");
        person.setPhone("985236147");

        personDao.insert(person);
    }

    static void update() {
        PersonDAO personDao = new PersonDAO();

        Person person = new Person();
        person.setIdPerson(27);

        person = personDao.findPersonById(person);

//        person.setName("Carlos");
        person.setSurnames("Laurita");
        person.setEmail("carlos@laurita.com");
//        person.setPhone("985236147");

        personDao.modify(person);
        personDao.list();

    }

    static void remove() {
        PersonDAO personDao = new PersonDAO();

        Person person = new Person();
        person.setIdPerson(27);

        person = personDao.findPersonById(person);

        personDao.remove(person); //we can remove the record directly by id also
        personDao.list();
    }
}
