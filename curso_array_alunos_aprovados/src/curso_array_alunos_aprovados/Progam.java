package curso_array_alunos_aprovados;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Qunatas alunos serão digitados? ");
		int n = sc.nextInt();
		
		Aluno[] alunos = new Aluno[n];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			String nome = sc.next();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			alunos[i] = new Aluno(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i].media() >= 6.0) {
				System.out.println(alunos[i].getNome());
			}
		}
		
		sc.close();
	}
		
		
}


