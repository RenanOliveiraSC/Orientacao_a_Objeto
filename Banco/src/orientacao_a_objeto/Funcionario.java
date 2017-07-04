package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Funcionario {
	DecimalFormat df = new DecimalFormat("#0.00");
	String nome;
	double salario;

	public void aumentarSalario(double valor) {

		this.salario += valor;
	}

	public String consultardados() {
		return "Nome: " + this.nome + "\nSal�rio: R$ " + df.format(this.salario);

	}

}
