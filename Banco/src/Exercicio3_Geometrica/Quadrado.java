package Exercicio3_Geometrica;

public class Quadrado extends Quadrilateros {

	public Quadrado(double lado) {
		super(lado, lado, lado, lado);
		
	}


	@Override
	public double area() {
		return getLado1() * getLado1();
	}

}
