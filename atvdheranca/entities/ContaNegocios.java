package atvdheranca.entities;

public class ContaNegocios extends Conta {

	private Double limite;

	public ContaNegocios() {
		super();
	}

	public ContaNegocios(Integer numero, String nome, Double saldo, Double limiteSaque) {
		super(numero, nome, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limite = limite;
	}

	public void emprestimo(double quantia) {
		if (quantia <= limite) {
			saldo += quantia - 10;
		}
	}

	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;

	}
}
