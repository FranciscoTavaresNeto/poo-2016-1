package a0502;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(double saldoParaSaque) {
		super("Saldo para saque atual:" + saldoParaSaque);
	}
}
