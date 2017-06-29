package orientacao_a_objeto;

public class TesteAgenciaConta {

	public static void main(String[] args) {
		
		Conta co = new Conta();
		Agencia agc = new Agencia();
		
		co.agencia = agc;
		
		co.agencia.numero = 01;
		
		System.out.println(co.agencia.numero);
	}
}
