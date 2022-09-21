package atvdInterface.modelo.servico;

import atvdInterface.modelo.entitites.AluguelCarro;
import atvdInterface.modelo.entitites.Fatura;

public class AluguelServico {

	private Double precoDia;
	private Double precoHora;

	private TaxaServicoBR txsBR;

	public AluguelServico(Double precoDia, Double precoHora, TaxaServicoBR txsBR) {
		this.precoDia = precoDia;
		this.precoHora = precoHora;
		this.txsBR = txsBR;
	}

	public void processoFatura(AluguelCarro aluguelCarro) {
		long t1 = aluguelCarro.getInicio().getTime();
		long t2 = aluguelCarro.getFim().getTime();
		double horas = (double) (t1 - t2) / 1000 / 60 / 60;

		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = Math.ceil(horas) * precoHora;
		} else {
			pagamentoBasico = Math.ceil(horas) * precoDia;
		}
		double taxa = txsBR.taxa(pagamentoBasico);

		aluguelCarro.setFatura(new Fatura(pagamentoBasico,taxa));
	}

}
