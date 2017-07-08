package Polimorfismo;

public class TesteControleDePonto {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Renan");
		
		Telefonista telefonista = new Telefonista();
		telefonista.setNome("Carol");
		
		ControleDePonto controleDePonto = new ControleDePonto();
		controleDePonto.registraEntrada(gerente);
		controleDePonto.registraSaida(gerente);
		
		controleDePonto.registraEntrada(telefonista);
		controleDePonto.registraSaida(telefonista);
		
		
		
		
	}
}
