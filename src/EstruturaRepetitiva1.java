//calcular a idade média e se for entrado um valor negativo na primeira vez, mostrar a mensagem "impossivl calcular"

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int quant = 0;

		while (idade >= 0) {
			soma += idade;
			quant += 1;
			idade = sc.nextInt();
		}

		if (quant > 0) {
			double media = (double) soma / quant;
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("Impossivel calcular");
		}

		sc.close();
	}

}
