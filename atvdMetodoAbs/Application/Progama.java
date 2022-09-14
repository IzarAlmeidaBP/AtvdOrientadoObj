package atvdMetodoAbs.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import atvdMetodoAbs.entites.Circulo;
import atvdMetodoAbs.entites.Forma;
import atvdMetodoAbs.entites.Retangulo;
import atvdMetodoAbs.entitesEnum.Cor;

public class Progama {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Forma> list = new ArrayList<>();

		System.out.println("Qual a quantidade de Formas: ");
		int qtd = sc.nextInt();

		for (int i = 1; i <= qtd; i++) {
			System.out.println("Retangulo ou Circulo (r/c)");
			char ch = sc.next().charAt(0);
			System.out.println("Cor (Preta/Branca/Vermalho:)");
			char tipoCor = sc.next().charAt(0);

			if (ch == 'r') {

				System.out.println("Qual é Base:");
				double base = sc.nextDouble();

				System.out.println("Qual a Altura:");
				double altura = sc.nextDouble();

				list.add(new Retangulo(base, altura));
			} else if (ch == 'c') {

				System.out.println("Qual é Raio:");
				double raio = sc.nextDouble();
				list.add(new Circulo(raio));
			}
		}

		System.out.println("Area das Formas:");

		for (Forma forma : list) {
			System.out.println(String.format("%.2f", forma.area()));
		}

	}

}
