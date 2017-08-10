package Exercicio3_Geometrica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteGeometria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int forma;

		List<Interface> formasGeometricas = new ArrayList<>();

		System.out.println("Quantas formas ele deseja criar?");
		forma = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < forma; i++) {
			System.out.println("Qual forma você deseja criar: 1 Quadrado, 2 Retanguolo ou 3 Circulo");
			int figura = Integer.parseInt(scanner.nextLine());

			if (figura == 1) {
				System.out.println("informe o lado do Quadrado");
				double lado = Double.parseDouble(scanner.nextLine());
				Quadrado quadrado1 = new Quadrado(lado);
				formasGeometricas.add(quadrado1);

			} else if (figura == 2) {
				System.out.println("informe a base");
				double base = Double.parseDouble(scanner.nextLine());
				System.out.println("Informe a altura");
				double altura = Double.parseDouble(scanner.nextLine());
				Retangulo retangulo1 = new Retangulo(base, altura);
				formasGeometricas.add(retangulo1);

			} else if (figura == 3) {
				System.out.println("Informe o raio");
				double raio = Double.parseDouble(scanner.nextLine());
				Circulo circulo1 = new Circulo(raio);
				formasGeometricas.add(circulo1);
			}

		}
		for (Interface interface1 : formasGeometricas) {
			System.out.println("O perimetro é: " + interface1.perimetro());
			System.out.println("A área é: " + interface1.area());
		}
	}
}
