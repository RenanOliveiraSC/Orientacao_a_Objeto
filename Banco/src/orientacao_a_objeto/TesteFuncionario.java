package orientacao_a_objeto;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		func1.setNome("Joaquim");
		// func1.salario = 1500d;

		func1.aumentarSalario(100d);
		func1.bonificacao();

		Funcionario func2 = new Funcionario();
		func2.setNome("Maria");
		func2.bonificacao();

		Funcionario func3 = new Funcionario();
		func3.setNome("Ana Julia");
		func3.bonificacao();
		Funcionario.reajustaValeRefeicaoDiario(10);

		System.out.println(func1.consultarDados() + "   " + "Vale Refei��o: R$" + Funcionario.valeRefeicaoDiario + " "
				+ "Bonifica��o: R$ ");
		System.out.println(func1.consultarDados() + "   " + "Vale Refei��o Ajustado: R$"
				+ Funcionario.valeRefeicaoDiario + " " + "Bonifica��o: R$ ");
		System.out.println(func2.consultarDados() + "   " + "Vale Refei��o: R$" + Funcionario.valeRefeicaoDiario + " "
				+ "Bonifica��o: R$ ");
		System.out.println(func3.consultarDados() + "   " + "Vale Refei��o: R$" + Funcionario.valeRefeicaoDiario + " "
				+ "Bonifica��o: R$ ");

		;

	}

}
