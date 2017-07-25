package Interfaces;

public class TesteGeraExtratos {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setCliente("Maria");
		contaCorrente.setAgencia(80);
		contaCorrente.setConta(15646476);
		contaCorrente.deposita(50d);
		contaCorrente.setLimite(5000d);
		contaCorrente.saldo();
		contaCorrente.setLimite(1000d);
		contaCorrente.setTaxaJuros(8d);
		

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setCliente("Wagner");
		contaPoupanca.setAgencia(45);
		contaPoupanca.deposita(1000d);
		contaPoupanca.setConta(156489734);
		contaPoupanca.setLimite(4000d);
		contaPoupanca.saldo();
		contaPoupanca.setLimite(500d);
		contaPoupanca.setJurosAcrecimo(0.1);
		
		//Operações de Débito e Credito
		contaCorrente.deposita(300d);
		contaCorrente.saca(50d);
		contaPoupanca.deposita(50d);
		
		

		GeraExtratos extratoC = new GeraExtratos();
		extratoC.extrato(contaCorrente);
	
		GeraExtratos extratoP = new GeraExtratos();
		extratoP.extrato(contaPoupanca);
	}
}
