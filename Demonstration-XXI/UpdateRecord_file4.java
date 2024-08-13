//Run this file only once
//Running it for 2nd or more time will throw exception as this program updataes the record in the table in the database.
//So, If you run it again and again it will throw exception that the same record in the table already exists.

import java.sql.*;

public class UpdateRecord_file4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            String userName = "root";
            String password = "Mysqlp@ss23";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database Connection established");
            stmt = conn.createStatement();
            stmt.execute("update javacourse set Marks=100 where Roll=1001");
            System.out.println("Record Updated in javacourse Successfully! ");
        } catch (SQLException ex) {
            System.out.println("SQl Exception: " + ex.getMessage());
            System.out.println("SQL State: " + ex.getSQLState());
            System.out.println("Vendor Error: " + ex.getErrorCode());
        } catch (Exception ex) {
        }
    }
}
