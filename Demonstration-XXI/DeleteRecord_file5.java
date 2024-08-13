//Run this file only once
//Running it for 2nd or more time will not throw an exception but also will not make any sense as this program deletes a particular record in the database.
//So, If you run it again and again it will not cause any change in the database as the record is already deleted.

import java.sql.*;

public class DeleteRecord_file5 {

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

            // can run multiple execute statments in the single file
            stmt.execute("delete from javacourse where marks<66");
            System.out.println("Record Deleted Successfully!");

            stmt.execute("insert into javacourse values(1006,'Vishal',55,'F')");
            System.out.println("running 2nd query...\nRecord Inserted Successfully!");

        } catch (SQLException ex) {
            System.out.println("SQl Exception: " + ex.getMessage());
            System.out.println("SQL State: " + ex.getSQLState());
            System.out.println("Vendor Error: " + ex.getErrorCode());
        } catch (Exception ex) {
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    if (stmt != null) {
                        System.out.println("Statement executed");
                    }
                    System.out.println("Database connection Terminated");
                } catch (Exception e) {
                    System.err.println("Cannot connect to database server: " + e);
                }
            }
        }
    }
}