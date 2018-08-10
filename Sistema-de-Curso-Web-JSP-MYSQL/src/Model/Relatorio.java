package Model;

public class Relatorio {
	private Matricula matricula;
	private Aluno aluno;
	private Turma turma;
	private Curso curso;
	private Matricula alunosMatriculados;
	private Matricula matriculasCanceladas;
	
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Matricula getAlunosMatriculados() {
		return alunosMatriculados;
	}
	public void setAlunosMatriculados(Matricula alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}
	public Matricula getMatriculasCanceladas() {
		return matriculasCanceladas;
	}
	public void setMatriculasCanceladas(Matricula matriculasCanceladas) {
		this.matriculasCanceladas = matriculasCanceladas;
	}
	
	
}
