import javax.swing.*;  
public class OptionPaneSwing2 {  
JFrame f;  
OptionPaneSwing2(){  
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,"Successfully updated.","Alert",JOptionPane.WARNING_MESSAGE);  
}  
public static void main(String[] args) {  
    new OptionPaneSwing2();  
}  
}  
