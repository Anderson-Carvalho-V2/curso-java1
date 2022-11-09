package application;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quntos quartos serão alugados? ");
		int n = sc.nextInt();
		
		Aluguel[] alugueis = new Aluguel[10];
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Cód #: " + i);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			alugueis[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		
		for (int i = 0; i < alugueis.length; i++) {
			if(alugueis[i] != null) {
				System.out.println(i + ": " + alugueis[i].toString());
			}
		}
		
		sc.close();
	}

}