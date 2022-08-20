package atvd3.entites;

public class Employee {

	public String nameEmployee;
	public double salaryTotaly;
	public double tax;
	public double percentage;

	public double netSalary() {
		return salaryTotaly - tax;
	}

	public String toString() {
		return "Employee : " + nameEmployee + ", " + "$ " + String.format("%.2f", netSalary());
	}

	public double newSalary() {
		return ((percentage/10) * salaryTotaly) + netSalary();
	}
		
}
