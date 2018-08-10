package Model;

public class Atendente extends Usuario {
	private String nome; 
	private String cPF;
	private String rG;
	private int codFuncionario;
	private Matricula matricula;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcPF() {
		return cPF;
	}
	public void setcPF(String cPF) {
		this.cPF = cPF;
	}
	public String getrG() {
		return rG;
	}
	public void setrG(String rG) {
		this.rG = rG;
	}
	public int getCodFuncionario() {
		return codFuncionario;
	}
	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
}
