package orientacao_a_objeto;

public class TesteFuncionarios {

	public static void main(String[] args) {
		Gerentes gerente = new Gerentes();
		gerente.setNome("José");
		gerente.setSalario(1500d);
		gerente.setSenha("123456");

		Telefonistas telefonista = new Telefonistas();
		telefonista.setNome("Maria");
		telefonista.setSalario(1300d);
		telefonista.setCodigoEstacaoTrabalho(85);

		Secretarias secretaria = new Secretarias();
		secretaria.setNome("Ana Julia");
		secretaria.setSalario(1200d);
		secretaria.setNumeroRamal(1234);

		System.out.println(gerente.consultarDados());
	}
}
