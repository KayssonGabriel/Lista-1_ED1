package algoritmo40;

import java.util.Scanner;

public class Algoritmo40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double quociente, resto;

		System.out.println("Entre com dividendo: ");
		int dividendo = sc.nextInt();
		System.out.println("Entre com o divisor: ");
		int divisor = sc.nextInt();

		quociente = dividendo / divisor;
		resto = dividendo % divisor;

		System.out.println("Dividendo: " + dividendo);
		System.out.println("Divisor: " + divisor);
		System.out.println("Quociente: " + quociente);
		System.out.println("Resto: " + resto);

		sc.close();

	}

}
