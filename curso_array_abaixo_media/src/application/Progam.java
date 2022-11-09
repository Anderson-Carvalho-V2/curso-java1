package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qunatas valores cada vetor terá? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma =0, media =0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		
		media = soma / n;
		
		System.out.printf("\nMedia do vetor = %.3f%n", media);
		System.out.println("Elementos abaixo da média:");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f%n", vetor[i]);
			}
		}
		
		sc.close();
	}

}
