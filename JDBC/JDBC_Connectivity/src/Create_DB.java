
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create_DB {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "";
    try{
         Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st =  con.createStatement();
      int rs=  st.executeUpdate("Create Database IF NOT EXISTS Manoj");
      int rs1 = st.executeUpdate("USE MANOJ");
      int rs2 = st.executeUpdate ("Create table IF NOT EXISTS test (id INT PRIMARY KEY, name VARCHAR(50))");

      int rs3 = st.executeUpdate("Insert into test values (6, 'Manoj')");

      ResultSet rs4= st.executeQuery("Select *from test");

      while (rs4.next()) {
            int id = rs4.getInt("id");
            String name = rs4.getString("name");
            System.out.println("ID: " + id + ", Name: " + name);
      }

    

      
            System.out.println("Database created Successfully");
        
        st.close();
        con.close();
        
    }catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL error.");
            e.printStackTrace();
        }
 }
}