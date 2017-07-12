package orientacao_a_objeto;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();

		gerente.setNome("Joaquim");
		gerente.setSalario(1500d);
		gerente.bonificacao();

		Gerente gerente2 = new Gerente();
		gerente2.setNome("Joaquim");
		gerente2.setSalario(1500d);
		gerente2.bonificacao();

		gerente.aumentarSalario();
		gerente2.aumentarSalario();

		System.out.println(gerente.consultarDados());
		System.out.println(gerente2.consultarDados());
	}
}
