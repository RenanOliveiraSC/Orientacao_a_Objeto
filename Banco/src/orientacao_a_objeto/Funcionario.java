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
		detalhes += "Sal�rio = R$ " + salario + '\n';
		return detalhes;
	}

}
