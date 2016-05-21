package a0502;

import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		ContaCorrente cc = new ContaCorrente(0.0);
		cc.deposito(1000.0);
		System.out.println(cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(0.0);
		cp.deposito(1000.0);
		System.out.println(cp.getSaldo());
		
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial(0.0, 500.0);
		cce.deposito(1000.0);
		System.out.println(cce.getSaldo());
		
		Job job = new Job();
		
		job.addConta(cc);
		job.addConta(cp);
		job.addConta(cce);
		
		Timer timer = new Timer();
		timer.schedule(job, 1000, 3000);
		
		
		
		
	}
}



