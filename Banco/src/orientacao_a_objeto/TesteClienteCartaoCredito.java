package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClienteCartaoCredito {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyyy");
		// Criando um objeto de cada classe

		Cliente cliente = new Cliente();
		cliente.codigo = 1;
		cliente.nome = "Jo�o";

		Cartao_de_Credito cartao = new Cartao_de_Credito(123456);
		cartao.data = sdf.parse("01/01/2015");

		// vincular o cliente ao cart�o de cr�dito
		cartao.cliente = cliente;

		System.out.println("O cliente " + cartao.cliente.nome + " com c�digo " + cartao.cliente.codigo
				+ " possui o cart�o de cr�dito " + cartao.numero + " com validade at� " + sdf.format(cartao.data));
	}

}
