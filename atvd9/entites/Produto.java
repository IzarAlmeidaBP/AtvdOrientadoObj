package atvd9.entites;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private String nome;
	private double precoProduto;

	public Produto(String nome, double precoProduto) {
		this.nome = nome;
		this.precoProduto = precoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

}
