package texto;

public class Frase {
  public static String up(String s) {
    char[] letras = s.toCharArray();
    char[] maiusculas = new char[letras.length];
    for (int i = 0; i < letras.length; i++) {
      if (letras[i] >= 97 && letras[i] <= 122) {
        maiusculas[i] = (char) (letras[i] - 32);
      } else {
        maiusculas[i] = letras[i];
      }
    }
    return new String(maiusculas);
  }

}
