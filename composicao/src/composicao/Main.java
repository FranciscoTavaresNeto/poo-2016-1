package composicao;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("marcio@if", "12345");
		System.out.println(usuario1);
		// usuario1.alterarSenha("12");
		// como informar dados do perfil do usuário
		// por ex.: nome, idade, ...
		// Usuario.
		         // Perfil
		usuario1.getPerfil().setNome("Marcio Torres");
		// chamar método ou atributo de uma referêcia nula lança NPE
		usuario1.getPerfil().setDataNascimento(new Date(76, 9, 25));
		usuario1.getPerfil().setEstadoCivil(EstadoCivil.UniaoEstavel);
		
		System.out.println(usuario1.getPerfil());
		
		usuario1.limparPerfil();
		
		System.out.println(usuario1.getPerfil());
		
		Trabalho t1 = new Trabalho("Bunge", new Periodo(2005, 11, 2009, 1));
		Trabalho t2 = new Trabalho("Bunge", new Periodo(2009, 4));

		usuario1.getPerfil().adicionaTrabalho(t1);
		usuario1.getPerfil().adicionaTrabalho(t2);
		
		System.out.println(usuario1.getPerfil());
		// navegando no grafo de objetos (nas interconexões do objeto)
		usuario1.getPerfil().getTrabalhos()[0].getPeriodo().setMesInicio(5);
		
	}
}








