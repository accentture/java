
package JAVA.SECTION_45_JDBCManagament.data;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/javadatabase";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";
    
                                           //method reporting exception
    public static Connection getConnection() throws SQLException{
        Connection conexion = DriverManager.getConnection(JDBC_URL, "root", "");
        return conexion;
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    //PreparedStatement object has better performance that Statement object
    public static void close(PreparedStatement psmtm) throws SQLException{
        psmtm.close();
    }
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
