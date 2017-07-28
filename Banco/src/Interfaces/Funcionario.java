/**
 * Pacote respons�vel armazenar os atributos interface.
 */
package Interfaces;

import java.text.DecimalFormat;
/**
 * 
 * @author Renan Oliveira
 *
 */
public abstract class Funcionario implements Usuario {

	private DecimalFormat df = new DecimalFormat("#0.00");
/**
 * Atributos da classe Funcionario
 * usu�rio -> Armazena o valor do usu�rio para acesso ao sistema.
 * senha -> Armazena o valor da senha para acesso ao sistema.
 * nome -> Armazena o Nome do usu�rio para acesso ao sistema.
 * salario -> Armazena o valor do salario.
 * bonificacao -> Armazena o valor da Bonifica��o do usu�rio.
 * novoValorSalario -> Armazena o valor do Sal�rio (+) Bonifica��o.
 */
	private String usuario;
	private String senha;
	private String nome;
	private double salario;
	private double bonificacao;
	private double novoValorSalario;

/**
 * Construtor/ Return novoValorSalario para ser usado nas demais classes
 * 
 */
	public double getNovoValorSalario() {
		return novoValorSalario;
	}

	public void setNovoValorSalario(double novoValorSalario) {
		this.novoValorSalario = novoValorSalario;
	}
/**
 * valeRefeicaoDiario -> Armazena o valor do vale refeicao
 */
	public static double valeRefeicaoDiario = 30;

	public Funcionario() {
	}
/**
 * 
 * @param nome return nome do funcion�rio.
 * @param salario return salario do funcion�rio.
 */
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
/**
 * 
 * @return consultarDados return valor do sal�rio (+) bonifica��o
 */
	public String consultarDados() {
		return "Nome: " + this.nome + "\nSal�rio: R$" + df.format(this.salario) + "\nBonifica��o: R$"
				+ df.format(this.bonificacao);
	}
/**
 * 
 * @return nome return nome do funcion�rio
 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
/**
 * 
 * @return salario return sal�rio do funcion�rio
 */
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
/**
 * 
 * @return bonifica��o return valor da bonifica��o
 */
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
/**
 * 
 * @param taxa return valor do sal�rio * taxa para aumentarSalarioT.
 */
	public void aumentarSalarioT(double taxa) {
		this.salario = this.salario * ((taxa / 100) + 1);
	}
/**
 * 
 * @param valor retunr erro, n�o permite informar valor <= 0 em aumentarSalario
 */
	public void aumentarSalario(double valor) {
		this.novoValorSalario = valor;
		if (valor <= 0) {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		} else {
			this.salario += valor;
		}
	}

	public void bonificacao() {
		this.bonificacao = this.salario * (10d / 100);
		this.salario = this.salario * ((10d / 100) + 1);
	}

	@Override
	public String getUsuario() {
		return usuario;
	}

	@Override
	public String getSenha() {
		return senha;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}