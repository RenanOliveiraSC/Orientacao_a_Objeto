package orientacao_a_objeto;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		func1.nome = "Marcos";
		func1.salario = 980.00;

		Funcionario func2 = new Funcionario();
		func2.nome = "Marcos";
		func2.salario = 1200.00;
		System.out.println("Funcion�rio: " + func1.nome + "  Sal�rio: " + func1.salario);
		System.out.println("Funcion�rio: " + func2.nome + "  Sal�rio: " + func2.salario);
	}

}
