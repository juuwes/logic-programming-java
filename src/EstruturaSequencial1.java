// O programa deve mostrar valor da área do terreno e preço do terreno.

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner (System.in);

		System.out.println("Digite a largura: ");
		double l = sc.nextDouble();
		
		System.out.println("Digite o comprimento: ");
		double c = sc.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado: ");
		double valorMetroQuadrado = sc.nextDouble();

		double area = l * c;
		System.out.printf("AREA = %.2f\n", area);
		
		double preco = valorMetroQuadrado * area;
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();

	}

}
