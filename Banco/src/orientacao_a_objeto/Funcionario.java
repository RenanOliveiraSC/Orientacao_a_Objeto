package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Funcionario {
	DecimalFormat df = new DecimalFormat("#0.00");
	String nome;
	double salario;
	static double valeRefeicaoDiario = 19;

	public static void reajustaValeRefeicaoDiario(double taxa) {
		Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
		Funcionario.reajustaValeRefeicaoDiario(0.5);

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
