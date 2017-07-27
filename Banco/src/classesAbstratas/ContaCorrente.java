package classesAbstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private double taxaJuros;
	private double limite;
	
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
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
