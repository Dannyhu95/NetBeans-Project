/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import java.io.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author dannyhu
 */
public class Lab {
    static String moto = null;
    static int nNumber = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*System.out.println("Enter Moto: ");
       Scanner scan = new Scanner(System.in);
       moto = scan.next();
       System.out.println("Enter NNUMBER: ");
       Scanner scan2 = new Scanner(System.in);
       while(scan2.hasNextInt()){
       nNumber  = scan2.nextInt();
       }*/
       Connection conn = null;
        try{
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             String url = "jdbc:mysql://172.16.10.117/cs391";
             String dbuser = "cs391";
            String dbpass = "abc123";
            conn = DriverManager.getConnection(url,dbuser,dbpass);
            Statement s = conn.createStatement();
            s.execute("INSERT INTO TEST(Motto,NNum) VALUES('YOLO SWAGGINS','N19201695');");
        }
        catch(Exception e){
            System.out.println("connectione err");
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
