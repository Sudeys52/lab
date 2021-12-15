package swingframe;

 import javax.swing.*;
 import javax.swing.JButton;
 
import java.awt.*;


public class Swingframe extends javax.swing.JFrame {

   
    
   
    public static void main(String[] args) {
        JFrame frame = new JFrame("my first gui program");
        JPanel p = new JPanel();
        JButton b = new JButton("click me");
         JLabel  l= new JLabel("HI ALL");
         JTextField  j = new JTextField(20);
        
         b.setBackground(Color.red);
         j.setBackground(Color.green);
         p.add(j);;
         p.add(b);
          p.add(j);
           p.add(l);
           frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        
    }
    
}

   
   
    
   
 
