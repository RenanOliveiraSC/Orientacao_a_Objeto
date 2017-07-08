package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Funcionario {
	DecimalFormat df = new DecimalFormat("#0.00");
	private String nome;
	private double salario;

	static double valeRefeicaoDiario = 15;
	static double bonificacao;

	public static void reajustaValeRefeicaoDiario(double taxa) {
		Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
		Funcionario.reajustaValeRefeicaoDiario(0.5);

	}

	public void bonificacao(double bonus) {
		Funcionario.bonificacao = this.salario + Funcionario.bonificacao * ((bonus / 100) + 1);
	}

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

	public Funcionario() {
		this.salario = 1000d;
	}

	public void aumentarSalario(double valor) {

		this.salario += valor;
	}

	public String consultardados() {
		return "Nome: " + this.nome + "\nSalário: R$ " + df.format(this.salario);

	}

}
