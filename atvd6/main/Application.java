package atvd6.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import atvd6.entites.Employee;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("you want to add how many employees?");
		int numberEmployee = Integer.parseInt(sc.nextLine());
		List<Employee> employees = new ArrayList<Employee>();

		for (int i = 0; i < numberEmployee; i++) {
			System.out.print("ID: ");
			int ID = Integer.parseInt(sc.nextLine());
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = Double.parseDouble(sc.nextLine());
			System.out.println();
			employees.add(new Employee(ID, name, salary));
		}
		System.out.println("Enter the employye id thah will salary increase: ");
		int idDesej = Integer.parseInt(sc.nextLine());

		for (Employee izar : employees) {
			if (izar.getID() == idDesej) {
				System.out.println("Enter the percentage :");
				int percentage = Integer.parseInt(sc.nextLine());
				izar.increaseSalary(percentage);
			

			}

		}

		for (Employee listar : employees) { 
			System.out.println(listar.getID()+", "+ listar.getName() +", "+ listar.getSalary());
		}
		
		
		
		
		
		sc.close();

	}
	
}
