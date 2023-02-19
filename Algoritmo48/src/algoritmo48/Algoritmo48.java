package algoritmo48;

import java.util.Scanner;

public class Algoritmo48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioMinimo, quantidadeKw, preco, valorPago, valorDesconto;

		System.out.println("Entre com o salário mínimo: ");
		salarioMinimo = sc.nextDouble();
		System.out.println("Entre com a quantidade em quilowatt:");
		quantidadeKw = sc.nextDouble();

		preco = salarioMinimo / 700;
		valorPago = preco * quantidadeKw;
		valorDesconto = valorPago * 0.9;

		System.out.printf("Preço do quilowatt: " + preco + "\nValor a ser pago: " + valorPago + "\nValor com desconto: "
				+ valorDesconto);

		sc.close();

	}

}
