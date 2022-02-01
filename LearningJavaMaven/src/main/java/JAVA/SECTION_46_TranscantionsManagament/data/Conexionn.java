package JAVA.SECTION_46_TranscantionsManagament.data;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Conexionn {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/javadatabase";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

    //method reporting exception
    public static Connection getConnection() throws SQLException {
        Connection conexion = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        return conexion;
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
