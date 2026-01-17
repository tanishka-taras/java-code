import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UI {



    private static final String URL = "jdbc:mysql://localhost:3306/phase1";
    private static final String USER = "root";   // change if different
    private static final String PASSWORD = "root"; // change to your MySQL 

    Frame f = new Frame("student info");
    TextField tf, tf2, tf3, tf4;
    Label l, l2, l3, l4;
    Button b, b1;
    JFrame f2;

    String data[][] = new String[10][4];
    String column[] = { "NAME", "ID", "PASSWORD", "AGE" };
    int rowNo = 0;

    UI() {


        l = new Label("Student name:");
        l.setBounds(50, 90, 150, 30);
        tf = new TextField();
        tf.setBounds(200, 90, 150, 30);

        l2 = new Label("Student ID:");
        l2.setBounds(50, 130, 150, 30);
        tf2 = new TextField();
        tf2.setBounds(200, 130, 150, 30);

        l3 = new Label("Student password:");
        l3.setBounds(50, 170, 150, 30);
        tf3 = new TextField();
        tf3.setEchoChar('*');
        tf3.setBounds(200, 170, 150, 30);

        l4 = new Label("Age:");
        l4.setBounds(50, 210, 150, 30);
        tf4 = new TextField();
        tf4.setBounds(200, 210, 150, 30);

        b = new Button("Submit");
        b.setBounds(125, 270, 100, 30);

        b1 = new Button("View Students");
        b1.setBounds(125, 330, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tf.getText();
                int id = Integer.parseInt(tf2.getText());
                String pass = tf3.getText();
                int age = Integer.parseInt(tf4.getText());

            //    DB CODE 
                UI.insertStudent(name, id,pass, age);
                UI.getAllStudents();
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            try(
                Connection conn = UI.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            ) {
                
           
                DefaultTableModel model = new DefaultTableModel();
                JTable table = new JTable(model);
                // Get column names (example)

                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    model.addColumn(metaData.getColumnName(i));
                }

                // Add data rows
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }
               
                // 5: Display (in a JFrame)
                JFrame frame = new JFrame("Database Data");
                frame.add(new JScrollPane(table));
                frame.setSize(500, 300);
                frame.setVisible(true);
                // f2 = new JFrame();
                // JTable jt = new JTable(data, column);
                // jt.setBounds(30, 40, 200, 300);
                // JScrollPane sp = new JScrollPane(jt);
                // f2.add(sp);
                // Button b1 = new Button("Back");
                // f2.setSize(300, 400);
                // f2.setVisible(true);
    

         } catch (Exception e1) {
            System.err.println("error : "+e1);
        }
    }
        });

        f.add(b);
        f.add(b1);
        f.add(tf);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(l);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    } 

    public static void insertStudent(String name, int id, String password, int age) {
        String sql = "INSERT INTO student(name, id,password, age) VALUES (?, ?, ?,?)";

        try (Connection conn = UI.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setInt(2, id);
            stmt.setString(3, password);
            stmt.setInt(4, age);

            int rows = stmt.executeUpdate();
            System.out.println(rows + " student inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static void getAllStudents() {
            String sql = "SELECT * FROM student";



            try (Connection conn = UI.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    System.out.println(rs.getString("name") + " | " +
                                    rs.getInt("id") + " | " +
                                    rs.getString("password") + " | " +
                                    rs.getInt("age"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}





