package atvdFiccaoHeranca.Entites;

public class PessoaF extends Pessoa {

	private double gastoSaude;

	public PessoaF() {

	}

	public PessoaF(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double taxaBasica;
		if (getGastoSaude() > 0) {

			if (getRendaAnual() < 20000) {

				double impostoB = (getRendaAnual() * (15 / 100)) - (getGastoSaude() / 2);
			}

			else if (getRendaAnual() > 20000) {

				double impostoA = (getRendaAnual() * (25 / 100)) - (getGastoSaude() / 2);

			}

		} else {

			if (getRendaAnual() < 20000) {

				double impostoB = (getRendaAnual() * (15 / 100));
			}

			else if (getRendaAnual() > 20000) {

				double impostoA = (getRendaAnual() * (25 / 100));

			}
		}
		return 0;

	}
}
