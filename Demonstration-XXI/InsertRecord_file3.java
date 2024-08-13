//Run this file only once
//Running it for 2nd or more time will throw exception as this program inserts the records in the table in the database.
//So, If you run it again and again it will throw exception that record is already present in the table.

import java.sql.*;

public class InsertRecord_file3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        // ResultSet rs = null;
        // String NameString, RollString, MarksString, GradeString;
        try {
            String userName = "root";
            String password = "Mysqlp@ss23";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database Connection established");
            stmt = conn.createStatement();
            stmt.execute("insert into javacourse values(1001,'Rohit',90,'A')");
            stmt.execute("insert into javacourse values(1002,'Sachin',80,'B')");
            stmt.execute("insert into javacourse values(1003,'Saurav',70,'C')");
            stmt.execute("insert into javacourse values(1004,'Vishal',60,'D')");
            stmt.execute("insert into javacourse values(1005,'Vijay',50,'E')");
            System.out.println("Record Inserted Successfully in table javacourse!\nYou can check in the mysql server.");
        } catch (SQLException ex) {
            System.out.println("SQl Exception: " + ex.getMessage());
            System.out.println("SQL State: " + ex.getSQLState());
            System.out.println("Vendor Error: " + ex.getErrorCode());
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
