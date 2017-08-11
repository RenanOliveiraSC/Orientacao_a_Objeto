package Exercicio3_Folha;

public class TrabalhadorComissionado extends Empregado {

	private double comissao;
	private double quantidade;

	public TrabalhadorComissionado(String nome, String sobrenome, double comissao, int quantidade) {
		super(nome, sobrenome);
		this.comissao = comissao;
		this.quantidade = quantidade;
	}

	@Override
	public double calularGanho() {
		return this.getSalario() + comissao * quantidade;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

}
