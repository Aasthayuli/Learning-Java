import java.sql.*;

public class DropTable_file7 {

    public static void main(String[] args) {
        String userName = "root";
        String password = "Mysqlp@ss23";
        String url = "jdbc:mysql://localhost:3306/test";
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.execute("drop table javacourse");
            System.out.println("Table javacourse dropped successfully");
        } catch (SQLException ex) {
            System.out.println("SQl Exception: " + ex.getMessage());
            System.out.println("SQL State: " + ex.getSQLState());
            System.out.println("Vendor Error: " + ex.getErrorCode());
        } catch (Exception ex) {
            System.err.println("Exception while closing the connection : " + ex.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception ex) {
                    /* Ignore close errors! */
                }
            }
        }
    }
}