package composicao;

public class Trabalho {
	
	private String empresa;
	private Periodo periodo;
	
	public Trabalho(String empresa, Periodo periodo) {
		this.empresa = empresa;
		this.periodo = periodo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	@Override
	public String toString() {
		return "Trabalho [empresa=" + empresa + ", periodo=" + periodo + "]";
	}
	
	
	
	
	

}
