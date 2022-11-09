package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qunatas pessoas serão cadastradas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + " Pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		int menores = 0;
		double soma = 0;
		
		for(int i = 0; i < n; i++) {
			soma = soma + alturas[i];
			if(idades[i] < 16) {
				menores = menores + 1;
			}
		}
		
		double media = soma / n;
		double percentualMenores = menores * 100.0 / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores);
		
		for (int i = 0; i < n; i++) {
			if(idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
