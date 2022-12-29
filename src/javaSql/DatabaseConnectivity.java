package javaSql;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.*;

public class DatabaseConnectivity {
	

	static void mainMenue() {

		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ********** Welcome *********** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1. Create Student Table ");
		System.out.println("\t\t 2. Create Subject Table  ");
		System.out.println("\t\t 3. Student And Subject Menue  ");
		System.out.println("\t\t 4. Exite ");
	
}

	 public static void main(String a[]) throws SQLException, ClassNotFoundException {
		
		 boolean isExit = true;

			while (isExit) {

				Scanner sc = new Scanner(System.in);
				mainMenue();

				int option = sc.nextInt();

				switch (option) {
				case 1:


				Student studentTable = new Student ();
				studentTable . studentDetails();
				
						
						break;

				case 2:
            Subject  subjectTable = new Subject();
            subjectTable.subjectDetails();
            
            
						break;
					
						
				case 3:
					StudentAndSubject myStudentAndSubject= new StudentAndSubject();
					myStudentAndSubject.smallMenue();
					
				            
						break;
										
						
						
						
				case 4:
						System.out.println(" See You Soon ");
						System.exit(0);
						
						break;

					}
				}
				
				isExit = false;

		 
		 
	 
			}}
	
