package JAVA.SECTION_45_JDBCManagament.data;

import static JAVA.SECTION_45_JDBCManagament.data.Conexion.*;
import JAVA.SECTION_45_JDBCManagament.domain.Person;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//using DAO (Data Access Object) pattern 
public class PersonDAO {

    private static final String SQL_SELECT = "SELECT id, name, surnames, email, phone FROM persons";
    private static final String SQL_INSERT = "INSERT INTO persons(name, surnames, email, phone) VALUES(?, ?, ?, ? )";

    public List<Person> getPersons() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Person person = null;
        List<Person> persons = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {

                //in java we should void usar sub guion ( _ )
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surnames = rs.getString("surnames");
                String email = rs.getString("email");
                int phone = rs.getInt("phone");

                //converting information from database to java objects
                person = new Person(id, name, surnames, email, phone);
                persons.add(person);
            }
        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
            //Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //closing connection objects in reverse way

                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return persons;
    }

    public int insertPerson(Person person) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registers = 0;

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            //using setString() method to save string params
            //the first param is the index of elment to replace
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getSurnames());
            stmt.setString(3, person.getEmail());
            stmt.setInt(4, person.getPhone());

            //executeQuery() is diferent from executeUpdate()
            registers = stmt.executeUpdate(); //executeUpdate(): modify the state of database for instance insert, update or delete

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            //Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                
                //sending message to standart console
                ex.printStackTrace(System.out);
            }
        }
 
        return registers;
    }

}
