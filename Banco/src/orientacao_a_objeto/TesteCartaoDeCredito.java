package orientacao_a_objeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartaoDeCredito {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Cartao_de_Credito cartao1 = new Cartao_de_Credito();
		cartao1.numero = 778778890;
		cartao1.data = sdf.parse("01/04/2020");

		Cartao_de_Credito cartao2 = new Cartao_de_Credito();
		cartao2.numero = 887887790;
		cartao2.data = sdf.parse("02/05/25");

		System.out.println("Cartão 1 "+cartao1.numero + " "+"Com Validade até: " + sdf.format(cartao1.data));
		System.out.println("Cartão 2 "+cartao2.numero + " "+"Com Validade até: " + sdf.format(cartao2.data));

	}
}
