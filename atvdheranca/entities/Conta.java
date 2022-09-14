package atvdheranca.entities;

public class Conta {

	private Integer numero;
	private String nome;
	protected Double saldo;

	public Conta() {

	}

	public Conta(Integer numero, String nome, Double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void saque(double valor) {
		saldo -= valor + 5.0;
	}

	public void deposito(double valor) {
		saldo += valor;
	}
	
}
