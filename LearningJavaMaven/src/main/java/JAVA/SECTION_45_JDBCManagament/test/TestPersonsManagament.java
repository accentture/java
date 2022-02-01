
package JAVA.SECTION_45_JDBCManagament.test;

import JAVA.SECTION_45_JDBCManagament.data.PersonDAO;
import JAVA.SECTION_45_JDBCManagament.domain.Person;
import java.util.List;

//to download driver myslq connection: https://dev.mysql.com/downloads/mysql/
public class TestPersonsManagament {
    
    static PersonDAO personDAO = new PersonDAO();
    
    /*  
        --after we have done all previous code, we have applied the text concepts
            *low coupling
            *hight cohesion
    */
    
    public static void main(String[] args) {
        getRegisters();
        insertRegister();
    }
    public static void getRegisters(){
        List<Person> people = personDAO.getPersons();
        
//        for(Person person: people){
//            System.out.println("person = " + person);
//        }
        
        //using lambda
        people.forEach( (Person person) -> {
            System.out.println("person = " + person );
        });
    }
    
    public static void insertRegister(){
        Person person = new Person("juan", "juan", "juan@juan.com", 951753);
        int recordInserted = personDAO.insertPerson(person);
        System.out.println("recordInserted = " + recordInserted);
    }
}
