package orientacao_a_objeto;

public class TesteHeranca {

	public static void main(String[] args) {

		Gerentes gerente = new Gerentes();
		gerente.setNome("Marcos");
		gerente.setSenha("354789");
		gerente.setSalario(8500d);

		Gerentes gerente2 = new Gerentes();
		gerente2.setNome("Rafael");
		gerente2.setSenha("987453");
		gerente2.setSalario(3500d);

		Telefonistas telefonista = new Telefonistas();
		telefonista.setNome("Maria");
		telefonista.setCodigoEstacaoTrabalho(89);
		telefonista.setSalario(1500d);

		Telefonistas telefonista2 = new Telefonistas();
		telefonista2.setNome("Bete");
		telefonista2.setCodigoEstacaoTrabalho(23);
		telefonista2.setSalario(1500d);

		System.out.println("Nome do Gerente: " + gerente.getNome() + "\nSalario: R$ " + gerente.getSalario()
				+ "\nSenha: " + gerente.getSenha());

		System.out.println();

		System.out.println("Nome do Gerente: " + gerente2.getNome() + "\nSalario: R$ " + gerente2.getSalario()
				+ "\nSenha: " + gerente2.getSenha());

		System.out.println();

		System.out.println("Nome do Telefonista: " + telefonista.getNome() + "\nSalario: R$ " + telefonista.getSalario()
				+ "\nEstação de Trabalho: " + telefonista.getCodigoEstacaoTrabalho());

		System.out.println();

		System.out.println("Nome do Telefonista: " + telefonista2.getNome() + "\nSalario: R$ "
				+ telefonista2.getSalario() + "\nEstação de Trabalho: " + telefonista2.getCodigoEstacaoTrabalho());
	}
}
