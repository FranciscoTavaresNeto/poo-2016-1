package polimorfismo;
// HERANÇA:
// uma classe pode dar "extends" em outra, OU
// uma classe pode implementar (implements) uma interface
public class ContaCorrente implements IConta {

	private double saldo;
	
	@Override // SOBRESCRITO
	public double getSaldo() {
		return 0;
	}

	@Override
	public void deposita(double valor) {
		
	}

	@Override
	public void saca(double valor) {
		
	}

}
