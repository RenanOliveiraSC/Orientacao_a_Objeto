package orientacao_a_objeto;

import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");

		Conta conta1 = new Conta(8239541);
		conta1.setSaldo(500d);

		//System.out.println(Conta.contador);

		Conta conta2 = new Conta(1459328);
		conta2.setSaldo(0);
		//System.out.println(Conta.contador);

		Conta conta3 = new Conta(1459328);
		conta3.setSaldo(0);
		//System.out.println(Conta.contador);

		Conta conta4 = new Conta(8239541);
		conta4.setSaldo(1000d);
		//System.out.println(Conta.contador);

		System.out.println("Id da Conta: "+conta1.getIdConta()+" "+"Conta: " + conta1.getNum() + "  Saldo: " + df.format(conta1.getSaldo()) + "  Limite: "
				+ df.format(conta1.getLimite()));

		System.out.println("Id da Conta: "+conta2.getIdConta()+" "+"Conta: " + conta2.getNum() + "  Saldo: " + df.format(conta2.getSaldo()) + "  Limite: "
				+ df.format(conta2.getLimite()));

		System.out.println("Conta: " + conta3.getNum() + "  Saldo: " + df.format(conta3.getSaldo()) + "  Limite: "
				+ df.format(conta3.getLimite()) + " " + "Tarifa: R$ " + conta3.tarifa);

		System.out.println("Conta: " + conta4.getNum() + "  Saldo: " + df.format(conta4.getSaldo()) + "  Limite: "
				+ df.format(conta4.getLimite()) + " " + "Tarifa: R$ " + conta4.tarifa);
		Conta.zeraConta();
		System.out.println(Conta.contador);
	}
}
