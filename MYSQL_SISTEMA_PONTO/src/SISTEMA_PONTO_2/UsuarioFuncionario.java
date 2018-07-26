package SISTEMA_PONTO_2;

public class UsuarioFuncionario {
	private int Id;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String senha;
	
	public UsuarioFuncionario(int Id,String nome,String cpf,String telefone,String email,String senha) {
		this.Id = Id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}
	
		
	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
}
