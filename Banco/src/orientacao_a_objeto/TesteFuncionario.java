package orientacao_a_objeto;

import java.text.DecimalFormat;

public class TesteFuncionario {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		Funcionario func1 = new Funcionario();
		func1.nome = "Marcos";
		func1.salario = 980d;

		Funcionario func2 = new Funcionario();
		func2.nome = "Marcos";
		func2.salario = 1200d;
		System.out.println("Funcionário: " + func1.nome + "  Salário: R$ " + df.format(func1.salario));
		System.out.println("Funcionário: " + func2.nome + "  Salário: R$ " + df.format(func2.salario));
	}

}
