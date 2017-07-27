package classesAbstratas;

import java.util.Date;

public abstract class Conta {

	private String numero;
	private String agencia;
	private String cliente;
	private double saldo;
	private Date diaDoAniversario;

	//Construtor
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	
	public Date getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(Date diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}

	public abstract void imprimeExtratoDetalhado();
		
}
