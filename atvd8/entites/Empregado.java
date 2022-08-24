package atvd8.entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import atvd8.entites.enums.NivelTrabalhador;

public class Empregado {

	private String nomeEmp;
	private NivelTrabalhador nivel;
	private double salario;

	private Departamento departamento;
	private List<HorasTrabalhadas> trabalhos = new ArrayList<>();

	public Empregado() {

	}

	public Empregado(String nomeEmp, NivelTrabalhador nivel, Double salario, Departamento departamento) {
		this.nomeEmp = nomeEmp;
		this.nivel = nivel;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNomeEmp() {
		return nomeEmp;
	}

	public void setNomeEmp(String nomeEmp) {
		this.nomeEmp = nomeEmp;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasTrabalhadas> getTrabalhos() {
		return trabalhos;
	}

	public void addTrabalho(HorasTrabalhadas trabalho) {
		trabalhos.add(trabalho);
	}

	public void removeTrabalho(HorasTrabalhadas trabalho) {
		trabalhos.remove(trabalho);
	}

	public double renda(int ano, int mes) {
		double soma = salario;
		Calendar cal = Calendar.getInstance();
		for (HorasTrabalhadas t : trabalhos) {
			cal.setTime(t.getData());
			int i_ano = cal.get(Calendar.YEAR);
			int i_mes = cal.get(Calendar.MONTH);
			if (ano == i_ano && mes == i_mes) {
				soma += t.valorTotal();
			}

		}
		return soma;
	}

}
