package collectionsJava;

public class ContaPoupanca  extends Conta{

	public double JurosAcrecimo;

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

	public double getJurosAcrecimo() {
		return JurosAcrecimo;
	}

	public void setJurosAcrecimo(double jurosAcrecimo) {
		JurosAcrecimo = jurosAcrecimo;
	}
	
}
