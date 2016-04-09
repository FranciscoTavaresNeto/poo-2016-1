package banco;

public class ContaCorrente {
  // constante da classe
  private static final double DEPOSITO_INICIAL = 20.0;
  private double dinheiro;
  public ContaCorrente(double saldoInicial) {
    // 20 é o valor mínimo de depósito para criar uma conta
    if (saldoInicial < DEPOSITO_INICIAL) {
      throw new IllegalArgumentException(
        "saldo inicial minimo de " + DEPOSITO_INICIAL + " reais");
    }
    this.dinheiro = saldoInicial;
  }
  public double saldo() {
    return this.dinheiro;
  }
  public void deposita(double valor) {
    if (valor < 0.0) {
      throw new IllegalArgumentException(
        "deposito nao pode ser negativo");
    }
    this.dinheiro += valor;
  }
  public void saque(double valor) {
    if (valor > this.dinheiro) {
      throw new IllegalArgumentException(
        "valor maior que o saldo " + this.dinheiro);
    }
    if (valor < 0) {
      throw new IllegalArgumentException(
        "valor negativo");
    }
    this.dinheiro -= valor;
  }
}
