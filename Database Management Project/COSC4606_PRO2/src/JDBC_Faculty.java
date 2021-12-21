import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Faculty {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            //1. Get connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/project_two", "faculty", "PSfaculty");
            //2. Get statement
            Statement stmt = con.createStatement();
            // 3. Execute query
            ResultSet rs=stmt.executeQuery("select * from tony_stark_courses_taught");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+
                        "  "+rs.getInt(4)+ "  "+rs.getInt(5)+ "  "+rs.getString(6));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
