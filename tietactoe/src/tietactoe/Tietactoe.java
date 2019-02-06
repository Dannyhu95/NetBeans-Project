/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dannyhu
 */
public class Tietactoe {
  static boolean player1turn = true;
  static boolean player2turn =false;
    /**
     * @param args the command line arguments
     */
    private static JButton[] buttons  = new JButton[9];
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("TIC TAC TOE");
        frame.setVisible(true);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3,10,10));
        frame.add(panel);
        for(int i = 0; i < buttons.length; i++)
        {
          buttons[i] = new JButton(); 
          buttons[i].setOpaque(true);
          panel.add(buttons[i]);
          buttons[i].addActionListener (new Action());
        }
        System.out.println("Player 1's turn");
    }
    static class Action implements ActionListener { 
        public void actionPerformed (ActionEvent e) {  
            if (player1turn == true){
                System.out.println("Player 2's turn");
                for(int i = 0; i < buttons.length; i++)
                {
                    if(buttons[i] == e.getSource()){
                        buttons[i].setText("X");
                        player1turn = false;
                        player2turn = true;
                    }
                }
            }
            else if (player2turn == true){
                System.out.println("Player 1's turn");
                for(int i = 0; i < buttons.length; i++)
                {
                    if(buttons[i] == e.getSource()){
                        buttons[i].setText("O");
                        player2turn = false;
                        player1turn = true;
                    }
                }
            }
            if( buttons[0].getText() == "X" & buttons[1].getText() == "X" & buttons[2].getText() == "X"){
                 System.out.println("Player 1 has Won");
                 buttons[0].setBorderPainted(false);
                 buttons[0].setBackground(Color.RED);
                 buttons[1].setBorderPainted(false);
                 buttons[1].setBackground(Color.RED);
                 buttons[2].setBorderPainted(false);
                 buttons[2].setBackground(Color.RED);
            }
            else if( buttons[0].getText() == "O" & buttons[1].getText() == "O" & buttons[2].getText() == "O"){
                 System.out.println("Player 2 has Won");
                 buttons[0].setBorderPainted(false);
                 buttons[0].setBackground(Color.RED);
                 buttons[1].setBorderPainted(false);
                 buttons[1].setBackground(Color.RED);
                 buttons[2].setBorderPainted(false);
                 buttons[2].setBackground(Color.RED);
            }
            else if( buttons[3].getText() == "X" & buttons[4].getText() == "X" & buttons[5].getText() == "X"){
                 System.out.println("Player 1 has Won");
                 buttons[3].setBorderPainted(false);
                 buttons[3].setBackground(Color.RED);
                 buttons[4].setBorderPainted(false);
                 buttons[4].setBackground(Color.RED);
                 buttons[5].setBorderPainted(false);
                 buttons[5].setBackground(Color.RED);
            }
            else if( buttons[3].getText() == "O" & buttons[4].getText() == "O" & buttons[5].getText() == "O"){
                 System.out.println("Player 2 has Won");
                 buttons[3].setBorderPainted(false);
                 buttons[3].setBackground(Color.RED);
                 buttons[4].setBorderPainted(false);
                 buttons[4].setBackground(Color.RED);
                 buttons[5].setBorderPainted(false);
                 buttons[5].setBackground(Color.RED);
            }
            else if( buttons[6].getText() == "X" & buttons[7].getText() == "X" & buttons[8].getText() == "X"){
                 System.out.println("Player 1 has Won");
                 buttons[6].setBorderPainted(false);
                 buttons[6].setBackground(Color.RED);
                 buttons[7].setBorderPainted(false);
                 buttons[7].setBackground(Color.RED);
                 buttons[8].setBorderPainted(false);
                 buttons[8].setBackground(Color.RED);
            }
            else if( buttons[6].getText() == "O" & buttons[7].getText() == "O" & buttons[8].getText() == "O"){
                 System.out.println("Player 2 has Won");
                 buttons[6].setBorderPainted(false);
                 buttons[6].setBackground(Color.RED);
                 buttons[7].setBorderPainted(false);
                 buttons[7].setBackground(Color.RED);
                 buttons[8].setBorderPainted(false);
                 buttons[8].setBackground(Color.RED);
            }
            else if( buttons[0].getText() == "X" & buttons[3].getText() == "X" & buttons[6].getText() == "X"){
                 System.out.println("Player 1 has Won");
                 buttons[0].setBorderPainted(false);
                 buttons[0].setBackground(Color.RED);
                 buttons[3].setBorderPainted(false);
                 buttons[3].setBackground(Color.RED);
                 buttons[6].setBorderPainted(false);
                 buttons[6].setBackground(Color.RED);
            }
            else if( buttons[0].getText() == "O" & buttons[3].getText() == "O" & buttons[6].getText() == "O"){
                 System.out.println("Player 2 has Won");
                 buttons[0].setBorderPainted(false);
                 buttons[0].setBackground(Color.RED);
                 buttons[3].setBorderPainted(false);
                 buttons[3].setBackground(Color.RED);
                 buttons[6].setBorderPainted(false);
                 buttons[6].setBackground(Color.RED);
            }
            else if( buttons[1].getText() == "X" & buttons[4].getText() == "X" & buttons[7].getText() == "X"){
                 System.out.println("Player 1 has Won");
                 buttons[1].setBorderPainted(false);
                 buttons[1].setBackground(Color.RED);
                 buttons[4].setBorderPainted(false);
                 buttons[4].setBackground(Color.RED);
                 buttons[7].setBorderPainted(false);
                 buttons[7].setBackground(Color.RED);
            }
            else if( buttons[1].getText() == "O" & buttons[4].getText() == "O" & buttons[7].getText() == "O"){
                 System.out.println("Player 2 has Won");
                 buttons[1].setBorderPainted(false);
                 buttons[1].setBackground(Color.RED);
                 buttons[4].setBorderPainted(false);
                 buttons[4].setBackground(Color.RED);
                 buttons[7].setBorderPainted(false);
                 buttons[7].setBackground(Color.RED);
            }
            else if( buttons[2].getText() == "X" & buttons[5].getText() == "X" & buttons[8].getText() == "X"){
                 System.out.println("Player 1 has Won");
                 buttons[2].setBorderPainted(false);
                 buttons[2].setBackground(Color.RED);
                 buttons[5].setBorderPainted(false);
                 buttons[5].setBackground(Color.RED);
                 buttons[8].setBorderPainted(false);
                 buttons[8].setBackground(Color.RED);
            }
            else if( buttons[2].getText() == "O" & buttons[5].getText() == "O" & buttons[8].getText() == "O"){
                 System.out.println("Player 2 has Won");
                 buttons[2].setBorderPainted(false);
                 buttons[2].setBackground(Color.RED);
                 buttons[5].setBorderPainted(false);
                 buttons[5].setBackground(Color.RED);
                 buttons[8].setBorderPainted(false);
                 buttons[8].setBackground(Color.RED);
            }
            else if( buttons[0].getText() == "X" & buttons[4].getText() == "X" & buttons[8].getText() == "X"){
                 System.out.println("Player 1 has Won");
                 buttons[0].setBorderPainted(false);
                 buttons[0].setBackground(Color.RED);
                 buttons[4].setBorderPainted(false);
                 buttons[4].setBackground(Color.RED);
                 buttons[8].setBorderPainted(false);
                 buttons[8].setBackground(Color.RED);
            }
            else if( buttons[0].getText() == "O" & buttons[4].getText() == "O" & buttons[8].getText() == "O"){
                 System.out.println("Player 2 has Won");
                 buttons[0].setBorderPainted(false);
                 buttons[0].setBackground(Color.RED);
                 buttons[4].setBorderPainted(false);
                 buttons[4].setBackground(Color.RED);
                 buttons[8].setBorderPainted(false);
                 buttons[8].setBackground(Color.RED);
            }
            else if( buttons[2].getText() == "X" & buttons[4].getText() == "X" & buttons[6].getText() == "X"){
                 System.out.println("Player 1 has Won");
                 buttons[2].setBorderPainted(false);
                 buttons[2].setBackground(Color.RED);
                 buttons[4].setBorderPainted(false);
                 buttons[4].setBackground(Color.RED);
                 buttons[6].setBorderPainted(false);
                 buttons[6].setBackground(Color.RED);
            }
            else if( buttons[2].getText() == "O" & buttons[4].getText() == "O" & buttons[6].getText() == "O"){
                 System.out.println("Player 2 has Won");
                 buttons[2].setBorderPainted(false);
                 buttons[2].setBackground(Color.RED);
                 buttons[4].setBorderPainted(false);
                 buttons[4].setBackground(Color.RED);
                 buttons[6].setBorderPainted(false);
                 buttons[6].setBackground(Color.RED);
            }
            
            
            
            
            
        }
    }
    
    
       
    }
   
