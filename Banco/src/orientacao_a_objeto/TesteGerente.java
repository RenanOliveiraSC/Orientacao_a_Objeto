package orientacao_a_objeto;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.nome = "Joaquim";
		gerente.salario = 1500d;

		Gerente gerente2 = new Gerente();
		gerente2.nome = "Joaquim";
		gerente2.salario = 1500d;

		gerente.aumentarSalario(15);
		gerente2.aumentarSalario();

		System.out.println(gerente.salario);
		System.out.println(gerente2.salario);
	}
}
