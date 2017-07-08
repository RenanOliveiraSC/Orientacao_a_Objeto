package orientacao_a_objeto;

import java.text.DecimalFormat;

public class Funcionario {
	DecimalFormat df = new DecimalFormat("#0.00");
	private String nome;
	private double salario;
	private double bnu;


	static double valeRefeicaoDiario = 15;
<<<<<<< HEAD
	static double bonificacao;

	public static void reajustaValeRefeicaoDiario(double taxa) {
		Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
		Funcionario.reajustaValeRefeicaoDiario(0.5);

=======
	
			
	public static void reajustaValeRefeicaoDiario (double taxa) {
		Funcionario.valeRefeicaoDiario = Funcionario.valeRefeicaoDiario * ((taxa/100)+1);
>>>>>>> branch 'master' of https://github.com/RenanOliveiraSC/Orientacao_a_Objeto.git
	}
<<<<<<< HEAD

	public void bonificacao(double bonus) {
		Funcionario.bonificacao = this.salario + Funcionario.bonificacao * ((bonus / 100) + 1);
=======
	
	public void bonificacao (double bonus) {
		this.bnu = bonus;
		this.salario = salario * ((10/100d)+1); 
>>>>>>> branch 'master' of https://github.com/RenanOliveiraSC/Orientacao_a_Objeto.git
	}
<<<<<<< HEAD

=======
	
	public void  bonificacao(){
		this.bonificacao(10);
	}
	
	
>>>>>>> branch 'master' of https://github.com/RenanOliveiraSC/Orientacao_a_Objeto.git
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Funcionario() {
		this.salario = 1000d;
	}

	public void aumentarSalario(double valor) {

		this.salario += valor;
	}

	public String consultardados() {
<<<<<<< HEAD
		return "Nome: " + this.nome + "\nSalário: R$ " + df.format(this.salario);

=======
		return "Nome: " + this.nome + "\nSalário: R$ " + df.format(this.salario) + "\nBonificação: R$ "+ df.format(this.bnu);
	}
	
	public String info() {
		String dados = "Nome Funcionario: " +this.nome+"\nSalário: R$ "+df.format(this.salario)+"\nBonificação: R$"+this.bnu;
		return dados;
	}
		
>>>>>>> branch 'master' of https://github.com/RenanOliveiraSC/Orientacao_a_Objeto.git
	}


