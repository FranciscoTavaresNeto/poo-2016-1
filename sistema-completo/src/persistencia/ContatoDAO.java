package persistencia;

import dominio.Contato;

import java.io.*;
import java.sql.*;

// Data Access Object (Objeto de Acesso a Dados)
// em outras palavras: Persistência de Objetos
public class ContatoDAO {

	private static final String URL = 
		"jdbc:postgresql://localhost:5432/agenda";
	private static final String PWD = "postgres";
	private static final String USR = "postgres";

	public void salvar(Contato c) {
		// banco
		try {
			// registrar o driver
			Class.forName("org.postgresql.Driver");
			// conexao
			Connection conexao =
			DriverManager.getConnection(URL, USR, PWD);
			Statement comando = conexao.createStatement();
			// TODO comando vulnerável a ataques de SQL Injection, MELHORAR DEPOIS!!!
			String sql = "INSERT INTO contatos VALUES ('" 
						+ c.getNome() + "', '" 
						+ c.getTelefone() + "', '" 
						+ c.getEmail() + "')";
			// submete o comando para o banco
			comando.execute(sql);
			
			conexao.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void salvarArquivo(Contato c) {
		// TODO: fazer gravar em disco
		try {
			File arquivo = new File("contatos.csv");
			FileOutputStream saida =
					new FileOutputStream(arquivo, true);
			PrintWriter printer = new PrintWriter(saida);
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


















