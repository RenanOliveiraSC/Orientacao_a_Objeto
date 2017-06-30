package orientacao_a_objeto;

import java.text.DecimalFormat;

public class TesteAgenciaConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Agencia agencia = new Agencia();
		agencia.numero = 1234;
		
		Conta conta = new Conta();
		conta.num = 123456;
		conta.saldo = 1500d;
		
		conta.agencia = agencia;
		
		
		
		/*System.out.println("A conta "+conta.num+
				" com limite R$"+df.format(conta.limite)+
				" com saldo R$"+df.format(conta.saldo)+
				" pertence a Agência "+conta.agencia.numero);
		*/
		
		conta.deposito(150);
		conta.saque(50);
		System.out.println(conta.SaldoDisponivel());
		System.out.println(conta.extrato());
		
		
	}
	
}
