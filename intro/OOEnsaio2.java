public class OOEnsaio2 {
  public static void main(String[] args) {
    // representação de dados que andam juntos
    // int h = 19;
    // int m = 46;
    // int[] horario = {19, 46};
    // Object[] objetos = {1, "teste", 6.0};
    // System.out.println(objetos[0]);
    // System.out.println(objetos[1]);
    // System.out.println(objetos[2]);
    int[] horario1 = {19, 10}; //19:10
    int[] horario2 = {1, 20};  // 1:20
    int[] resposta = adiciona(horario1, horario2);
    System.out.println(resposta[0]); // 20
    System.out.println(resposta[1]); // 30
    int[] horario3 = {0, 10};
    resposta = adiciona(resposta, horario3);
    System.out.println(resposta[0]); // 20
    System.out.println(resposta[1]); // 30

  }

  static int[] adiciona(int[] h1, int[] h2) {
    int[] r = {0, 0}; // new int[2]
    r[0] = h1[0] + h2[0];
    r[1] = h1[1] + h2[1];
    return r;
    // return new int[] {h1[0] + h2[0], h1[1] + h2[1]};
  }
}
