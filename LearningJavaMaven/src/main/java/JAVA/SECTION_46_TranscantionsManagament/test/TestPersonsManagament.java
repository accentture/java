package JAVA.SECTION_46_TranscantionsManagament.test;

/*
                IMPORTANT: MY TRANSACTION DOES NOT WORKING       :(

*/

import JAVA.SECTION_46_TranscantionsManagament.data.PersonJDBC;
import JAVA.SECTION_45_JDBCManagament.domain.Person;
import JAVA.SECTION_46_TranscantionsManagament.data.Conexionn;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    --a transaction is execute many sql statement in a block, but it more important in a transaction the sql statment that modify state of database

    --use methods of transaction
        1. autocommit (true or false ): false-> it to void a commit inmediately, by default it is true
        2. If there is not error we make a commit, that is to say save changes of code block that was executed
        3. rollback: revert changes maked by execution block

IMPORTANT: if we close the database connection, a commit is done automatically even if we disable autocommit
 */
public class TestPersonsManagament {

    static PersonJDBC personDAO = new PersonJDBC();

    public static void main(String[] args) throws SQLException {

        Connection conexion = null;
        try {
            conexion = Conexionn.getConnection();

            //checking if the connection is in autocommit mode
            if (conexion.getAutoCommit()) {

            System.out.println("cutommit ----------- " + conexion.getAutoCommit());
                //false : it because we want to make commit but not inmediately but we want to make commit of all transaction
                conexion.setAutoCommit(false);
            }
            System.out.println("cutommit ----------- " + conexion.getAutoCommit());
            PersonJDBC personDAO = new PersonJDBC(conexion);
            Person person1 = new Person("luis", "luis", "luis@luis.com", 951753);
            personDAO.insertPerson(person1);
            
            Person person2 = new Person();
            person2.setName("javier javier javier javier javier javier");
            person2.setSurnames("javier");
            personDAO.insertPerson(person2);
            //insertRegisters(conexion);
            conexion.commit(); //making commit of a transaction

        } catch (SQLException ex) {
            //Logger.getLogger(TestPersonsManagament.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace(System.out);
            System.out.println("-------------Entering to rollback");
                conexion.rollback();
//            try {
//            } catch (SQLException ex1) {
//                ex1.printStackTrace(System.out);
//            }
        }
    }

    public static void insertRegisters(Connection conexion) throws SQLException {
        PersonJDBC personDAO1 = new PersonJDBC(conexion);
        Person person1 = new Person("luis", "luis", "luis@luis.com", 951753);
        personDAO1.insertPerson(person1);

        PersonJDBC personDAO2 = new PersonJDBC(conexion);
        Person person2 = new Person();
        person2.setName("javier");
        person2.setSurnames("javier");
        personDAO2.insertPerson(person2);
    }

}
