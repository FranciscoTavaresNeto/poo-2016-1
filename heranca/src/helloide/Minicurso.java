package helloide;

public class Minicurso extends Atividade {

	private int minimoParticipantes;

	public Minicurso(int vagas, String descricao,
			         int minimoParticipantes) {
		super(vagas, descricao);
		this.minimoParticipantes = minimoParticipantes;
	}
	
	public int getMinimoParticipantes() {
		return minimoParticipantes;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", minimo: " + minimoParticipantes; 
	}

}







