/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Hp
 */
public class Dbconnect {
    
    private static final String url = "jdbc:mysql://localhost:3306/grup_project";
    private static final String user = "root";
    private static final String password ="";  
    private Connection connection;
    private static Dbconnect dBConnector = null;

    public Dbconnect() throws SQLException, ClassNotFoundException {
        connection = null;

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, user, password);

        if (connection == null) {
            System.out.println("Failed to make connection!");
        }
    }

    private static Dbconnect getDBConnector() throws SQLException, ClassNotFoundException {
        if (dBConnector == null) {
            dBConnector = new Dbconnect();
        }
        return dBConnector;
    }

    public static Connection getConnectionToDB() throws SQLException, ClassNotFoundException {
        return getDBConnector().connection;
    }
    
    
    
    
    
    
    
    }
    

