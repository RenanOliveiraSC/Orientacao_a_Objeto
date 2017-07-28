package CompanhiaAeria;
/**
 * 
 * @author Renan Oliveira
 *
 */
abstract class Aviao {
	
	private final int lugares;
	private final double valorPassagem;
	
	public Aviao(int lugares, double valorPassagem) {
		this.lugares = lugares;
		this.valorPassagem = valorPassagem;
	}

	public int getLugares() {
		return lugares;
	}

	public double getValorPassagem() {
		return valorPassagem;
	}

	
}
