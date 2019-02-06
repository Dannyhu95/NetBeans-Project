/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;
import java.io.*;
import java.net.*;
        
/**
 *
 * @author dannyhu
 */
// num + 127+14+7*622-120
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    static int result;
    static int result2;
    public static void main(String[] args) {
        // TODO code application logic here
       try{
       Socket s = new Socket("172.16.13.11",1234);
       Scanner sin = new Scanner(s.getInputStream());
       PrintStream ps = new PrintStream(s.getOutputStream());
       sin.nextInt();
       result = sin.nextInt();
       result2 = result+127-14+7*622-100;
       System.out.println(result);
       ps.print(result2+" 19201695 /r/n");
       }
    catch(IOException e){
            System.out.println("Connection failed. :(");
        }
    
    }
    
}
