package javaSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Subject {

	
	public void subjectDetails() {

		 final String url = "jdbc:mysql://localhost:3306/SchoolMgt";

		   final String user = "root";
		   final String pass = "root";
		   Scanner scanner = new Scanner(System.in);
		 try(Connection conn1 = DriverManager.getConnection(url, user, pass);
		         Statement st1 = conn1.createStatement();
		      ) 
		 {		      
		          String sql2 = "CREATE TABLE Subjects " +"(id INTEGER not NULL, " + "title VARCHAR(8),"+
		          	"descr VARCHAR(250),"+"pricePerStudent decimal)"; 

		         int m1=st1.executeUpdate(sql2);
		         if (m1 >=  1)
		         	System.out.println("Created table in given database..." + sql2);
		            
		         else
		             System.out.println("failed to create");
		 
		         conn1.close() ; 	  
		          } catch (Exception ex) {
			           
			            System.err.println(ex);
		   }
		
		
	}
	
	

}
