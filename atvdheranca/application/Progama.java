package atvdheranca.application;

import atvdheranca.entities.Conta;
import atvdheranca.entities.ContaNegocios;

public class Progama {

	public static void main(String[] args) {

		Conta c = new Conta(1001, "Izar", 0.0);
		ContaNegocios cn = new ContaNegocios(1004, "Suelene", 0.0, 500.0);

		// UPCASTING
		// será da super classe para a sub classe

		Conta c1 = cn;

		// DOWNCASTING
		// não é possivel converter uma superclasse para a sub class

		ContaNegocios cn1 = (ContaNegocios) c1;
	}
		
}
