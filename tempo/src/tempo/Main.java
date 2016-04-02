package tempo;

public class Main {
  public static void main(String[] args) {
    // 19:31:25
    Horario inicio = new Horario(12,10,10);
    System.out.println(inicio.horas
        + ":" + inicio.minutos
        + ":" + inicio.segundos);

    Horario valido = new Horario(19, 38, 45);
    // valido.horas = 19;
    // valido.minutos = 38;
    // valido.segundos = 45;
    // Fly by Wire (voa por fios)
    // Fail-Safe: intenção de não quebrar
    // Fail-Fast: intenção de quebrar
    // Horario invalido = new Horario(25, 10, 32);
    // construtor (serve para inicializar um objeto)

    Horario invalido = new Horario(0, 0, 0);
    // invalido.horas = 25; // não é permitido pq é final!!!
    // System.out.println(invalido.horas); // 25

    Horario h1 = new Horario(13, 15, 0);
    // h1.horas = h1.horas + 2; // não é permitido pq é final!!!
    h1 = new Horario(h1.horas + 2, 15, 0);

    System.out.println(h1.horas); // 15

    Horario h2 = new Horario(20, 24);

    Horario h3 = new Horario(21);
    System.out.println(h3.segundos); // 0
    // tic
    // h3 = tic(h3); // procedimental chamada de tic passando o Horario
    h3 = h3.tic(); // chamada do método tic no objeto representado por h3 (Horario)
    System.out.println(h3.segundos); // 1
    h3 = h3.tic().tac().tic().tac();
    System.out.println(h3.segundos); // 5
    h3.tic().tac();
    System.out.println(h3.segundos); // 5
    // ações transformam
    // h3 = h3.tic(); // ação tic() sobre o Horário
    // existem também consultas
    boolean meianoite = h3.ehMeiaNoite(); // false/true
    System.out.println(meianoite);
    System.out.println(h3.segundos); // 5

    Horario h4 = new Horario();
    System.out.println(h4.ehMeiaNoite()); // true
    h4.tic(); // 0:0:1 objeto órfão
    System.out.println(h4.ehMeiaNoite()); // ?

    System.out.println(h3); // h3.toString() implícito
    System.out.println(h4.toString());
  }



  // procedimental (Não-OO)
  // public static Horario tic(Horario h) {
  //   return new Horario(h.horas, h.minutos, h.segundos + 1);
  // }
}
