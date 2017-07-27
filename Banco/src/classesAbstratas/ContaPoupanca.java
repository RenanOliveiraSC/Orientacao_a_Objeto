package classesAbstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
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
		System.out.println("EXTRATO DETALHADO DE CONTA CORRENTE");
		Date agora = new Date();
		System.out.println("DATA : " + sdf.format(agora));
		System.out.println("SALDO : " + this.getSaldo());
		System.out.println("ANIVERSÁRIO : " + this.getDiaDoAniversario());
		
	}
	
	
	
	
	
	
	
}
