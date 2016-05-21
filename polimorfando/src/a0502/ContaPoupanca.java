package a0502;

public class ContaPoupanca extends ContaAbstrata{

	public ContaPoupanca(double saldoInicial) {
		super(saldoInicial);
	}

	@Override
	public void cicloMensal() {
		this.saldo *= 1.01;
	}
}
