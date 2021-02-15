package DatabaseTesting.DatabaseTesting;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;


public class databasetesting {
			@Test
	
		public void test() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/seleniumtestdb","root","selenium-testdb");
			System.out.println("connected");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from seleniumuser");
			while(rs.next()) {
				String firstname=rs.getString("firstname");
				System.out.println("Firsname is " + firstname);
				
				String emailAddress=rs.getString("email");
				System.out.println("Firsname is " + emailAddress);
				
			}
		
		}
		
	}


