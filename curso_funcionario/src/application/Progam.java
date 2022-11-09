package application;

import java.util.Scanner;

import entities.Funcionario;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite os dados do funcionario: ");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + funcionario.toString());
		
		System.out.println();
		System.out.println("Digite qual percentual de aumento do salrio: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + funcionario.toString());
		
		sc.close();
	}

}
