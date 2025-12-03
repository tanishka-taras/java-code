import java.awt.*;   
class Toolkiticon {   
Toolkiticon(){   
Frame f=new Frame();   
Image icon = Toolkit.getDefaultToolkit().getImage("image.png");  
f.setIconImage(icon);  
f.setLayout(null);   
f.setSize(400,400);   
f.setVisible(true);   
}   
public static void main(String args[]){   
new Toolkiticon();   
}   
}  