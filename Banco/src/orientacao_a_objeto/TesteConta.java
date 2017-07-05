package orientacao_a_objeto;

import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");

		Conta conta1 = new Conta(8239541);
		conta1.saldo = 500d;

		System.out.println(Conta.contador);

		Conta conta2 = new Conta(1459328);
		conta2.saldo = 0;
		System.out.println(Conta.contador);

		Conta conta3 = new Conta(1459328);
		conta3.saldo = 0;
		System.out.println(Conta.contador);

		Conta conta4 = new Conta(8239541);
		conta4.saldo = 1000d;
		System.out.println(Conta.contador);

		System.out.println("Conta: " + conta1.num + "  Saldo: " + df.format(conta1.saldo) + "  Limite: "
				+ df.format(conta1.limite));

		System.out.println("Conta: " + conta2.num + "  Saldo: " + df.format(conta2.saldo) + "  Limite: "
				+ df.format(conta2.limite));

		System.out.println("Conta: " + conta3.num + "  Saldo: " + df.format(conta3.saldo) + "  Limite: "
				+ df.format(conta3.limite) + " " + "Tarifa: R$ " + conta3.tarifa);

		System.out.println("Conta: " + conta4.num + "  Saldo: " + df.format(conta4.saldo) + "  Limite: "
				+ df.format(conta4.limite) + " " + "Tarifa: R$ " + conta4.tarifa);
		Conta.zeraConta();
	}
}
