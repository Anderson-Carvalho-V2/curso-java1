package curso_array_mais_velho;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qunatas valores cada vetor terá? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoas[i] = new Pessoa(nome, idade);
		}
		
		int pMaisVelho = 0, maisVelho = 0;
		
		for (int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getIdade() > maisVelho) {
				maisVelho = pessoas[i].getIdade();
				pMaisVelho = i;
			}
		}
		
		System.out.println("\nPessoa mais velha: " + pessoas[pMaisVelho].getNome());
		
		sc.close();
	}

}
