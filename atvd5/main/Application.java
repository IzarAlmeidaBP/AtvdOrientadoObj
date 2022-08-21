package atvd5.main;

import java.util.Locale;
import java.util.Scanner;

import atvd5.entites.entities;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		entities account = new entities();
		
		
		System.out.println("Put tou account number:");
		int numberAccountAdd = Integer.parseInt(sc.nextLine());
		account.addNumberAccount(numberAccountAdd);
		
		
		System.out.println("Enter tour full name:");
		String nameHolder = sc.nextLine();
		account.setNameHolder(nameHolder);
		
		
		System.out.println("want to deposit something?");
		String answer = sc.nextLine();
		
		

		if(answer.equalsIgnoreCase("y")) {
			System.out.println("How much do you want to deposit?");
			double valueDeposit = sc.nextDouble();
			account.addBalance(valueDeposit);
			System.out.printf(account.toString());
		}
		else if(answer.equalsIgnoreCase("n")){
			System.out.printf(account.toString());
			
			
		}
		else {
			System.out.println("Answer not accepted!");
		}
		
		System.out.println("\nHow much do you want to deposit?");
		double valueDeposit = sc.nextDouble();
		account.addBalance(valueDeposit);
		System.out.println(account);
		
		
		System.out.println("\nHow much do you want to wihtdraw?");
		double valueSaque = sc.nextDouble();
		account.removeBalance(valueSaque);
		System.out.println(account);
		sc.close();
		
		
	}

}
