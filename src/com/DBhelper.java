/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bijaya Khatiwada
 */
public class DBhelper {
    
    private static Connection cn=null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedatabase", "root","Norway123");
      
            return cn;
        } catch (Exception e) {
            e.getMessage();
        }
        
        
        return null;
    }
    
    
    
}
