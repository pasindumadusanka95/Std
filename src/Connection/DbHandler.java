/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hp
 */
public class DbHandler {
    public static int setData(String query) throws SQLException, ClassNotFoundException {
        Connection conn = Dbconnect.getConnectionToDB();
        Statement stm = conn.createStatement();
        int result = stm.executeUpdate(query);
        return result;
    }

    public static ResultSet getData(String query) throws SQLException, ClassNotFoundException {
        Connection con = Dbconnect.getConnectionToDB();
        Statement stm = con.createStatement();
        ResultSet result = stm.executeQuery(query);
        return result;
    }
    
    
    
    
    
}
