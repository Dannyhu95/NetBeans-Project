/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.io.*;
import java.sql.*;
/**
 *
 * @author dannyhu
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn = null;
        try{
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             String url = "jdbc:mysql:127.0.0.1/JavaApplication4";
             String dbuser = "hello";
             String dbpass = "abc123";
             conn = DriverManager.getConnection(url, dbuser, dbpass);
             Statement s = conn.createStatement();
             s.executeQuery("select * from test;");
             ResultSet rs = s.getResultSet();
             while(rs.next()){
               int rid = rs.getInt("TID");
               String motto = rs.getString("Motto");
               
             }
             rs.close();
             s.close();
             s=conn.createStatement();
             s.execute("INSERT INTO TEST(Motto, NNum) VALUES('Hello','111111');");
        }
        catch(Exception e){
            
        }
        finally{
            try{
            conn.close();
            }
            catch(Exception e){
                
            }
            
        }
    }
    
}
