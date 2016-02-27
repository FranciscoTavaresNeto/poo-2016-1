public class Plural {

  static void pluralizar(String palavra) {
    String plural = palavra + "s";

    if (palavra.endsWith("r"))
      plural = palavra + "es";

    if (palavra.endsWith("ão"))
      plural = palavra.replace("ão", "ães");

    System.out.println(plural);
  }
  // main (tab)
  public static void main(String[] args) {
    // pl (tab)
    // System.out.println("funciona");
    pluralizar("ogro"); // ogros
    pluralizar("trator"); // tratores
    pluralizar("pão"); // pães

  }
}
