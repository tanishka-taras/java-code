import java.awt.*;
import javax.swing.*;  
class IconExample {   
IconExample(){   
JFrame f = new JFrame();   
Image icon = Toolkit.getDefaultToolkit().getImage("image.png");  
f.setIconImage(icon);  
f.setLayout(null);   
f.setSize(200,200);   
f.setVisible(true);   
}   
public static void main(String args[]){   
new IconExample();   
}   
}  