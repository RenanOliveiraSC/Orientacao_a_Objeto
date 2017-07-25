package Interfaces;

import java.text.DecimalFormat;

public class Funcionario {

	private DecimalFormat df = new DecimalFormat("#0.00");
	
	private String usuario;
	private String senha;
	
	private String nome;
	private double salario;
	private double bonificacao;
	
	public static double valeRefeicaoDiario= 30;
	
	public Funcionario(){
	}
}
