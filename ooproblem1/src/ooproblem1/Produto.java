package ooproblem1;

public abstract class Produto {
	
	private int peso;
	
	public Produto(int peso) {
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}
	
	public abstract String getDescricao();
	
}
