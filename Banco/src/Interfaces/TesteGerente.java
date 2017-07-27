package Interfaces;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerente1 = new Gerente();
		Gerente gerente2 = new Gerente();

		gerente1.setNome("Vitor Hugo");
		gerente1.setSalario(1500d);
		try {
			gerente1.aumentarSalario(1500d);
			System.out.println("Operação Realizada com sucesso!");
			System.out.println("Nome do Funcionario: " + gerente1.getNome() + "\nValor do Aumento: R$ "
					+ gerente1.getNovoValorSalario());
		} catch (Exception e) {
			System.out.println("Erro: Valor deve ser maior que ZERO");
		}

		gerente2.setNome("Renan Oliveira");
		try {
			gerente2.aumentarSalario(0d);
			System.out.println("Operação Realizada com sucesso!");
			System.out.println("Nome do Funcionario: " + gerente2.getNome() + "\nValor do Aumento: R$ "
					+ gerente2.getNovoValorSalario());
		} catch (Exception e) {
			System.out.println("Erro: Valor deve ser maior que ZERO");
		}
	}
}
