package orientacao_a_objeto;

public class TesteAgencia {

	public static void main(String[] args) {
		Agencia agencia1 = new Agencia();
		agencia1.numero = 01;
		Agencia agencia2 = new Agencia();

		agencia2.numero = 85;
		System.out.println("Ag�ncia: "+agencia1.numero);
		System.out.println("Ag�ncia: "+agencia2.numero);
	}
}
