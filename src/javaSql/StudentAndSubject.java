package javaSql;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentAndSubject {
	 static Scanner sc = new Scanner(System.in);
	 StudentAndSubject myStudentAndSubject= new StudentAndSubject();
	static boolean isExitSmallMenue = true;

	 public static void main(String a[]) throws SQLException, ClassNotFoundException {
			
		 public void topStudent() {
				String sql="SELECT * FROM Students ORDER BY id LIMIT 100;";
			}
		 
	
	
	
	
	 }
	
	
	static void smallMenue() {
    do {
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1- List Top 100 Students  ");
		System.out.println("\t\t 2- List Top 50 Subjects  ");
		System.out.println("\t\t 3- Add a new Student  ");
		System.out.println("\t\t 4- Add a new Subject ");
		System.out.println("\t\t 5- Load 1000000 student in Students Table ");
		System.out.println("\t\t 6- Load 100000 subjects in Subjects Table ");
		System.out.println("\t\t 7- Exit App ");
	
		int option2 = sc.nextInt();
		switch (option2) {

		case 1:
			StudentAndSubject myStudentAndSubject= new StudentAndSubject();

			StudentAndSubject.topStudent();
			
			
			break;
			
			
		case 2:
			
			break;
			
			
		case 3:
			
			break;
			
			
			
		case 4:
			
			break;
			
			
			
		case 5:
			
			break;
			
			
		case 6:
			
			break;
			
			
			
		case 7:
			isExitSmallMenue = false;
			break;
}
		

}while (isExitSmallMenue);
}


	private static void topStudent() {
		// TODO Auto-generated method stub
		
	}}