package orientacao_a_objeto;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		func1.nome = "Joaquim";
		// func1.salario = 1500d;

		func1.aumentarSalario(100d);

		Funcionario func2 = new Funcionario();
		func2.nome = "Maria";

		Funcionario func3 = new Funcionario();
		func3.nome = "Ana Julia";

		System.out.println(func1.consultardados() + "   " + "Vale Refeição: R$" + Funcionario.valeRefeicaoDiario);
		System.out.println(func2.consultardados() + "   " + "Vale Refeição: R$" + Funcionario.valeRefeicaoDiario);
		System.out.println(func3.consultardados() + "   " + "Vale Refeição: R$" + Funcionario.valeRefeicaoDiario);

		;

	}

}
