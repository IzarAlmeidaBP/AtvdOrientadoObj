package atvdFiccaoHeranca.Entites;

public class PessoaJ extends Pessoa {

	private int numFunc;

	public PessoaJ() {
		super();
	}

	public PessoaJ(String nome, double rendaAnual, int numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}

	public int getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public double imposto() {
		double taxaBasica;
		if (getNumFunc() > 10) {
			double imposto = getRendaAnual() * (14 / 100);
		} else if (getNumFunc() <= 10) {
			double imposto = getRendaAnual() * (16 / 100);
		}
		return 0;

	}

}
