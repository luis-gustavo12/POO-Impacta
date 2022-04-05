package ac2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		String u_id, u_nome, endereco, telefone, email, cpf;
		ArrayList<Cliente> ListaCliente = new ArrayList<Cliente>();
		
		
		
		while (true) {
		
		
			String option = JOptionPane.showInputDialog(null, "Bem-vindo ao cadastro!\nInsira 1 para cadastro\n2 para consulta", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
			
			
			
			switch(option) {
			
			
				//cadastro
				case "1":
					
					u_id = JOptionPane.showInputDialog(null, "Insira o seu ID", "Janela ID");
					u_nome = JOptionPane.showInputDialog(null, "Insira seu nome", "Janela nome");
					endereco = JOptionPane.showInputDialog(null, "Insira seu endereco", "Janela endereco");
					telefone = JOptionPane.showInputDialog(null, "Insira seu telefone", "Janela telefone");
					email = JOptionPane.showInputDialog(null, "Insira seu e-mail", "Janela e-mail");
					cpf = JOptionPane.showInputDialog(null, "Insira seu CPF", "Janela CPF");
					
					Cliente cliente = new Cliente(u_id, u_nome, endereco, telefone, email, cpf);
					
					ListaCliente.add(cliente);
					JOptionPane.showMessageDialog(null, "Cliente cadastrado!\nVoltando ao menu princiapl", "Cadastro Concluido", JOptionPane.OK_OPTION);
			
					break;
					
					
					
					
					
				//consulta
				case "2":
					
					if (ListaCliente.size() == 0) {
						JOptionPane.showMessageDialog(null, "Lista Vazia!\nVolte ao menu e crie um novo cadastro de cliente!", "Erro", JOptionPane.WARNING_MESSAGE);
						break;
					}
					
					String showString = "";
					
					
					for (int i = 0; i < ListaCliente.size();i++) {
						
						showString += "ID: " + ListaCliente.get(i).getId() + "\n Nome: " + ListaCliente.get(i).getNome() + "\nTelefone: " + ListaCliente.get(i).getTelefone() + "\nE-Mail: " + ListaCliente.get(i).get_eMail() + "\nCPF: " + ListaCliente.get(i).getCpf() + "\n";
						
						
						
					}
					
					JOptionPane.showMessageDialog(null, showString);
					
					
					
					break;
			}
			
			
			
		
		
		}
		
		
		
		
	}
	
	

}
