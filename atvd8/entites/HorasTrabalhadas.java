package atvd8.entites;

import java.util.Date;

public class HorasTrabalhadas {

	private Date data;
	private double valorAhora;
	private Integer horas;

	public HorasTrabalhadas() {

	}

	public HorasTrabalhadas(Date data, double valorAhora, Integer horas) {
		this.data = data;
		this.valorAhora = valorAhora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorAhora() {
		return valorAhora;
	}

	public void setValorAhora(double valorAhora) {
		this.valorAhora = valorAhora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public double valorTotal() {
		return valorAhora * horas;
	}
	
}
