package a0502;

import java.util.*;

public class Job extends TimerTask {
	// alto acoplamento: conhecimento de um classe sobre outras
	// private ContaCorrente[] correntes = new ContaCorrente[10];
	// private ContaPoupanca[] poupancas = new ContaPoupanca[10];
	// private ContaCorrenteEspecial[] especiais = new ContaCorrenteEspecial[10];
	
	// baixo acoplamento: depende de uma abstração em vez da concretização
	// depende da generalização em vez da especificação
	private ContaAbstrata[] contas = new ContaAbstrata[10];
	private int i;
	
	public void addConta(ContaAbstrata c) { // covariantes//filhas
		contas[i++] = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				contas[i].cicloMensal();
				System.out.println(contas[i].getSaldo());
			}
		}
	}
	
	

}






