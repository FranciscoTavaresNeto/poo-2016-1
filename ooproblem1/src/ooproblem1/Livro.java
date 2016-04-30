package ooproblem1;

public class Livro extends Produto {
	
	private String titulo;
	private String autor;
	
	public Livro(String titulo, String autor, int peso) {
		super(peso);
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + "]";
	}

	@Override
	public String getDescricao() {
		return "Livro " + this.titulo;
	}
	
	

}
