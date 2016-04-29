package ooproblem1;

public class Main {

	public static void main(String[] args) {
		
		Livro l = new Livro("Introdução à Programação Orientada a Objetos Usando Java", 
				"Rafael Santos", 522);
		
		Encomenda e = new Encomenda(l, "Alfredo Huch", "475", "Santa Tereza", "Rio Grande", "RS");
		
		System.out.println(e.getFrete());
	}

}
