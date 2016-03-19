public class OOEnsaio3 {
  public static void main(String[] args) {
    // informação contextualizada é
    // definida por uma classe
    // int[] horario1 = {19, 10}; //19:10
    // instanciando/construindo
    // usamos o operador new Tipo();
    Horario h1 = new Horario();
    System.out.println(h1.horas);
    System.out.println(h1.minutos);
    System.out.println(h1.horas + ":" + h1.minutos);
    h1.horas = 19;
    h1.minutos = 10;
    System.out.println(h1.horas);
    System.out.println(h1.minutos);

    Horario h2 = new Horario();
    // instanciando a partir da classe Horario
    // cria um objeto Horario
    h2.horas = 1;
    h2.minutos = 20;

    Horario resposta = adiciona(h1, h2);
    System.out.println(reposta.horas);
    System.out.println(reposta.minutos);
  }

  static Horario adiciona(Horario h1, Horario h2) {
    Horario resp = new Horario();
    resp.horas = h1.horas + h2.horas;
    resp.minutos = h1.minutos + h2.minutos;
    return resp;
  }

}
// a classe Horario substitui o vetor de int (int[])
// toda classe é um Tipo de Dado
class Horario {
  // atributos de horário (horas e minutos)
  int horas   = 0;
  int minutos = 0;
}
