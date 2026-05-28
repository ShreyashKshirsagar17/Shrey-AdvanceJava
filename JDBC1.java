package CRUD;
import java.util.*;
import java.sql.*;

 

public class JDBC1 {

	public static void main(String[] args) throws Exception {
//		String city = "Mumbai";
//		String city_state = "Maharashtra";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name : ");
		String city = sc.next();
		
		System.out.println("Enter city state : ");
		String city_state = sc.next();
		
		// load register and driver :
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Radha@17");
		
		//create statement
	 //	PreparedStatement ps = con.prepareStatement("insert into cityInfo values('Pune','Maharashtra')");
		PreparedStatement ps = con.prepareStatement("insert into dept values(?,?)");
		ps.setString(1, city);
		ps.setString(2,city_state);
		
		int i = ps.executeUpdate();
		
		if(i>0) {
			System.out.println("Insert data successfully");
		}else {
			System.out.println("Not inserted");
		}
		

	}

}
