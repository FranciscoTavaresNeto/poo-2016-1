package a0502;

public class ContaCorrente extends ContaAbstrata {
	
	public ContaCorrente(double saldoInicial){
		super(saldoInicial);
	}

	@Override
	public void cicloMensal() {
		this.saldo -= 10.0;
	}
	
	@Override
	public double getSaldoParaSaque() {
		return super.getSaldoParaSaque() - 10;
	}
	
}
