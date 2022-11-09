package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qunatas pessoas serão cadastradas? ");
		int n = sc.nextInt();
		
		int[] vetor = new int [n];

		for(int i = 0; i < n; i++) {
			System.out.print("Digire um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		int pMaior =0, maior = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				pMaior = i;
			}
		}
		
		System.out.printf("\nMaior valor = %d%n", maior);
		System.out.printf("Maior valor = %d%n", pMaior);
		
		sc.close();
	}

}
