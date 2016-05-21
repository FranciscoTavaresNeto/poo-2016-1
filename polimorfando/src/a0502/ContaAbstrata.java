package a0502;

public abstract class ContaAbstrata {

	protected double saldo;
	
	public ContaAbstrata(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getSaldoParaSaque() {
		return this.saldo;
	}

	public void saque(double valor) {
		if(this.getSaldoParaSaque() < valor) {
			throw new SaldoInsuficienteException(this.getSaldoParaSaque());
		}
		this.saldo -= valor;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public abstract void cicloMensal();

	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}
	
	
}
