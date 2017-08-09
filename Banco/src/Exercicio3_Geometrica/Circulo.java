package Exercicio3_Geometrica;

public class Circulo implements Interface {

	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
		
	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}



	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public double area() {
		return 0;
	}

	
}
