package algoritmo42;

import java.util.Scanner;

public class Algoritmo42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um angulo em graus: ");
		double angulo = sc.nextDouble();

		double rang = angulo * Math.PI / 180;

		System.out.println("Seno: " + Math.sin(rang));
		System.out.println("Co-seno: " + Math.cos(rang));
		System.out.println("Tangente: " + Math.tan(rang));
		System.out.println("Co-secante: " + (1 / Math.sin(rang)));
		System.out.println("Secante: " + (1 / Math.cos(rang)));
		System.out.println("Cotangente: " + (1 / Math.tan(rang)));

		sc.close();
	}

}
