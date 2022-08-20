package atvd4.entities;

public class Student {
	
	
	public String studentName;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		return nota1 + nota2 + nota3;
		
	}
	public double disapproved() {
		return 60 - media();
	}

}
