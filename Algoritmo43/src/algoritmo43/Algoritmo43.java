package algoritmo43;

import java.util.Scanner;

public class Algoritmo43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o logaritmando: ");
		double numero = sc.nextDouble();

		double logaritmo = Math.log(numero) / Math.log(10);

		System.out.println("Logaritmo: " + logaritmo);

		sc.close();

	}

}
