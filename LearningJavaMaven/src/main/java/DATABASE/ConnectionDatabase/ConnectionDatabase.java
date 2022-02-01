/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE.ConnectionDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author LENOVO
 */
public class ConnectionDatabase {
    Connection conexion;

    public ConnectionDatabase() {
        try {
            // declarint the Driver
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdiazdevhotels";

            // this method has 3 params: url, user, password
            conexion = DriverManager.getConnection(url, "root", "");
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
    }

    public static void main(String[] args) {
        ConnectionDatabase connection = new ConnectionDatabase();
        Statement statement;
        ResultSet result;

        try {
            String sql = "select id, name, price, details from rooms";
            statement = connection.conexion.createStatement();
            result = statement.executeQuery(sql);

                            //next() method check if we have elements to iterate
            while (result.next()) {
                
                //using only print instead to printLn
                System.out.print(" id " + result.getInt("id"));
                System.out.print(" name " + result.getString("name"));
                System.out.print(" price " + result.getInt("price"));
                System.out.print(" details " + result.getString("details"));
                System.out.println("");
                
                
            }
            
            // closing the connection of objects connected to database
            result.close();
            connection.conexion.close(); 
            result.close();
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
    }

}
