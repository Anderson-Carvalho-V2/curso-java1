package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números vc vai digitar?");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0, media =0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}		
			
		System.out.println();
		System.out.print("Valores = ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			soma += vetor[i];
		}
		media = soma / vetor.length;

		System.out.println();
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Media = %.2f%n", media);
		
		sc.close();
	}

}
