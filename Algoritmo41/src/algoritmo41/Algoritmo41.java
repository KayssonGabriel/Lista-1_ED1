package algoritmo41;

import java.util.Scanner;

public class Algoritmo41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com 1 número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Entre com 2 número: ");
		double numero2 = sc.nextDouble();
		System.out.println("Entre com 3 número: ");
		double numero3 = sc.nextDouble();
		System.out.println("Entre com 4 número: ");
		double numero4 = sc.nextDouble();

		double mediaPonderada = (numero1 * 1 + numero2 * 2 + numero3 * 3 + numero4 * 4) / 10;

		System.out.println("Média ponderada: " + mediaPonderada);

		sc.close();

	}

}
