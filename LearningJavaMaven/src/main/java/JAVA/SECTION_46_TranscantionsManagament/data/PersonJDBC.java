package JAVA.SECTION_46_TranscantionsManagament.data;



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
public class PersonJDBC {

    private Connection transactionalConnection;
    private static final String SQL_SELECT = "SELECT id, name, surnames, email, phone FROM persons";
    private static final String SQL_INSERT = "INSERT INTO persons(name, surnames, email, phone) VALUES(?, ?, ?, ? )";

    public PersonJDBC() {
    }

    //in transacctions we don't close the connection every time that a method is executed
    public PersonJDBC(Connection transactionalConnection) {
        this.transactionalConnection = transactionalConnection;
    }
                                    //to propagate the SQLException
    public List<Person> getPersons() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Person person = null;
        List<Person> persons = new ArrayList<>();

        try {
            conn = this.transactionalConnection != null ? this.transactionalConnection : Conexionn.getConnection();
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
        } 

        //removing catch block to can make rollback
        finally {
            //closing connection objects in reverse way

            Conexionn.close(rs);
            Conexionn.close(stmt);

            if (this.transactionalConnection == null) {
                Conexionn.close(conn);

            }

        }

        return persons;
    }
                                        //to propagate the SQLException
    public int insertPerson(Person person) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registers = 0;

        try {
            conn = this.transactionalConnection != null ? this.transactionalConnection : Conexionn.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            //using setString() method to save string params
            //the first param is the index of elment to replace
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getSurnames());
            stmt.setString(3, person.getEmail());
            stmt.setInt(4, person.getPhone());

            //executeQuery() is diferent from executeUpdate()
            registers = stmt.executeUpdate(); //executeUpdate(): modify the state of database for instance insert, update or delete

        } 

        //removing catch block to can make rollback
        finally {
            Conexionn.close(stmt);
            if (this.transactionalConnection == null) {
                Conexionn.close(conn);

            }
            
        }

        return registers;
    }

}
