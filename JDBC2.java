package CRUD;
import java.util.*;
import java.sql.*;

public class JDBC2 {

	public static void main (String[]args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Radha@17");
		
		Statement stm=con.createStatement();
		
//		stm.execute("insert into dept value(2,'jath')");
		
//		stm.executeUpdate("delete from dept where id=1");
		
		stm.executeUpdate("update dept set name ='computer' where id=101");
		
		stm.close();
		con.close();
		
	}
}
