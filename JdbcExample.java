package MatrixRotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample {

    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "password"
            );

            // Create Statement
            Statement st = con.createStatement();

            // Insert Query
            String query = "insert into student values(1,'Shreyash',85)";

            int rows = st.executeUpdate(query);

            System.out.println(rows + " row inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
