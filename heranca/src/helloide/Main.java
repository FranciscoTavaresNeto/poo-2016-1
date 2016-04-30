package helloide;

public class Main {
	public static void main(String[] args) {
		
		Evento mpct = new Evento("MPCT", 3);

		Atividade palestraAndroid = 
				new Palestra(5, "Programação Android");
		
		mpct.adicionaAtividade(palestraAndroid);
		
		// Atividade é o tipo ABSTRATO
		Atividade minicursoJogos =
				new Minicurso(12, "Jogos HTML5", 6);
		// Minicurso é o tipo CONCRETO
		
		System.out.println(minicursoJogos);
		
		// CAST
		System.out.println(((Minicurso)minicursoJogos).getMinimoParticipantes());
		
		mpct.adicionaAtividade(minicursoJogos);
		
		Atividade relampago = new PalestraRelampago("Boas práticas");
		
		mpct.adicionaAtividade(relampago);
		
		System.out.println(relampago.getClass());
		System.out.println(relampago.getClass().getSuperclass());
		System.out.println(relampago.getClass().getSuperclass().getSuperclass());
		System.out.println(relampago.getClass().getSuperclass().getSuperclass().getSuperclass());
		
		Participante p1 = 
				new Participante("Lucas Weber", "11122233344");
		
		Participante p2 =
				new Participante("Pedro Sodré", "22233344455");
		
		palestraAndroid.inscrição(p1);
		palestraAndroid.inscrição(p2);
				
		String listaInscritos = 
				palestraAndroid.getListaInscritos();

		System.out.println(listaInscritos);
	}
} 






