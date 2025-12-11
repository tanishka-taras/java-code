import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
class FileChooserSwing{
public static void main(String[] args){
JFileChooser jf = new JFileChooser();
jf.showSaveDialog(null);
}
}