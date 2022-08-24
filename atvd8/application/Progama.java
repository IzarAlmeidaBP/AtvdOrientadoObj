package atvd8.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import atvd8.entites.Departamento;
import atvd8.entites.Empregado;
import atvd8.entites.HorasTrabalhadas;
import atvd8.entites.enums.NivelTrabalhador;

public class Progama {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Qual o nome do Departamento?");
		String nomeDepto = sc.nextLine();

		System.out.println("Insira os Dados do Empregado:");

		System.out.println("Nome: ");
		String nomeEmp = sc.nextLine();

		System.out.println("Nivel: ");
		String nivel = sc.nextLine();

		System.out.println("Salario: ");
		Double salario = Double.parseDouble(sc.nextLine());
		Empregado empregado = new Empregado(nomeEmp, NivelTrabalhador.valueOf(nivel), salario,
				new Departamento(nomeDepto));

		System.out.println("Qual o numero de contrato(s) do empregado?");
		int numeroContrato = Integer.parseInt(sc.nextLine()) + 1;
		for (int i = 1; i < numeroContrato; i++) {

			System.out.println("Coloque o Contrato " + i + ":");

			System.out.println("Data (DD/MM/YYYY)");
			Date data = sdf.parse(sc.nextLine());
			
			System.out.println("Valor por Hora :");
			
			double valorAhora = Double.parseDouble(sc.nextLine());
			System.out.println("Duracao (Em horas) : ");
			
			int horas = Integer.parseInt(sc.nextLine());
			HorasTrabalhadas trabalho = new HorasTrabalhadas(data, valorAhora, horas);
			empregado.addTrabalho(trabalho);// faz meu contrato ser associado cm meu trabalhador//

		}
		System.out.print("Bote o mes e o ano para calcular o salario total (MM/AAAA)");
		String mesEano = sc.nextLine();
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		int ano = Integer.parseInt(mesEano.substring(3));

		System.out.println("Nome : " + empregado.getNomeEmp());

		System.out.println("Departamento :" + empregado.getDepartamento());

		System.out.println("A renda dele foi de: " + mesEano + ": " + String.format("%.2f", empregado.renda(ano, mes)));

		sc.close();

	}
}
