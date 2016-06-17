package persistencia;

import dominio.Contato;

import java.io.*;

// Data Access Object (Objeto de Acesso a Dados)
// em outras palavras: Persistência de Objetos
public class ContatoDAO {

	public void salvar(Contato c) {
		// TODO: fazer gravar em disco
		try {
			File arquivo = new File("contatos.csv");
			PrintWriter printer = new PrintWriter(arquivo);
			printer.append(
					c.getNome() + ";"
			        + c.getTelefone() + ";"
					+ c.getEmail() + "\n");
			printer.flush();
			printer.close();
		} catch (IOException e) {
			throw new RuntimeException("Erro na gravação");
		}
	}
	
}
