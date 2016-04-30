package helloide;

// Métrica de Qualidade em Projetos Orientados a Objetos:
// ACOPLAMENTO: quanto menor melhor!
// Mais acoplamento significa maior risco de mudança.
public class Evento {

	private String nome;
	// sempre se procura declarar o tipo mais abstrato,
	// mais genérico, para reduzir o ACOPLAMENTO
	// ACOPLAMENTO: o quanto uma classe/objeto conhece de outra classe/objeto
	private Atividade[] atividades;
	private int cont;
	
	public Evento(String nome, int qtdAtividades) {
		this.nome = nome;
		atividades = new Atividade[qtdAtividades];
	}
	
	public String getNome() {
		return nome;
	}
	
	public Atividade getAtividade(int nro) {
		return atividades[nro - 1];
	}
	
	public void adicionaAtividade(Atividade a) {
		this.atividades[cont++] = a;
	}
	
	
	
}
