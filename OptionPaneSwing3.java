import javax.swing.*;  
public class OptionPaneSwing3{  
JFrame f;  
OptionPaneSwing3(){  
    f=new JFrame();  
       String name=JOptionPane.showInputDialog(f,"Enter Name");      

}  
public static void main(String[] args) {  
    new OptionPaneSwing3();  
}  
}  
