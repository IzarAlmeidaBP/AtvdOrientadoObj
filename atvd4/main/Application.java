package atvd4.main;

import java.util.Locale;
import java.util.Scanner;

import atvd4.entities.Student;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student;
		student = new Student();
		
		student.studentName = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		if(student.nota1 < 0 || student.nota1 > 30 ) {
			System.out.println("Invalid Note ");
			
		}
		else if (student.nota2 < 0 || student.nota2 > 35 || student.nota3<0 || student.nota3> 35) {
			System.out.println("Invalid Note ");
		}
		else {
			if(student.media() >= 60) {
				System.out.printf("FINAL GRADE = %.2f\nPASS", student.media());
			}
			else if(student.media() < 60) {
				System.out.printf("FINAL GRADE = %.2f\nFAILED\nMISSING %.2f POINTS" ,student.media(), student.disapproved());
			}
			
		}
		sc.close();
		
	}

}
