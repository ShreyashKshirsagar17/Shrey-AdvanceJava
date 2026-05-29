package MatrixRotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "password"
            );

            Statement st = con.createStatement();

            String query = "CREATE TABLE Student(id INT, name VARCHAR(20))";
            st.executeUpdate(query);

            System.out.println("Table Created Successfully");

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
