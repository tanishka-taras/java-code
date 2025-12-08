import javax.swing.*;
public class PasswordField10{
public static void main(String[] args){
JFrame f = new JFrame("Password Field");
JPasswordField pw = new JPasswordField();
JLabel l1 = new JLabel("Password");
l1.setBounds(20,100,80,30);
pw.setBounds(100,100,100,30);
f.add(pw);
f.add(l1);
f.setLayout(null);
f.setVisible(true);
}
}
 