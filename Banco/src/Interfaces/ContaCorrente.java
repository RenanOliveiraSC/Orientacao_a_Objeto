package Interfaces;

public class ContaCorrente extends Conta {

	public double taxaJuros;

	@Override
	public double saldo() {
		return getSaldo();
	}

	@Override
	public void deposita(double valor) {
		setSaldo(getSaldo()+ valor);
		
		
	}

	@Override
	public void saca(double valor) {
		setSaldo(getSaldo() - valor);
		
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
}