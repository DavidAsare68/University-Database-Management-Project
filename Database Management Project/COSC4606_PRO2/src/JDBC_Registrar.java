import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
public class JDBC_Registrar {
    public static void main(String[] args) {
        /* Insert statement demonstration */
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //1. Get connection
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/project_two","registrar","PSreg");
            //2. Get statement
            Statement stmt=con.createStatement();
            // 3. Execute query
         /*   String sql = "insert into algomau"
                        + "(department,first_name,last_name,email,major)"
                        + "values( 'Medic','Barbra','Gordon','barbra@gmail.com','Biology')";

            stmt.executeUpdate(sql);

            System.out.println("Insert complete"); */

            String sql = "update grade"
                        +" set final_grades= '96'"
                        +"where grading_ID= '502'";
            stmt.executeUpdate(sql);
            System.out.println("Update complete");
            con.close();
        }catch(Exception e){ System.out.println(e);}


    }
}
