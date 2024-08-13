import java.sql.*;

public class CreateTable {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String TableName;
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "Mysqlp@ss23";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            stmt.execute("show tables");
            rs = stmt.getResultSet();
            System.out.println(
                    "\n--------------------------------Result before creating the table--------------------------------");
            while (rs.next()) {
                TableName = rs.getString("Tables_in_test");
                System.out.println("Table Name: " + TableName);
            }
            System.out.println(
                    "Okay! Now let's create a new table named 'javacourse'\n.....\n........\nCreating.....\nDone!");
            stmt.execute(
                    "create table javacourse(Roll Integer Primary Key , Name varchar(20) not null, Marks Integer not null, Grade varchar(2))");
            System.out.println("New Table javacourse created successfully!");
        } catch (SQLException e) {
            System.out.println("SQL Exception in main: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        } catch (Exception e) {
            System.out.println("cannot connect to Database Server!");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("SQL Exception in finally: " + e.getMessage());
            }
        }
    }
}