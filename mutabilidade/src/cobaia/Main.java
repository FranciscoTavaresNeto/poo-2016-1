package cobaia;

import teste.Contador;
import banco.ContaCorrente;

// visibilidade (nível de acesso)
// ex.: public, private, protected
public class Main {
  public static void main(String[] args) {
    // teste.Contador cont = new teste.Contador();
    Contador cont = new Contador(4);
    System.out.println(cont.valor()); // 0
    cont.incrementa(); // método/verbo == ação/operação
    System.out.println(cont.valor()); // 1
    System.out.println(cont.valor()); // 1
    cont.incrementa();
    cont.incrementa();
    System.out.println(cont.valor()); // 3
    cont.incrementa(); // s
    cont.incrementa(); // n
    cont.incrementa(); // n
    cont.incrementa(); // n
    System.out.println(cont.valor()); // 4

    // while (cont.valor() < 100) cont.incrementa();
    // System.out.println(cont.valor()); // 100

    // System.out.println(cont.valor); // ?
    // é recomendado evitar alterações diretas nos atributos dos objetos
    // cont.valor++; // VIOLA O ENCAPSULAMENTO
    // Princípio OO: ENCAPSULAMENTO!
    // Não alterar diretamente a estrutura interna dos objetos.
    // System.out.println(cont.valor); // ?
    // cont.incrementa();

    // API: qual é a interface da Conta Corrente?
    ContaCorrente cc = new ContaCorrente(100.0);
    System.out.println(cc.saldo()); // 100.0
    cc.deposita(50.0);
    System.out.println(cc.saldo()); // 150.0
    cc.saque(20.0);
    System.out.println(cc.saldo()); // 130.0
    cc.saque(130.0);
    System.out.println(cc.saldo()); // 0

  }
}
