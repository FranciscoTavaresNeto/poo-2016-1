package apresentacao;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import dominio.Contato;

public class ContatoFrame extends JFrame {
	
	private JLabel labelNome, labelTelefone, labelEmail;
	private JTextField textNome, textTelefone, textEmail;
	private JButton buttonSalvar;
	private Contato contato;
	
	public ContatoFrame() {
		
		this.setSize(400, 300);
		this.setTitle("Agenda");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.labelNome = new JLabel("Nome:");
		this.labelTelefone = new JLabel("Telefone:");
		this.labelEmail = new JLabel("E-Mail:");
		
		this.textNome = new JTextField(20);
		this.textTelefone = new JTextField(10);
		this.textEmail = new JTextField(20);
		
		this.buttonSalvar = new JButton("Salvar");
		this.buttonSalvar.addActionListener(new ActionSalvar());
		
		this.setLayout(new FlowLayout());
		
		this.getContentPane().add(labelNome);
		this.getContentPane().add(textNome);
		this.getContentPane().add(labelTelefone);
		this.getContentPane().add(textTelefone);
		this.getContentPane().add(labelEmail);
		this.getContentPane().add(textEmail);
		this.getContentPane().add(new JLabel());
		this.getContentPane().add(buttonSalvar);
		
		this.pack();
		
		this.setResizable(false);
		
		this.setVisible(true);
	}
	
	private class ActionSalvar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				contato = new Contato(
						textNome.getText(), 
						textTelefone.getText(),
						textEmail.getText());		
				
				System.out.println(contato);
				
				contato.salvar();
				
				JOptionPane.showMessageDialog(
						ContatoFrame.this, "Contato salvo com sucesso"
					);
			} catch (IllegalArgumentException ex) {
				JOptionPane.showMessageDialog(
						ContatoFrame.this,
						ex.getMessage(),
						"Não foi possível salvar",
						JOptionPane.ERROR_MESSAGE
				);
			}
		}
		
	}
	
	
}






