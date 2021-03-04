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
			//con.open();
			System.out.println("connected");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from seleniumuser");
			//String S= "insert into  seleniumuser values('Sachin','sachin@gmail.com',209321)";
			String s= "delete from seleniumuser where firstname='Dhaba'";
			String s3= "select * from seleniumuser left  outer join antuser on seleniumuser.firstname=antuser.firstname union all select * from seleniumuser right outer join antuser on seleniumuser.firstname=antuser.firstname";
			int rs2=stmt.executeUpdate(s);
			System.out.println(rs2);
			ResultSet rs_3=stmt.executeQuery(s3);
			
			
		/*	  while(rs.next()) 
			  { String firstname=rs.getString("firstname");
			  System.out.println("Firsname is " + firstname);
			  
			  String emailAddress=rs.getString("email");
			  System.out.println("emailAddress is " + emailAddress);
			  
			  String postaladdress=rs.getString("postaladdress");
	
			  }
			  rs.close();
			 
		}*/
		
	}
}


