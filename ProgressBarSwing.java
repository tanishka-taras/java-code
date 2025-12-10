import javax.swing.*;
public class ProgressBarSwing extends JFrame{
JProgressBar pb;
int i=0 ,num=0;
ProgressBarSwing(){
pb=new JProgressBar(0,2000);
pb.setBounds(40,40,160,30);
pb.setValue(0);
pb.setStringPainted(true);
add(pb);
setSize(250,150);
setLayout(null);
}
public void iterate(){
while(i<=2000){
pb.setValue(i);
i=i+30;
try{Thread.sleep(150);}
catch(Exception e){}
}
}
public static void main(String[] args){
ProgressBarSwing m = new ProgressBarSwing();
m.setVisible(true);
m.iterate();
}
}
 