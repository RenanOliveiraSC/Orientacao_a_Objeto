package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TesteArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int soma = 0;
		int media;
		int max = 0;

		for (int i = 0; i < numeros.length; i++)
			soma = soma + numeros[i];
		media = soma / numeros.length;

		for (int m = 1; m < numeros.length; m++)
			if (numeros[m] > max) {
				max = numeros[m];
			}

		Arrays.sort(numeros);
		for (int numero : numeros) {
			System.out.println(numero);
		}
		scanner.close();
		System.out.print("\nA média é:" + media);
		scanner.close();

		System.out.println("\nO maior número é o " + max);
	}
}