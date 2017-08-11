package Exercicio3_Folha;

public class TrabalhadorHora extends Empregado {

	private double hora;
	private double salarioHora;

	public TrabalhadorHora(String nome, String sobrenome, double hora, double salarioHora) {
		super(nome, sobrenome);
		this.hora = hora;
		this.salarioHora = salarioHora;

	}

	@Override
	public double calularGanho() {
		setSalario(hora * salarioHora);
		return getSalario();
	}

}
