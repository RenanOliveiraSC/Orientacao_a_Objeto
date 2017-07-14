package Polimorfismo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeraExtratos {

	private Date data;

	public void extrato(Conta numero) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/ yyyy HH:mm:ss");
		DecimalFormat df = new DecimalFormat("#0.00");

		Date agora = new Date();
		System.out.println("Cliente: " + numero.getCliente());
		System.out.println("Data: " + sdf.format(agora));
		System.out.println("Agência: " + numero.getAgencia());
		System.out.println("Conta: " + numero.getNumero());
		System.out.println("Saldo: R$ " + df.format(numero.getSaldo()));

	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
