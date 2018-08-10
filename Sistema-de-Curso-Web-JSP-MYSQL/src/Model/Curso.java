package Model;

import java.util.Date;

public class Curso {
	
	private int codigo;
	private String nome;
	private Date dataInicio;
	private	Date dataTermino;
	private Date horarioEntrada;
	private	Date hosraioSaida;
	private double valor;
	private Aluno aluno;
	private Matricula matricula;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	public Date getHorarioEntrada() {
		return horarioEntrada;
	}
	public void setHorarioEntrada(Date horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}
	public Date getHosraioSaida() {
		return hosraioSaida;
	}
	public void setHosraioSaida(Date hosraioSaida) {
		this.hosraioSaida = hosraioSaida;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
	
}
