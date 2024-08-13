import java.sql.*;

public class InsertRecord {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String NameString, RollString, MarksString, GradeString;
        try{
            String url="jdbc:mysql://localhost:3306/test";
            String user="root";
            String password="Mysqlp@ss23";
            conn=DriverManager.getConnection(url,user,password);
            stmt=conn.createStatement();
            stmt.execute("select * from javacourse");
            rs=stmt.getResultSet();
            System.out.println("\n--------------------------------Results Before Insert--------------------------------");
            if(rs.next()!=true){
                System.out.println("No Records Found");
            }
            while(rs.next()){
                NameString=rs.getString("Name");
                RollString=rs.getString("Roll");
                MarksString=rs.getString("Marks");
                GradeString=rs.getString("Grade");
                System.out.println("\nName: "+NameString+"\t\tRoll: "+RollString+"\t\tMarks: "+MarksString+"\t\tGrade: "+GradeString);
            }
            stmt.execute("insert into javacourse values(01, 'Debasis', 75, 'A')");
            stmt.execute("insert into javacourse values(02, 'Nilanjan', 85, 'Ex')");
            stmt.execute("insert into javacourse values(03, 'Tauheed', 65, 'B')");
            stmt.execute("insert into javacourse values(04, 'Priya', 78, 'A')");

            stmt.execute("select * from javacourse");
            rs=stmt.getResultSet();
            System.out.println("\n--------------------------------Results After Insert--------------------------------");
            while(rs.next()){
                NameString=rs.getString("Name");
                RollString=rs.getString("Roll");
                MarksString=rs.getString("Marks");
                GradeString=rs.getString("Grade");
                System.out.println("\nName: "+NameString+"\t\tRoll: "+RollString+"\t\tMarks: "+MarksString+"\t\tGrade: "+GradeString);
            }
        }catch(SQLException e){
            System.out.println("SQL Exception in main: "+e.getMessage());
            System.out.println("SQL State: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }catch(Exception e){
            System.out.println("cannot connect to Database Server!");
        }finally{
            try{
                if(rs!=null) rs.close();
                if(stmt!=null) stmt.close();
                if(conn!=null) conn.close();
            }catch(SQLException e){
                System.out.println("SQL Exception in finally: "+e.getMessage());
            }
        }
    }
}