package orientacao_a_objeto;

import java.text.DecimalFormat;

public class TesteAgenciaConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");

		Agencia agencia = new Agencia(1234);

		Conta conta = new Conta(1000);
		conta.setNum(123456);
		conta.setSaldo(1500d);

		conta.agencia = agencia;

		/*
		 * System.out.println("A conta "+conta.num+
		 * " com limite R$"+df.format(conta.limite)+
		 * " com saldo R$"+df.format(conta.saldo)+
		 * " pertence a Agência "+conta.agencia.numero);
		 */

		conta.deposito(150);
		conta.saque(50);
		System.out.println(conta.SaldoDisponivel());
		System.out.println(conta.extrato());

	}

}
