package classesAbstratas;

public class ContaPoupanca extends Conta {

	private double taxaAdm;
	private double acrescimoJuros;
	
	 	
	
	public double getTaxaAdm() {
		return taxaAdm;
	}
	public void setTaxaAdm(double taxaAdm) {
		this.taxaAdm = taxaAdm;
	}
	public double getAcrescimoJuros() {
		return acrescimoJuros;
	}
	public void setAcrescimoJuros(double acrescimoJuros) {
		this.acrescimoJuros = acrescimoJuros;
	}
	
	
	
	@Override
	public void imprimeExtratoDetalhado() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
