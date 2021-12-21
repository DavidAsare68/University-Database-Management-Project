import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_student {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            //1. Get connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/project_two", "student", "PSstudent");
            //2. Get statement
            Statement stmt = con.createStatement();
            // 3. Execute query
            ResultSet rs=stmt.executeQuery("select * from clark_kent_academinc_summary");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+
                        "  "+rs.getInt(4)+ "  "+rs.getString(5)+ "  "+rs.getInt(6));
            con.close();
        }catch(Exception e){ System.out.println(e);}
        }
    }