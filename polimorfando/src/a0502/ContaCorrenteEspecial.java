package a0502;

public class ContaCorrenteEspecial extends ContaCorrente{
	
	private double limite;
	
	public ContaCorrenteEspecial(double saldoInicial, double limite) {
		super(saldoInicial);
		this.limite	= limite;
	}
	
	@Override
	public double getSaldoParaSaque() {
		return super.getSaldoParaSaque() + this.limite;
	}
	
	@Override
	public void cicloMensal() {
		super.cicloMensal();
		if (saldo < 0) {
			this.saldo *= 1.05;
		}
	}
}
