/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dannyhu
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    private static JButton[] buttons  = new JButton[12];
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("HELLO");
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,4,10,10));
    
        frame.add(panel);
        for(int i = 0; i < buttons.length; i++)
        {
        buttons[i] = new JButton((i+1)+"");
        buttons[i].setOpaque(true);
        buttons[i].setBackground(new Color((int)(Math.random() * 0x1000000)));
        buttons[i].setBorderPainted(false);
        panel.add(buttons[i]);
        buttons[i].addActionListener (new Action());
        }
    }
    static class Action implements ActionListener { 
        public void actionPerformed (ActionEvent e) {  
            for(int i = 0; i < buttons.length; i++)
            {
                if(buttons[i] != e.getSource()){
                    buttons[i].setBackground(new Color((int)(Math.random() * 0x1000000)));
                }
            }
        }
    }
 }
