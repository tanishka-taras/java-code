import java.sql.*;

public class App {
    public static void main(String args[]){
        String url = "jdbc:mysql://localhost:3306/Election"; // Database details
        String username = "root"; // MySQL credentials
        String password = "root";
        String query = "select * from class"; // Query to be run

        Connection connect ;
        
            // Load and register the driver
            try{

                Class.forName("com.mysql.cj.jdbc.Driver");
                // Establish connection
                connect= DriverManager.getConnection(url, username, password);
                
                System.out.println("Connection Established successfully");
                
                // Create a statement
                Statement st = connect.createStatement();
                
                // Execute the query
                ResultSet rs = st.executeQuery(query);
                
                // Process the results
                while (rs.next()) {
                    String name = rs.getString("name"); // Retrieve name from db
                    System.out.println(name); // Print result on console
                }
                st.close();
                connect.close();
                System.out.println("Connection Closed....");
            }
            catch(Exception e){
                System.out.println(e);
            }

        // Close the statement and connection
   
    }
}

