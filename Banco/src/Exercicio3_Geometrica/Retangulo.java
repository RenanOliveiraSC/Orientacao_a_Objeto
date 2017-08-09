package Exercicio3_Geometrica;

public class Retangulo extends Quadrilateros {

	public Retangulo(double base, double altura ) {
		super(base,base,altura,altura);
		
	}
	

	@Override
	public double area() {
		return getLado1() * getLado3();
	}

}
