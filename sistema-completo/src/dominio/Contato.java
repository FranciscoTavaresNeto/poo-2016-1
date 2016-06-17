package dominio;

import persistencia.ContatoDAO;

public class Contato {
	
	private String nome, telefone, email;
	
	private ContatoDAO dao = new ContatoDAO();
	
	public Contato(String nome, String telefone, String email) {
		if (nome.isEmpty()) 
			throw new IllegalArgumentException("O nome não pode ser vazio");
		// expressão regular (regex)
		if ( ! telefone.matches("\\d{10}"))
			throw new IllegalArgumentException("O telefone deve ter 10 números");
		
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}

	public void salvar() {
		dao.salvar(this);
	}

	
	
}
