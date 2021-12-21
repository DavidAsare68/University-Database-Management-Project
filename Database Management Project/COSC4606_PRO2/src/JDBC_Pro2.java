import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Pro2 {
    public static void main(String[] args) {
        /* select statement demonstration */
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //1. Get connection
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/project_two","root","pswd");
            //2. Get statement
            Statement stmt=con.createStatement();
            // 3. Execute query
            ResultSet rs=stmt.executeQuery("select * from course");

            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}


    }
}
