//Ler medidas de um retângulo e mostrar o valor da área, perímetro e diagonal do mesmo.

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura = sc.nextDouble();
		double base = sc.nextDouble();
		
		double area = base * altura;
		System.out.printf("AREA = %.4f%n", area);
		
		double perimetro = 2.0 * (base + altura);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();
			
	}

}