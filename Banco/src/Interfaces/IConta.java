/**
 * Pacote responsável pelo armazenamento da interface Conta.
 */
package Interfaces;
/**
 * 
 * @author Renan Oliveira
 *
 */
public interface IConta {
/**
 * 
 * @return saldo -> Retorna o saldo da conta.
 */
	public abstract double saldo();
/**
 * 
 * @param valor -> Usado para informar o valor à ser depositado
 */
	public abstract void deposita(double valor);
/**
 * 	
 * @param valor -> Usado para informar o valor à ser sacado.
 */
	public abstract void saca(double valor);
/**
 * 	
 */
}
