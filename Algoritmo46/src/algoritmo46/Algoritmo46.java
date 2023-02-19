package algoritmo46;

import java.util.Scanner;

public class Algoritmo46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o saldo: ");
		double saldo = sc.nextDouble();

		double novoSaldo = saldo * 1.01;

		System.out.println("Novo saldo: " + novoSaldo);

		sc.close();

	}

}
