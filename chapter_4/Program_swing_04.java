//JLable
import javax.swing.*;
public class Program_swing_04 {
    public static void main(String args[]){
        JFrame f = new JFrame("Frame title");
        JLabel l1,l2;
        l1 = new JLabel("lable 1");
        l2 = new JLabel("lable 2"); 
        
        l1.setBounds(50,50,50,30);
        l2.setBounds(150,50,50,30);
        f.setLayout(null);
        f.add(l1); f.add(l2);
    
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
