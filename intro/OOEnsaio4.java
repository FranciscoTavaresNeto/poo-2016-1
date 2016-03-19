public class OOEnsaio4 {
  public static void main(String[] args) {
    Horario h1 = new Horario();
    h1.horas = 21;
    h1.minutos = 26;
    System.out.println(h1.horas); // 21
    System.out.println(h1.horas == 21); // 21

    Horario h2 = h1;

    h1.horas = 22;
    System.out.println(h2.horas);
    h2.minutos = 30;

    int x = 5;
    int y = x;
    x = 7;
    System.out.println(y);

    Horario teste = new Horario();
    teste.horas = 21;
    teste.minutos = 45;
    meiodia(teste);
    System.out.println(teste.horas); // 21?
    System.out.println(teste.minutos); // 45?
  }

  static void meiodia(Horario h) {
    h.horas = 12;
    h.minutos = 0;
  }
}

class Horario {
  int horas, minutos;
}
