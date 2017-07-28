/**
 * Pacote respons�vel pelo armazenamento de informa��es sobre as contas.
 */
package Interfaces;
/**
 * 
 * @author Renan Oliveira
 *
 */
public abstract class Conta implements IConta {
/**
 * Agencia -> Armazena o n�mero da ag�ncia, tipo de campo Inteiro.
 */
	private int agencia;
/**
 * Conta -> Armazena o n�mero da conta, tipo de campo Inteiro.
 */
	private int conta;
/**
 * Limite -> Usado para armazenar o Limite da conta, tipo de campo double.
 * 	
 */
	private double limite;
/**
 * Cliente -> Usado para armazenar o nome do cliente, tipo de campo String.
 */
	private String cliente;
/**
 * Saldo -> Usado para armazenar o saldo da conta, tipo de campo double.	
 */
	private double saldo;

	public double getSaldo() {
		return saldo;
	}
/**
 * 
 * @param saldo -> Retorna o saldo.
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * 
 * @return agencia -> Retorna a ag�ncia.
 */
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
/**
 * 
 * @return Cliente -> Retorna o cliente
 */
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
/**
 * 
 * @return Limite -> Retorna o limite
 */
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
