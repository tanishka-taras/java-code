import java.awt.*;
public class TextArea30{
TextArea30(){

Frame f = new Frame();

TextArea a1 = new TextArea("Welcome to Notepad");
a1.setBounds(10,30,1700,1700);
f.add(a1);
f.setSize(500,500); 
f.setLayout(null);
f.setVisible(true);

MenuBar mb=new MenuBar();  
         Menu menu=new Menu("File");  
         MenuItem i1=new MenuItem("New ctrl+N");  
         MenuItem i2=new MenuItem("open ctrl+O");  
         MenuItem i3=new MenuItem("Save ctrl+S");  
         MenuItem i4=new MenuItem("Save As ctrl+Shift+S");  
         MenuItem i5=new MenuItem("Exit");  
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         menu.add(i4);  
         menu.add(i5);  
         mb.add(menu);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true); 
 

         Menu m1=new Menu("Edit");  
         MenuItem t1=new MenuItem("Undo ctrl+Z");  
         MenuItem t2=new MenuItem("Paste ctrl+V");  
         MenuItem t3=new MenuItem("Find ctrl+F");  
         MenuItem t4=new MenuItem("Replace ctrl+H");  
         MenuItem t5=new MenuItem("Go To ctrl+ G");  
         m1.add(t1);
         m1.add(t2);  
         m1.add(t3);  
         m1.add(t4);  
         m1.add(t5);  
         mb.add(m1);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true); 

         Menu submenu=new Menu("Sub Menu"); 
         Menu m9=new Menu("Format");  
         MenuItem p1=new MenuItem("Word Wrap");  
         MenuItem p2=new MenuItem("Font");
         MenuItem p3=new MenuItem("Copper");  
         MenuItem p4=new MenuItem("Elephant");  
         MenuItem p5=new MenuItem("Gill sans"); 
         m9.add(p1);  
         m9.add(p2); 
         submenu.add(p3); 
         submenu.add(p4); 
         submenu.add(p5); 
         m9.add(submenu);
         mb.add(m9);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true); 




}
public static void main(String arrgs[]){
new TextArea30();
}
}


