package atvd1.main;
import java.util.Locale;
import java.util.Scanner;

import atvd1.entities.Atvd1Triangulo;

public class Atvd1Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Atvd1Triangulo x, y;
		x = new Atvd1Triangulo();
		y = new Atvd1Triangulo();
		System.out.println("Enter the measures of triangle X:");
		x.valorA = sc.nextDouble();
		x.valorB = sc.nextDouble();
		x.valorC = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y:");
		y.valorA = sc.nextDouble();
		y.valorB = sc.nextDouble();
		y.valorC = sc.nextDouble();

		double areaX = x.area();

		double areaY = y.area();

		System.out.printf("Triangle X area :%.4f \nTriangle Y area:%.4f \n", areaX, areaY);

		if (areaX > areaY) {
			System.out.println("Larger area : X");
		} else {
			System.out.println("Larger area : Y");
		}

		sc.close();
	}

}
