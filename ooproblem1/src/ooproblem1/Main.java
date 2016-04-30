package ooproblem1;

public class Main {

	public static void main(String[] args) {
		// construtores não são comunicativos
		Livro l = new Livro("Introdução à Programação Orientada a Objetos Usando Java", 
				"Rafael Santos", 522);
		
		// Gambi #1
		// Livro l2 = new Livro("E-Reader Kobo", "Saraiva", 1200, 20);
		
		// Gambi #2
		// EReader reader = new EReader("Kobo", 1200);
		
		// Gambi #4
		// fazer EReader estender Livro
		
		EReader p2 = new EReader("Kobo", 1200);
		
		Endereco destino = new Endereco("Alfredo Huch", 
				"475", "Santa Tereza", "Rio Grande", Estado.RS);
		
		// outros exemplos de enum:
		// Dificuldade.Facil, Dificuldade.Medio
		// Genero.Masculino, Genero.Feminino
		
		// excesso de argumentos
		Encomenda e = new Encomenda(p2, destino);
		
		System.out.println(e);
		System.out.println(e.getFrete());
		
		// sabendo que e é uma Encomenda
		// o que significa getNumero()?
		// pega o número da Encomenda
		// System.out.println(e.getNumero());
				
				
	}

}
