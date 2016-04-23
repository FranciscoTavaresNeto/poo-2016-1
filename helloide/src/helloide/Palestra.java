package helloide;

public class Palestra {

	// private int vagas;
	private String descricao;
	private Participante[] participantes;
	private int cont = 0;
	
	public Palestra(int vagas, String descricao) {
		// this.vagas = vagas;
		this.descricao = descricao;
		this.participantes = new Participante[vagas];
	}

	public int getTotalVagas() {
		// return vagas;
		return this.participantes.length;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao + ", vagas: " + this.getTotalVagas();
	}

	public void inscrição(Participante p) {
		if (cont < getTotalVagas() && ! isInscrito(p)) {
			this.participantes[cont++] = p;
		}
		// cont = cont + 1;
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
