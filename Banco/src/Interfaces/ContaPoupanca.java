/**
 * Pacote respons�vel pelo armazenamento de informa��es sobre as contas do tipo Poupan�a.
 */
package Interfaces;
/**
 * 
 * @author Renan Oliveira
 *
 */
public class ContaPoupanca  extends Conta{
/**
 * JurosAcrecimo -> Valor de acr�scimo sobre o saldo. 
 */
	public double JurosAcrecimo;

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
 *  Retorna o saldo (-) valor o valor informado de "saca".
 */
	@Override
	public void saca(double valor) {
		setSaldo(getSaldo() - valor);
		
	}
/**
 * 
 * Retorna o valor do Juros de Acrescimo
 */
	public double getJurosAcrecimo() {
		return JurosAcrecimo;
	}

	public void setJurosAcrecimo(double jurosAcrecimo) {
		JurosAcrecimo = jurosAcrecimo;
	}
	
}
