package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Gerente {

	DecimalFormat df = new DecimalFormat("#0.00");

	String nome;
	double salario;

	public void aumentarSalario(double valor) {
		this.salario = salario * ((valor / 100) + 1);
	}

	public void aumentarSalario() {
		this.aumentarSalario(10);
	}

}
