package helloide;
// declarar uma classe abstrata é 
// declarar um supertipo "formal"
// essa classe não pode ser instanciada
// é proibido fazer um "new Atividade(...."
// é feita para ser estendida (subclassificada)
// contrasta com "final" onde não pode ser estendida
public abstract class Atividade {

	private String descricao;
	private Participante[] participantes;
	private int cont = 0;
	
	public Atividade(int vagas, String descricao) {
		this.descricao = descricao;
		this.participantes = new Participante[vagas];
	}

	public int getTotalVagas() {
		return this.participantes.length;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " 
				+ this.descricao + ", vagas: " + this.getTotalVagas();
	}

	public void inscrição(Participante p) {
		if (cont < getTotalVagas() && ! isInscrito(p)) {
			this.participantes[cont++] = p;
		}
	}

	public int getVagasDisponiveis() {
		return getTotalVagas() - cont;
	}

	public boolean isInscrito(Participante p) {
		for (int i = 0; i < participantes.length; i++) {
			if (p.equals(participantes[i])) {
				return true;
			}
		}
		return false;
	}

	public String getListaInscritos() {
		String s = "";
		s += "Nome           CPF\n";
		s += "-----------------------------------\n";
		for (int i = 0; i < participantes.length; i++) {
			if (participantes[i] != null) {
				s += participantes[i] + "\n";
			}
		}
		return s;
	}
	
}
