package Interfaces;

public interface IConta {

	public abstract double saldo();

	public abstract void deposita(double valor);
	
	public abstract void saca(double valor);
}
