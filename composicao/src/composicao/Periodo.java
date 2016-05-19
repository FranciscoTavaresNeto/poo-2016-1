package composicao;

public class Periodo {
	
	private int anoInicio;
	private int mesInicio;
	
	private int anoFim;
	private int mesFim;
	
	public Periodo(int anoInicio, int mesInicio, int anoFim, int mesFim) {
		this.anoInicio = anoInicio;
		this.mesInicio = mesInicio;
		this.anoFim = anoFim;
		this.mesFim = mesFim;
	}

	public Periodo(int anoInicio, int mesInicio) {
		this.anoInicio = anoInicio;
		this.mesInicio = mesInicio;
	}

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public int getMesInicio() {
		return mesInicio;
	}

	public void setMesInicio(int mesInicio) {
		this.mesInicio = mesInicio;
	}

	public int getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(int anoFim) {
		this.anoFim = anoFim;
	}

	public int getMesFim() {
		return mesFim;
	}

	public void setMesFim(int mesFim) {
		this.mesFim = mesFim;
	}

	@Override
	public String toString() {
		return mesInicio + "/" + anoInicio
				+ " até " + mesFim + "/" + anoFim;
	}
	

}
