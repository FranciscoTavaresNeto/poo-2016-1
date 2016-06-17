package poo.javaweb;

import spark.Spark;

public class Main {
	public static void main(String[] args) {
		// System.out.println("Hello World!");	
		
		HelloWorld hw = new HelloWorld();
		Spark.get("/hello", hw);
		
		BoaNoite boa = new BoaNoite();
		Spark.get("/boa/:pessoa", boa);

		Soma soma = new Soma();
		Spark.get("/soma/:num1/:num2", soma);
		
		Spark.get("/", new Index());
		
	}
}









