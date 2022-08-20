package atvd2.main;

import java.util.Locale;
import java.util.Scanner;

import atvd2.entities.Retangulo;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo;
		retangulo = new Retangulo();
		
		retangulo.valorA = sc.nextDouble();
		retangulo.valorB = sc.nextDouble();
	
		System.out.println(retangulo);
		
		
		
		
		
		
		
		sc.close();
	}

}
