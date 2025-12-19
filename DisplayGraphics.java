import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas{
public void paint(Graphics g){
g.drawString("Nice to meet you",60,60);
setBackground(Color.WHITE);
g.fillRect(190,40,100,80);
g.drawOval(50,150,70,80);
setForeground(Color.BLUE);
g.fillOval(180,150,60,70);
g.drawArc(30,200,40,50,90,60);      //x,y,w,h,sa,aa

g.fillArc(30,130,40,50,0,180);     //x,y,w,h,sa,aa

}                               
public static void main(String[] args){
DisplayGraphics dg=new DisplayGraphics();
JFrame f = new JFrame();
f.add(dg);
f.setSize(400,400);
f.setVisible(true);
}
}