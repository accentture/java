package JAVA.SECTION_48_ConnectionPooling.test;

import JAVA.SECTION_48_ConnectionPooling.data.Conexionn;
import JAVA.SECTION_48_ConnectionPooling.data.PersonDAO;
import JAVA.SECTION_48_ConnectionPooling.data.PersonDAO_JDBC;
import JAVA.SECTION_48_ConnectionPooling.domain.PersonDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/*
    --a connection pool allow agilizate the process to get a connection for every class that need a connection
    --the target connection pool is to have many connections to database, the process to get and free a database connection must be efficient
    --it allows us not take care to open and close a connection

    --we will use APACHE JDBC to get a connection pool. Other options are tomcat, glasfish, jboss, etc that will be manage the connecion pool
*/

public class TestPersonsManagament {

    static PersonDAO_JDBC personDAO = new PersonDAO_JDBC();

    public static void main(String[] args) throws SQLException {

        Connection conexion = null;
        try {
            conexion = Conexionn.getConnection();
            if (conexion.getAutoCommit()) {

                conexion.setAutoCommit(false);
            }
            PersonDAO personDao = new PersonDAO_JDBC(conexion);
            List<PersonDTO> persons =  personDao.getPersons();

            for(PersonDTO person: persons){
                System.out.println("person DTO = " + person);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("-------------Entering to rollback");
                conexion.rollback();
//            try {
//            } catch (SQLException ex1) {
//                ex1.printStackTrace(System.out);
//            }
        }
    }


}
