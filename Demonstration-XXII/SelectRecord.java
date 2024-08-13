import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectRecord {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int TotalMarks = 0, Num_student = 0;
        float Avg_Marks;
        String NameString, RollString, MarksString, GradeString;
        try {
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "Mysqlp@ss23";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.execute("select * from javacourseold");
            rs = stmt.getResultSet();
            System.out.println("\n--------------------------------Results--------------------------------");
            while (rs.next()) {
                NameString = rs.getString("Name");
                RollString = rs.getString("Roll");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                TotalMarks += Integer.parseInt(MarksString);
                System.out.println("\nName: " + NameString + "\t\tRoll: " + RollString + "\t\tMarks: " + MarksString
                        + "\t\tGrade: " + GradeString + "\n");
            }
            rs.last();
            /*
             * trying to move the cursor to the last row of the result set using rs.last()
             * which is not allowed for a ResultSet of type ResultSet.TYPE_FORWARD_ONLY.
             * By default, a ResultSet is of type ResultSet.TYPE_FORWARD_ONLY, which means
             * the cursor can only move forward, and you cannot move the cursor to a
             * specific row or to the last row.
             * So,created a ResultSet of type ResultSet.TYPE_SCROLL_SENSITIVE or
             * ResultSet.TYPE_SCROLL_INSENSITIVE which allows you to move the cursor in both
             * directions.
             * Done by:stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
             * ResultSet.CONCUR_READ_ONLY);
             * OR,
             * stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
             * ResultSet.CONCUR_READ_ONLY);
             */
            Num_student = rs.getRow();
            Avg_Marks = TotalMarks / Num_student;
            System.out.println("\n------------------------Average Marks: " + Avg_Marks + "------------------------");
        } catch (SQLException ex) {
            System.out.println("SQL Exception in main: " + ex.getMessage());
            System.out.println("SQL State: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (ArithmeticException ex) {
            System.out.println("Division by Zero Exception!");
        } catch (Exception ex) {
            System.err.println("Cannot connect to Database Server!");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("SQL Exception in finally: " + ex.getMessage());
                }
            }
        }
    }
}
