public class OOEnsaio {
  public static void main(String[] args) {

    String s1 = "oo"; // instanciar um objeto
    // s1 guarda um objeto?
    if (s1 instanceof Object) {
      System.out.println("s1 é um objeto");
    }
    // outros objetos necessitam de um new
    // operador `new` que instancia um objeto
    Object s2 = new String("teste");
    if (s2 instanceof String) {
      System.out.println("s2 é uma string");
    }
    if (s2 instanceof Integer) {
      System.out.println("s2 é um inteiro");
    }
    // Object é a superclasse de todos os objetos
    // Todos os objetos são subclasses de Object

  }
}
