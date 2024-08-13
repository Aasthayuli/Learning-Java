import java.sql.*;

public class UpdateRecord {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String NameString, RollString, MarksString, GradeString;
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "Mysqlp@ss23";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            stmt.execute("select * from javacourse");
            rs = stmt.getResultSet();
            System.out.println(
                    "\n--------------------------------Results Before Updation--------------------------------");
            while (rs.next()) {
                NameString = rs.getString("Name");
                RollString = rs.getString("Roll");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("\nName: " + NameString + "\t\tRoll: " + RollString + "\t\tMarks: " + MarksString
                        + "\t\tGrade: " + GradeString + "\n");
            }

            stmt.execute("update javacourse set Name='Aastha' where Name='Debasis'");
            System.out
                    .println("--------------------------------Results After Updation--------------------------------");

            stmt.execute("select * from javacourse");
            rs = stmt.getResultSet();
            while (rs.next()) {
                NameString = rs.getString("Name");
                RollString = rs.getString("Roll");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("\nName: " + NameString + "\t\tRoll: " + RollString + "\t\tMarks: " + MarksString
                        + "\t\tGrade: " + GradeString + "\n");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception in main: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        } catch (Exception e) {
            System.out.println("Cannot connect to Database server");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("SQL Exception in finally: " + e.getMessage());
            }
        }

    }
}