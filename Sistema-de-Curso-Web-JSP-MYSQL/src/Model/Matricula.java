package Model;

import java.util.Date;

public class Matricula {
	private Aluno aluno;
	private Curso curso;
	private Turma turma;
	private int codMatricula;
	private double valorMatricula;
	private Date dataMatricula;
	private Boolean statusMatricula;
	private Boolean statusPagamento;
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public int getCodMatricula() {
		return codMatricula;
	}
	public void setCodMatricula(int codMatricula) {
		this.codMatricula = codMatricula;
	}
	public double getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(double valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Date getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public Boolean getStatusMatricula() {
		return statusMatricula;
	}
	public void setStatusMatricula(Boolean statusMatricula) {
		this.statusMatricula = statusMatricula;
	}
	public Boolean getStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(Boolean statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	
	
	
	
}
