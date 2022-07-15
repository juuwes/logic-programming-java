// Mostrar os nomes e a idade média entre duas pessoas.

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		double media = (double) (idade1 + idade2) / 2.0;
		System.out.printf("A idade média de %s e %s é de %.1f anos.%n", nome1, nome2, media);
		
		sc.close();

	}

}