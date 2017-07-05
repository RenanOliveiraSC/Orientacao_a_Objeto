package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Conta {
	DecimalFormat df = new DecimalFormat("#0.00");

	int num;
	double saldo;
	double limite = 100d;
	Agencia agencia;
	static double tarifa = 2.10;
	static int contador;

	// Contrutor
	public Conta() {
		contador++;
	}

	public static void zeraConta() {
		System.out.println("O numero de contas criadas é de: " + Conta.contador);
		Conta.contador = 0;
	}

	// Construtor
	public Conta(Agencia agencia) {
		this();
		this.agencia = agencia;
	}

	// Construtor
	public Conta(int num) {
		this();
		this.num = num;
	}

	public void deposito(double valor) {

		this.saldo += valor;
	}

	public void saque(double valor) {
		saldo -= valor;
	}

	public double SaldoDisponivel() {
		return this.saldo + this.limite;
	}

	public String extrato() {
		String extrato = "";
		extrato += "AG. " + this.agencia.numero + '\n';
		extrato += "\nNumero CC" + this.num + '\n';
		extrato += "\nSaldo Disponível: R$ " + df.format(this.saldo) + '\n';
		extrato += "\nLimite Disponível: R$ " + df.format(this.limite) + '\n';
		return extrato;
	}

	public double consultarSaldoDisponivel() {
		return this.saldo + this.limite;
	}
}
