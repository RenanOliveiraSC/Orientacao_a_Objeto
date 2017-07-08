package classesAbstratas;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class TesteConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setCliente("Renan");
		contaCorrente.setAgencia("080");
		contaCorrente.setNumero("161654");
		contaCorrente.setSaldo(15000d);
		contaCorrente.setLimite(50000D);
		
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaCorrente.setCliente("Ellen");
		contaCorrente.setAgencia("014");
		contaCorrente.setNumero("6516546");
		contaCorrente.setSaldo(10000d);
		contaCorrente.setLimite(20000d);
		
		
		
	}

}
