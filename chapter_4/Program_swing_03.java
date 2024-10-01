//package chapter_4;
import javax.swing.*;
public class Program_swing_03 extends JFrame{
    JFrame j;
    Program_swing_03(){
        j = new JFrame();
        JButton b = new JButton("click me");
        b.setBounds(130,100,100,40);
        
        setSize(500,500);
        add(b);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        Program_swing_03 obj = new Program_swing_03();
    }
    
}
