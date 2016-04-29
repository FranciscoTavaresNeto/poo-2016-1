package ooproblem1;

public class Livro {
	
	private String titulo;
	private String autor;
	private int peso;
	
	public Livro(String titulo, String autor, int peso) {
		this.titulo = titulo;
		this.autor = autor;
		this.peso = peso;
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

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", peso=" + peso + "]";
	}
	
	

}
