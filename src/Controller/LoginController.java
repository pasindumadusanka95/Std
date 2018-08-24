/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.DbHandler;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class LoginController {
    
     public boolean validate_login(String username,String password) {
   try{           
  
       String query = "SELECT * FROM grup_project.user_login WHERE username='" + username + "' AND password='" + password + "' ";
       ResultSet rs = DbHandler.getData(query);;                        
       if(rs.next())            
           return true;    
       else
           return false;            
   }
   catch(Exception e){
       e.printStackTrace();
       return false;
   }       
}
    
}
