package algoritmo26;

import java.util.Scanner;

public class Algoritmo26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int data, dia, mes, ano, novaData;

		System.out.println("Digite no formato DDMMAA: ");
		data = sc.nextInt();
		dia = data / 10000;
		mes = data % 10000 / 100;
		ano = data % 100;
		novaData = mes * 10000 + dia * 100 + ano;

		System.out.println("DIA: " + dia);
		System.out.println("MES: " + mes);
		System.out.println("ANO: " + ano);
		System.out.println();
		System.out.println("DATA NO FORMATO MMDDAA: " + novaData);

		sc.close();

	}

}
