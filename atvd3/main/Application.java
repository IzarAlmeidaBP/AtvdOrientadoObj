package atvd3.main;

import java.util.Locale;
import java.util.Scanner;

import atvd3.entites.*;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee func;
		func = new Employee();

		System.out.println("Name:");
		func.nameEmployee = sc.nextLine();

		System.out.println("Gross salary");
		func.salaryTotaly = sc.nextDouble();

		System.out.println("Tax");
		func.tax = sc.nextDouble();

		System.out.println("\n" + func);

		System.out.println("what percentage do you want to increase:");

		func.percentage = sc.nextInt();

		System.out.printf("Updated data : %s, $ %.2f ", func.nameEmployee, func.newSalary());

		sc.close();
	}

}
