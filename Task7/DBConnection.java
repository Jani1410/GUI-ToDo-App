package Task7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {
        // MySQL Connection Details
        String url = "jdbc:mysql://localhost:3306/employee_db";
        String user = "root";         // change if needed
        String password = "root";

        try {
            // Step 1: Load JDBC Driver (Optional in Java 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Step 3: Verify Connection
            if (conn != null) {
                System.out.println("Connected to Database!");
                conn.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error.");
            e.printStackTrace();
        }
    }
}

