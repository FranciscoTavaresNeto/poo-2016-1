package tempo;

public class Horario {
  // final significa "constante"
  // na prática: só pode ser atribuído uma vez!
  final int horas;
  final int minutos;
  final int segundos;
  // classes com todos os atributos "final"
  // cria objetos imutáveis!

  // construtores
  // public NomeDaClasse(parâmetros)

  public Horario() {
    this(0, 0, 0);
  }

  public Horario(int horas) {
    this(horas, 0, 0);
  }

  public Horario(int horas, int minutos) {
    this(horas, minutos, 0);
  }

      // Horario(       19,          38,           45)
  public Horario(int horas, int minutos, int segundos) {
    if (horas < 0 || horas > 23) {
      // lançar uma exceção (objeto)
      // RuntimeException exceção em tempo de execução
      throw new RuntimeException("hora inválida " + horas
          + " deve estar entre 0 e 23");
    }
    if (minutos < 0 || minutos > 59) {
      throw new RuntimeException("minuto inválido " + minutos
          + " deve estar entre 0 e 59");
    }
    if (segundos < 0 || segundos > 59) {
      throw new RuntimeException("segundo inválido " + segundos
          + " deve estar entre 0 e 59");
    }
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  // POLIMORFISMO
  // PROGRAMA "ADAPTÁVEL"
  // Exemplo simples: sobrecarga de métodos e construtores
  // Polimorfismo Ad-hoc

  // Modo Orientado a Objetos de introduzir algoritmos
  // não-estático
  // usa os atributos do objeto em vez de receber um parâmetro
  public Horario tic() {
    return new Horario(this.horas,
        this.minutos, this.segundos + 1);
  }

  public Horario tac() {
    return tic();
  }

  public boolean ehMeiaNoite() {
    // não fazer!!!
    // if (this.horas == 0 && this.minutos == 0 && this.segundos == 0) {
    //   return true;
    // } else {
    //   return false;
    // }
    return this.horas == 0
        && this.minutos == 0
        && this.segundos == 0;
  }

  // método para imprimir o objeto
  public String toString() {
    return this.horas
        + ":" + this.minutos
        + ":" + this.segundos;
    // ver String.format
    // return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
  }
}
