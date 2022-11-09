package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qunatas pessoas serão cadastradas? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNumeros pares:");
		int nPares = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				nPares = nPares +1;
			}
		}
		
		System.out.printf("\n\nQuantitade de números pares = %d%n", nPares);
		
		sc.close();
	}

}
