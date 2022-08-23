package atvd6.entites;

public class Employee {

	private int ID;
	private String name;
	private double salary;

	public Employee() {

	}

	public Employee(int iD, String name, double salary) {
		this.ID = iD;
		this.name = name;
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void increaseSalary(int percentage) {
		this.salary = (percentage / 100) * salary + salary;
	}
}
