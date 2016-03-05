package texto;
// todas as classes iniciam com letra maiúscula
public class Main {
  // texto.Main
  public static void main(String[] args) {
    // tipos primitivos e básico
    // int, long, float, double, boolean, char
    // não são objetos (são valores)
    // String (é um objeto, não é primitivo, mas é básico)
    // "ifrs" == ['i', 'f', 'r', 's'] == char[]
    String s = "ifrs";
    char[] letras = s.toCharArray();
    // [i, f, r, s]
    //  0  1  2  3
    System.out.println(letras.length);
    System.out.println(letras[letras.length - 1]);
    System.out.println(letras[0]);
    System.out.println( (int) letras[0]);
    System.out.println( (char) 106);
    System.out.println( (int) 6.7);
    System.out.print( (char) (letras[0] - 32) );
    System.out.print( (char) (letras[1] - 32) );
    System.out.print( (char) (letras[2] - 32) );
    System.out.println( (char) (letras[3] - 32) );

    String entrada = "Teste de Palavra 123";
    String saida = Frase.up(entrada);
    System.out.println(saida); // EXEMPLO
  }


}
