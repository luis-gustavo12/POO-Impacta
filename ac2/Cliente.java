package ac2;

public class Cliente {

	
	String id, nome, endereco, telefone, eMail, cpf;
	
	public Cliente(String id, String nome, String endereco, String telefone, String eMail, String cpf) {
		
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.eMail = eMail;
		this.cpf = cpf;
		
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String get_eMail() {
		return eMail;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	
	
}
