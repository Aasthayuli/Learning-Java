
//Run this file only once
//Running it for 2nd or more time will throw exception as this program creates the table in the database.
//So, If you run it again and again it will throw exception that the table already exists.
//Before running this program, Create a database test to store records in it as the program uses so.
import java.sql.*;

// import java.sql.ResultS
public class CreateTable_file2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            String userName = "root";
            String password = "Mysqlp@ss23";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database Connection established!");
            stmt = conn.createStatement();
            // Creating table
            stmt.execute(
                    "create table javacourse(Roll Integer Primary key,Name Varchar(30), Marks Integer not null, Grade varchar(2))");

            System.out.println("Table created successfully!");
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
                        System.out.println("Statement executed!");
                    }
                    System.out.println("Database connection Terminated!");
                } catch (Exception e) {
                    /* Ignore close errors! */
                }
            }
        }
    }
}