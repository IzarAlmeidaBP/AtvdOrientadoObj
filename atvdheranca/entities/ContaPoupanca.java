package atvdheranca.entities;

public final class ContaPoupanca extends Conta {
	//final não deixa outa classe herdar essa classe
	private Double taxaJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String nome, Double saldo, Double taxaJuros) {
		super(numero, nome, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void saldoAt() {
		saldo += saldo * taxaJuros;

	}
	@Override
	public final void saque(double valor) {
		//final nao deixa outro metodo herdar esse metodo
		saldo -= valor;
	}
}