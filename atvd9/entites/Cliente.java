package atvd9.entites;

public class Cliente {

	private String nomeCliente;
	private String email;

	public Cliente(String nomeCliente, String email) {
		this.nomeCliente = nomeCliente;
		this.email = email;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
