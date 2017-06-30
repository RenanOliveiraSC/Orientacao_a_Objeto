package orientacao_a_objeto;

import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");

		Conta conta1 = new Conta();
		conta1.num = 8239541;
		conta1.saldo = 500d;
		// conta1.limite = 1000d;

		Conta conta2 = new Conta();
		conta2.num = 1459328;
		conta2.saldo = 0;
		// conta2.limite = 800d;

		System.out.println("Conta: " + conta1.num + "  Saldo: " + df.format(conta1.saldo) + "  Limite: "
				+ df.format(conta1.limite));
		System.out.println("Conta: " + conta2.num + "  Saldo: " + df.format(conta2.saldo) + "  Limite: "
				+ df.format(conta2.limite));
	}
}
