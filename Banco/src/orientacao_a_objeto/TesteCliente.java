package orientacao_a_objeto;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setCodigo(1);
		cliente1.setNome("José") ;

		Cliente cliente2 = new Cliente();
		cliente2.setCodigo(2);
		cliente2.setNome("Rafael");
		System.out.println(cliente1.getNome());
		System.out.println(cliente2.getNome());
	}
}
