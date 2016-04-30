package ooproblem1;

public class Encomenda {

	private Produto produto;
	private double frete;
	private Endereco destino;

	public Encomenda(Produto produto, Endereco destino) {
		this.produto = produto;
		this.destino = destino;
		
		if (destino.getEstado().equals("SP")) {
			this.frete = this.produto.getPeso() * 0.010 * 2.3; 
		}
		if (destino.getEstado().equals("RS")) {
			this.frete = this.produto.getPeso() * 0.015 * 2.3; 
		}
		if (destino.getEstado().equals("AM")) {
			this.frete = this.produto.getPeso() * 0.025 * 2.3;
		}
	}

	public Produto getProduto() {
		return produto;
	}
	
	public Endereco getDestino() {
		return destino;
	}
	
	public double getFrete() {
		return frete;
	}

	@Override
	public String toString() {
		return "Encomenda [produto=" 
				+ produto.getDescricao() + ", destino=" 
				+ destino + "]";
	}

}
