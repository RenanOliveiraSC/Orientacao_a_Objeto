package orientacao_a_objeto;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		func1.nome = "Joaquim";
		func1.salario = 1500d;

		Funcionario func2 = new Funcionario();
		func2.nome = "Maria";
		func2.salario = 1800d;

		func1.aumentarSalario(100d);
		func2.aumentarSalario(100d);

		System.out.println(func1.consultardados());
		System.out.println(func2.consultardados());

	}

}
