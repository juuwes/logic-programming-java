//Utilizar valores das vari�veis e produzir a sa�da na tela

import java.util.Locale;
public class SaidaDados {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 18;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:\n%s, wich price is $ %.2f%n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f\n", product2, price2);
		
		System.out.println("\nRecord: " + age + " years old, code " + code + " and gender: " + gender);
		
		System.out.printf("\nMeasue with eight decimal places: %.8f\n", measure);
		System.out.printf("Rouded (three decimal places): %.3f\n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);		
		
	}

}