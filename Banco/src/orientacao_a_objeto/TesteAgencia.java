package orientacao_a_objeto;

public class TesteAgencia {

	public static void main(String[] args) {
		Agencia agencia1 = new Agencia();
		agencia1.codigo = 01;
		Agencia agencia2 = new Agencia();

		agencia2.codigo = 85;
		System.out.println(agencia1.codigo);
		System.out.println(agencia2.codigo);
	}
}
