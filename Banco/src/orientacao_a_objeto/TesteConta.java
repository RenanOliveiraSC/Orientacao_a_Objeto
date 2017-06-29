package orientacao_a_objeto;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.num = 8239541;
		conta1.saldo = 500.00;

		Conta conta2 = new Conta();
		conta2.num = 1459328;
		conta2.saldo = 0;

		System.out.println("Conta: " + conta1.num + "  Saldo: " + conta1.saldo + "  Limite: " + conta1.limite);
		System.out.println("Conta: " + conta2.num + "  Saldo: " + conta2.saldo + "  Limite: " + conta2.limite);
	}
}
