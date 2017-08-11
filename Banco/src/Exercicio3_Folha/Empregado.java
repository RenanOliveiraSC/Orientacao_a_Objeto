package Exercicio3_Folha;

public abstract class Empregado {

	private String nome;
	private String sobreNome;
	private double salario;

	public abstract double calularGanho();

	public Empregado(String nome, String sobrenome) {
		this.nome = nome;
		this.sobreNome = sobrenome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}