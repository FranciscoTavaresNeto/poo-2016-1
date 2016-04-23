public class OOEnsaio8 {
  public static void main(String[] args) {
    // representar Dinheiro? Ex.: 3,78
    Dinheiro valor = new Dinheiro(3, 78);
    System.out.println(valor); // toString() // 3,78
    Dinheiro valor2 = new Dinheiro(3, 78);
    System.out.println(valor.equals(valor2)); // true
  }
}
