package orientacao_a_objeto;

public class Funcionario {
	String nome;
	double salario;

	public void pgto(double pgto) {
		salario += pgto;
	}

	public String detalhes() {
		String detalhes = "";
		detalhes += "Nome: " + nome + '\n';
		detalhes += "Salário = R$ " + salario + '\n';
		return detalhes;
	}

}
