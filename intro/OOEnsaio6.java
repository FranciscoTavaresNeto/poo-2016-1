public class OOEnsaio6 {
  public static void main(String[] args) {
    Agua a = new Agua();
    // temperatura 100º
    System.out.println(a.temperatura); // (atributo/propriedade da água)
    a.aquecer(); // ação sobre a água (método)
    System.out.println(a.temperatura); // (atributo/propriedade da água)
    a.aquecer();
    a.aquecer();
    System.out.println(a.temperatura);
    System.out.println(a.estaGasosa()); // false
  }
}

class Agua {
  int temperatura = 20;

  void aquecer() {
    this.temperatura++;
  }

  boolean estaGasosa() {
    return this.temperatura >= 100;
  }
}
