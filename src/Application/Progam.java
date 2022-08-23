package src.Application;

import java.util.Locale;
import java.util.Scanner;

import src.Entites.Product;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorA = sc.nextInt();
		Product[] array = new Product[valorA];

		for (int i = 0; i < valorA; i++) {

			String name = sc.nextLine();
			double price = sc.nextDouble();
			array[i] = new Product(name, price);
			
		}
		double soma = 0.0;
		for (int i = 0; i < valorA; i++) {

			soma += array[i].getPrice();
		}
		double media = soma / valorA;
		sc.close();
	}

}
