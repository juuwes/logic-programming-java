//Ler três números inteiros e mostrar o menos dentre os números lidos.

import java.util.Scanner;

public class EstruturaCondicional2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("MENOR = " + a);
		} else if (b < a && b < c) {
			System.out.println("MENOR = " + b);
		} else if (c < a && c < b) {
			System.out.println("MENOR = " + c);
		} else if (a == b && a == c) {
			System.out.println("MENOR = " + a);
		}

		sc.close();

	}

}
