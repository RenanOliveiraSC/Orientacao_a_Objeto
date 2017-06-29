package orientacao_a_objeto;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {

		Cartao_de_Credito cartao1 = new Cartao_de_Credito();
		cartao1.numero = 778778890;
		cartao1.data = "04/20";

		Cartao_de_Credito cartao2 = new Cartao_de_Credito();
		cartao2.numero = 887887790;
		cartao2.data = "05/25";

		System.out.println(cartao1.numero + " " + cartao1.data);
		System.out.println(cartao2.numero + " " + cartao2.data);

	}
}
