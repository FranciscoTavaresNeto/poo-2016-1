public class Vetor {
  public static void main(String[] args) {
    mostraMaior(new int[]{23, 45, 76, 32, 71});
    mostraMaior(new int[]{837284,823498,12093});
    mostraMaior(new int[]{89});
    mostraMaior(new int[]{});

    int[] lista1 = {65, 60, 80, 10}; // maior1 = 80
    int[] lista2 = {12, 17, 20, 5};  // maior2 = 20
    // somar o maior de cada lista: maior1 + maior2 = 100
    System.out.println(pegaMaior(lista1) + pegaMaior(lista2));
  }

  public static void mostraMaior(int[] numeros) {
    if (numeros.length > 0) {
      int maior = numeros[0];
      for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > maior) maior = numeros[i];
      }
      System.out.println(maior);
    }
  }
  // recebe um vetor de inteiros e devolve um inteiro
  // métodos não-void devem sempre ter um retorno
  public static int pegaMaior(int[] numeros) {
    if (numeros.length > 0) {
      int maior = numeros[0];
      for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > maior) maior = numeros[i];
      }
      return maior;
    } else {
      return 0;
    }
  }

}
