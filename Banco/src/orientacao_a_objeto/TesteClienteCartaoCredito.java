package orientacao_a_objeto;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class TesteClienteCartaoCredito {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		// Criando um objeto de cada classe
		Cartao_de_Credito cartao = new Cartao_de_Credito();
		Cliente cliente = new Cliente();

		// Ligando os objetos
		cartao.cliente = cliente;

		// Acessando o nome do cliente
		cartao.cliente.nome = "Rafael Cosentino";

		cartao.numero = 1;
		cartao.cliente.nome = "João";
		cartao.data = sdf.parse("01/01/2020");

		System.out.println(cartao.cliente.nome);
	}

}
