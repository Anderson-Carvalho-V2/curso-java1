package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qunatas valores cada vetor terá? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		double soma = 0, qtdPares= 0, mediaPares = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				soma = soma + vetor[i];	
				qtdPares = qtdPares +1;
			}
		}
		
		
		if (qtdPares == 0) {
			System.out.println("\nNenhum valor par");
		}else {
			mediaPares = soma / qtdPares;
			System.out.printf("\nMedia dos vetor = %.1f%n", mediaPares);			
		}
		
		sc.close();
	}

}
