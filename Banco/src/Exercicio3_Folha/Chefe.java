package Exercicio3_Folha;

public class Chefe extends Empregado {

	public Chefe(String nome, String sobrenome) {
		super(nome, sobrenome);

	}

	@Override
	public double calularGanho() {
		return this.getSalario();
	}
}
