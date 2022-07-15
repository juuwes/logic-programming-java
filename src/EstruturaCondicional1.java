// Leitura de notas, calcular a média final e mostrar a mensagem correspondente

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaF;
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		notaF = nota1 + nota2;
		
		if (notaF >= 60.0) {
			System.out.println("NOTA FINAL = " + notaF);
		}
		else {
			System.out.println("NOTA FINAL = " + notaF + "\nREPROVADO");
		}
		
		sc.close();
		
	}

}