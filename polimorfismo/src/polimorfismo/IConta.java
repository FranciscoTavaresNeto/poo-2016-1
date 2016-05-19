package polimorfismo;

public interface IConta { // TOTALMENTE ABSTRATO
	// NÃO DEFINE COMO VAI SER FEITO (ALGORITMO)
	// MAS DEFINE O QUE VAI SER FEITO.
	
	
	// não tem atributos
	// tem os métodos públicos (API)
	// por padrão os métodos são públicos, então
	// escrever "public" é opcional
	public double getSaldo(); // método não têm corpo {/*conteúdo*?}

	public void deposita(double valor); // só assinatura

	public void saca(double valor);
	

}
