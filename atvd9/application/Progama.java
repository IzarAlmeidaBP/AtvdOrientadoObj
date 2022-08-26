package atvd9.application;

import java.util.Locale;
import java.util.Scanner;

import atvd9.entites.Cliente;

public class Progama {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Dados do Cliente:");
		String nomeCliente = sc.nextLine();

		System.out.println("Status:");
		String status = sc.nextLine();

		System.out.println("Quantos itens para esse pedido ?");
		Integer numItens = Integer.parseInt(sc.nextLine()) + 1;
		Cliente cliente = new Cliente(nomeCliente, status);

		for (int i = 1; i < numItens; i++) {
			System.out.printf("Esse é seu pedido numero %d ", numItens);

			System.out.println("Nome do Produto; ");
			String nome = sc.nextLine();

			System.out.println("Preço do Produto: ");
			double precoProduto = Double.parseDouble(sc.nextLine());
		}

	}

}
