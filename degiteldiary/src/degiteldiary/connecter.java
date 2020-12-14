/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degiteldiary;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sanjeev
 */
public class connecter {
     
    public static Connection newdata() {
        
        
        Connection con=null;
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegeportal","root","");
             
                
            } 
        
         catch (Exception e) 
            {
             System.out.println(e.getMessage());
             
            }
        
    
        return con;
        
    
}
     
}
