package orientacao_a_objeto;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.codigo = 1;
		cliente1.nome = "José";

		Cliente cliente2 = new Cliente();
		cliente2.codigo = 2;
		cliente2.nome = "Rafael";
		System.out.println(cliente1.nome);
		System.out.println(cliente2.nome);
	}
}
