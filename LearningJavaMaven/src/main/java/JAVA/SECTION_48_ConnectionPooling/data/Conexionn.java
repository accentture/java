package JAVA.SECTION_48_ConnectionPooling.data;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexionn {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/javadatabase";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    
    //it will be a connection to connection pool
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        
        //defining size of connection pool
        ds.setInitialSize(5); //if we set many connection to our databaes, we might block our application
        return ds;
    }
    //method reporting exception
    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection(); //getting a connection from the connetion pool
    }

    public static void close(ResultSet rs) throws SQLException {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Statement smtm) throws SQLException {
        try {
            smtm.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //PreparedStatement object has better performance that Statement object
    public static void close(PreparedStatement psmtm) throws SQLException {
        try {
            psmtm.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) throws SQLException {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
