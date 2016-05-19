package composicao;

import java.util.*;

public class Usuario {
	
	private String email;
	private String senha;
	private Perfil perfil;
	
	// atributos, gerar construtor, getters (opcionalmente setters),
	// toString e equals

	public Usuario(String email, String senha) {
		this.email = email;
		alterarSenha(senha);
		this.perfil = new Perfil();
	}
	
	// apenas uma implementação da política de senha
	public void alterarSenha(String senha) {
		// política de senha
		if (senha.length() < 5) {
			throw new IllegalArgumentException("senha muito curta");
		}
		this.senha = senha;
	}




	public Perfil getPerfil() {
		return perfil;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", senha=" + senha + "]";
	}

	public void limparPerfil() {
		this.perfil = new Perfil();
	}
	
	// classe interna
	public class Perfil {

		private String nome;
		private Date dataNascimento;
		private EstadoCivil estadoCivil;
		
		// trabalho
		// a intenção é usar uma lista
		private Trabalho[] trabalhos = new Trabalho[10];
		private int contTrabalho = 0;
		
		public void adicionaTrabalho(Trabalho trab) {
			trabalhos[contTrabalho++] = trab;
		}
		
		public Trabalho[] getTrabalhos() {
			return trabalhos;
		}

		// construtor privado (só a própria classe pode construir)
		private Perfil() {
			// construtor vazio
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Date getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public EstadoCivil getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(EstadoCivil estadoCivil) {
			this.estadoCivil = estadoCivil;
		}

		@Override
		public String toString() {
			return "Perfil [nome=" + nome 
					+ ", dataNascimento=" + dataNascimento 
					+ ", estadoCivil=" + estadoCivil 
					+ ", trabalhos=" + Arrays.toString(trabalhos) + "]";
		}

		
	}
	

}










