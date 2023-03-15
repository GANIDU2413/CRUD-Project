/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentcrud;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ganidusahan
 */
public class DBconnect {
    
    public static Connection connect(){
       Connection con = null;
        
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8889/mynewdb","root","root");
           
           
           
       }catch(Exception e){
           System.out.println(e);
       }
       
       return con;
    }
    
    
}
