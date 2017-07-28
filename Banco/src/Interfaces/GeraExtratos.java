/**
 * Pacote responsável por gerar as informações contidas no Extrato.
 */
package Interfaces;

import java.text.DecimalFormat;
/**
 * @author Renan Oliveira
 */

public class GeraExtratos {
/**
 * 
 * @param numero -> Retorna o saldo da conta específica.
 */
	public void extrato(IConta numero) {
		DecimalFormat df = new DecimalFormat("#0.00");

		System.out.println("Saldo: R$ " + df.format(numero.saldo()));

	}
}
