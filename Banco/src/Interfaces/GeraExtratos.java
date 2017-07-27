package Interfaces;

import java.text.DecimalFormat;

public class GeraExtratos {

	public void extrato(IConta numero) {
		DecimalFormat df = new DecimalFormat("#0.00");

		System.out.println("Saldo: R$ " + df.format(numero.saldo()));

	}
}
