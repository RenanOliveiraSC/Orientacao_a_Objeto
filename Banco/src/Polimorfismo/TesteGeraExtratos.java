package Polimorfismo;

public class TesteGeraExtratos {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setCliente("Maria");
		contaCorrente.setAgencia("080");
		contaCorrente.setNumero("15646476");
		contaCorrente.setSaldo(5000d);
		contaCorrente.setLimite(1000d);
		contaCorrente.setTaxaJuros(8d);

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setCliente("Wagner");
		contaPoupanca.setAgencia("080");
		contaPoupanca.setNumero("15646476");
		contaPoupanca.setSaldo(5000d);
		contaPoupanca.setSaldo(1200d);
		contaPoupanca.setTaxaAdm(10d);

		GeraExtratos extratoD = new GeraExtratos();
		extratoD.extrato(contaCorrente);
		extratoD.extrato(contaPoupanca);

	}
}
