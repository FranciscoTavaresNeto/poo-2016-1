package ooproblem1;

public class Endereco {
	
	private String endereco;
	private String numero;
	private String bairro;
	private String cidade;
	private Estado estado;
	
	public Endereco(String endereco, String numero, String bairro, String cidade, Estado estado) {
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Endereco [endereco=" + endereco 
				+ ", numero=" + numero 
				+ ", bairro=" + bairro 
				+ ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}
	
	
	
	

}
