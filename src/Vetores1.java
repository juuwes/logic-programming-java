// Armazenar números em um vetor e mostrar na tela números negativos lidos

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int vet[] = new int[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] < 0) {
				System.out.print(vet[i]);
				vet[i] = sc.nextInt();
			}
		}

		sc.close();

	}
}
