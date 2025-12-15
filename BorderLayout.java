import java.awt.*;
import javax.swing.*;
public class BorderLayout{
JFrame f;
Border(){
f= new JFrame();
JButton b1 = new JButton("Top");
JButton b2 = new JButton("Bottom");
JButton b3 = new JButton("Right");
JButton b4 = new JButton("Left");
JButton b5 = new JButton("Center");

f.add(b1, BorderLayout.NORTH); 
    f.add(b2, BorderLayout.SOUTH); 
    f.add(b3, BorderLayout.EAST); 
    f.add(b4, BorderLayout.WEST);      
    f.add(b5, BorderLayout.CENTER);  
        
    f.setSize(300, 300);    
    f.setVisible(true);    
}    
public static void main(String[] args) {    
    new BorderLayout();    
}    
}    