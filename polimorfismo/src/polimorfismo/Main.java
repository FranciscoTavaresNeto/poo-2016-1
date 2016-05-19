package polimorfismo;

public class Main {

	public static void main(String[] args) {
		// projetar a API (interface dos objetos)
		// INTERFACES definem um CONTRATO
		// os métodos que o objeto deve disponibilizar
		// a dinâmica é comprovada com TESTES/ASSERTIVAS
		// Interface de Conta (CONTRATO de uma Conta)
		// O que uma Conta deve fazer?
		IConta conta = new ContaCorrente();
		// IConta é a abstração de uma conta
		// Conta é a implementação dessa abstração
		
		System.out.println(conta.getSaldo() == 0.0);
		
		conta.deposita(1000.0);
		
		System.out.println(conta.getSaldo() == 1000.0);
		
		conta.saca(100.0);
		
		System.out.println(conta.getSaldo() == 900.0);
		
		conta.saca(50.0);
		conta.saca(50.0);
		
		System.out.println(conta.getSaldo() == 800.0);
		
		conta.deposita(700.0);
		
		System.out.println(conta.getSaldo() == 1500.0);
		
		

	}

}









