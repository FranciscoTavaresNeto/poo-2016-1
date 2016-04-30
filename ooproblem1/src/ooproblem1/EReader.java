package ooproblem1;

public class EReader extends Produto {
	
	private String nome;

	public EReader(String nome, int peso) {
		super(peso);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String getDescricao() {
		return "E-Reader " + this.nome;
	}
	
}
