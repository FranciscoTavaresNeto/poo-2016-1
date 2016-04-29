package ooproblem1;

public class Encomenda {

	private Livro livro;
	private String endereco;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private double frete;

	public Encomenda(Livro livro, String endereco, String numero, String bairro, String cidade, String estado) {
		this.livro = livro;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		if (estado.equals("SP")) {
			this.frete = this.livro.getPeso() * 0.010 * 2.3; 
		}
		if (estado.equals("RS")) {
			this.frete = this.livro.getPeso() * 0.015 * 2.3; 
		}
		if (estado.equals("AM")) {
			this.frete = this.livro.getPeso() * 0.025 * 2.3;
		}
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

	@Override
	public String toString() {
		return "Encomenda [livro=" + livro + ", endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", estado=" + estado + ", frete=" + frete + "]";
	}

}
