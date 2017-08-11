package Exercicio3_Folha;

public class TrabalhadorPecaProduzida extends Empregado {

	private int pecaProduzida;
	private double valorPeca;

	public TrabalhadorPecaProduzida(String nome, String sobrenome, int pecaProduzida, double valorPeca) {
		super(nome, sobrenome);
		this.pecaProduzida = pecaProduzida;
		this.valorPeca = valorPeca;

	}

	@Override
	public double calularGanho() {
		setSalario(pecaProduzida * valorPeca);
		return getSalario();

	}

	public int getPecaProduzida() {
		return pecaProduzida;
	}

	public void setPecaProduzida(int pecaProduzida) {
		this.pecaProduzida = pecaProduzida;
	}

	public double getValorPeca() {
		return valorPeca;
	}

	public void setValorPeca(double valorPeca) {
		this.valorPeca = valorPeca;
	}

}
