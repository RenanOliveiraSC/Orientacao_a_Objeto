package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Gerente {

	DecimalFormat df = new DecimalFormat("#0.00");

	private String nome;
	private double salario;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double valor) {
		this.salario = salario * ((valor / 100) + 1);
	}

	public void aumentarSalario() {
		this.aumentarSalario(10);
	}

}
