//package chapter_4;
import javax.swing.*;

public class Program_swing_02 {
    public static void main(String args[]){

        JFrame f = new JFrame(); //instance of JFrame
        JButton b = new JButton("Click me"); //instance of buttone
        b.setBounds(130,100,100,40);

        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
