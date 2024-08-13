//Can run this file multiple times(as it is only to check the check if the connection establishes or not)

import java.sql.*;

public class Connect_file1 {
    public static void main(String[] args) {
        Connection con = null;
        try {
            String userName = "root";
            String password = "Mysqlp@ss23";
            String url = "jdbc:mysql://localhost:3306/";
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // This also works!
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Database Connection established!");
        } catch (Exception e) {
            System.err.println("Cannot connect to database: " + e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                    System.out.println("Database connection Terminated!");
                } catch (Exception e) {
                    /* Ignore close errors! */
                }
            }
        }
    }
}