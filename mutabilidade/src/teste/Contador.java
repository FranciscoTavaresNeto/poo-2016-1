package teste;
// privado do pacote (sem visibilidade)

// regra geral: tudo deve ser privado
// até ter um bom motivo para se tornar público
public class Contador {
  // public int valor;
  private int i; // o valor é privado
  private final int max;

  public Contador(int max) {
    this.max = max;
  }
  // os métodos públicos são
  // disponibilizados para interagir com o
  // Contador, em outras palavras,
  // eles são a INTERFACE do Objeto
  public int valor() { // CONSULTA (leitura)
    return this.i;
  }

  public void incrementa() { // COMANDO (gravação)
    if (this.i < this.max) this.i++;
  }

  // método que consulta e opera os atributos
  // serão evitados.
  // public int incrementa() {
  //   return ++this.i;
  // }
}
