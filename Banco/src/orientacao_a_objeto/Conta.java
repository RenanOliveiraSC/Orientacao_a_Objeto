package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Conta {
	DecimalFormat df = new DecimalFormat("#0.00");

	int num;
	double saldo;
	double limite = 100d;
	Agencia agencia;

	// Construtor
	public Conta(Agencia agencia) {
		this.agencia = agencia;
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
