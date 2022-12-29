package javaSql;

//import java.beans.Statement;
import java.sql.*;
import java.util.*;

public class Student {


	public void studentDetails() {
		
		 final String url = "jdbc:mysql://localhost:3306/SchoolMgt";

		   final String user = "root";
		   final String pass = "root";
		   Scanner scanner = new Scanner(System.in);
		 try(Connection conn = DriverManager.getConnection(url, user, pass);
		         Statement st = conn.createStatement();
		      ) 
		 {		      
		          String sql = "CREATE TABLE Students " +
		                   "(id INTEGER PRIMARY KEY, " +
		                   "  fName VARCHAR(8), " + 
		                   " lName VARCHAR(8), " + 
		                   " Birthday Date" + 
		                   ")"; 

		         int m=st.executeUpdate(sql);
		         if (m >=  1)
		         	System.out.println("Created table in given database..." + sql);
		            
		         else
		             System.out.println("failed to create");
		 
		         conn.close() ; 	  
		          } catch (Exception ex) {
			           
			            System.err.println(ex);
		   }
		
}
	
	
}
