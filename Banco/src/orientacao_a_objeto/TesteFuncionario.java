package orientacao_a_objeto;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		func1.nome = "Marcos";
		func1.salario = 980.00;

		Funcionario func2 = new Funcionario();
		func2.nome = "Marcos";
		func2.salario = 1200.00;
		System.out.println("Funcionário: " + func1.nome + "  Salário: " + func1.salario);
		System.out.println("Funcionário: " + func2.nome + "  Salário: " + func2.salario);
	}

}
