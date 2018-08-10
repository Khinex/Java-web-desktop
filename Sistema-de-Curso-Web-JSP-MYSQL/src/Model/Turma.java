package Model;

public class Turma {
	private Aluno aluno;
	private Usuario usuario;
	private int idTurma;
	private Curso curso;
	private Matricula matricula;
	private Curso dataDeInicio;
	private Curso dataDeTermino;
	
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public Curso getDataDeInicio() {
		return dataDeInicio;
	}
	public void setDataDeInicio(Curso dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public Curso getDataDeTermino() {
		return dataDeTermino;
	}
	public void setDataDeTermino(Curso dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}
	
	
	
}
