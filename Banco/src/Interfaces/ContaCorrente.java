/**
 * Pacote responsável pelo armazenamento de informações sobre as contas do tipo Corrente.
 */
package Interfaces;
/**
 * 
 * @author Renan Oliveira
 *
 */
public class ContaCorrente extends Conta {
/**
 * TaxaJuros -> Responsável por receber o valor de "Taxa" sobre a qual irá icrementar
 */
	public double taxaJuros;
/**
 * Retorna o saldo.
 */
	@Override
	public double saldo() {
		return getSaldo();
	}
/**
 * Retorna o saldo (+) valor o informado de "deposita".
 */
	@Override
	public void deposita(double valor) {
		setSaldo(getSaldo()+ valor);
		
	}
/**
 * Retorna o saldo (-) valor o valor informado de "saca".
 */
	@Override
	public void saca(double valor) {
		setSaldo(getSaldo() - valor);
		
	}
/**
 * 
 * @return Taxa de justos
 */
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
}