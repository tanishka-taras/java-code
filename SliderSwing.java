import javax.swing.*;  
public class SliderSwing extends JFrame{  
public SliderSwing() {  
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
JPanel panel=new JPanel();  
panel.add(slider);  
add(panel);  
}  
  
public static void main(String s[]) {  
SliderSwing frame=new SliderSwing();  
frame.pack();  
frame.setVisible(true);  
}  
}  