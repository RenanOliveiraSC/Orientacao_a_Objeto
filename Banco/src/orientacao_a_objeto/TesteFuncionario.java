package orientacao_a_objeto;

import java.text.DecimalFormat;

public class TesteFuncionario {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");

		Funcionario func1 = new Funcionario();
		func1.nome = "Joaquim";
		func1.salario = 1500d;

		Funcionario func2 = new Funcionario();
		func2.nome = "Maria";
		func2.salario = 1800d;

		Funcionario detalhes = new detalhes();
		detalhes = detalhes;

		System.out.println(
				"Funcion�rio: " + func1.nome + "\nSal�rio Atual: " + df.format(func1.salario) + "\nDetalhes: ");
		System.out
				.println("Funcion�rio: " + func2.nome + "\nSal�rio Atual: " + df.format(func2.salario) + "\nDetalhes ");

	}

}
