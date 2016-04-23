package helloide;
// TODO melhorar essa classe
public class Main {
	// CTRL + ESPAÇO (autocompletar)
	// CTRL + 1 (assistente de código)
	// CTRL + SHIFT + F
	public static void main(String[] args) {
		// Run (CTRL + F11)
		// System.out.println("Estou vivo!!!!");
		// uma palestra com 5 vagas
		Palestra palestraAndroid = new Palestra(5, "Programação Android");
		System.out.println(palestraAndroid.getTotalVagas()); // JavaBean
		System.out.println(palestraAndroid.getDescricao());
		System.out.println(palestraAndroid); // toString()
		
		Participante p1 = 
				new Participante("Lucas Weber", "11122233344");
		
		System.out.println(p1);
		
		Participante p2 =
				new Participante("Pedro Sodré", "22233344455");
		
		System.out.println(p2);
		
		System.out.println(palestraAndroid.getTotalVagas()); // 5
		System.out.println(
				palestraAndroid.getVagasDisponiveis()); // 5
		
		palestraAndroid.inscrição(p1);
		
		System.out.println(
				palestraAndroid.getVagasDisponiveis()); // 4
		
		Participante p3 =
				new Participante("Mauricio Jost", "22233344455");
		Participante p4 =
				new Participante("Ederson Cascaes", "22233344455");
		Participante p5 =
				new Participante("Leandro Marx", "22233344455");
		Participante p6 =
				new Participante("Guilherme Reguffe", "22233344455");
		
		palestraAndroid.inscrição(p2);
		palestraAndroid.inscrição(p3);
		palestraAndroid.inscrição(p4);
		palestraAndroid.inscrição(p5);
		palestraAndroid.inscrição(p6);
		
		System.out.println(palestraAndroid.getVagasDisponiveis());
		// método consulta booleano tem o prefixo "is"
		System.out.println(palestraAndroid.isInscrito(p4)); // true
		System.out.println(palestraAndroid.isInscrito(p6)); // false
		
		String listaInscritos = 
				palestraAndroid.getListaInscritos();

		System.out.println(listaInscritos);
	}
} 






