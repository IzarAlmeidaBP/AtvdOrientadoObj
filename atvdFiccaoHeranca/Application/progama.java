package atvdFiccaoHeranca.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import atvdFiccaoHeranca.Entites.Pessoa;
import atvdFiccaoHeranca.Entites.PessoaF;

public class progama {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<>();

		System.out.println("Qual o numero de Pessoas que deseja saber a taxa: ");
		int numP = sc.nextInt();

		for (int i = 1; i <= numP; i++) {
			System.out.println("Taxa da pessoa numero  " + i + ":");

			System.out.println("Qual o tipo da pessoa (1-fisica/ 2-Juridica)?");
			int resp = sc.nextInt();

			if (resp == 1) {

				System.out.println("Nome: ");
				String nome = sc.next();

				System.out.println("Renda Anual:");
				double rendaAn = sc.nextDouble();

				System.out.println("Gatos com Saude :");
				double gasto = sc.nextDouble();

				list.add(new PessoaF(nome, rendaAn, gasto));

			}

			else if (resp == 2) {

				System.out.println("Nome: ");
				String nome = sc.next();

				System.out.println("Renda Anual:");
				double rendaAn = sc.nextDouble();

				System.out.println("Numero de Empregados :");
				int numEmp = sc.nextInt();

				list.add(new PessoaF(nome, rendaAn, numEmp));

			}

		}
		System.out.println("Imposto pago: ");
		for (Pessoa pessoa : list) {
			System.out.println(pessoa.getNome() + ":" + pessoa.imposto());

		}

	}

}
