package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Progam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Número da conta: ");
		int numeroConta = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Titular da conta: ");
		String titularConta = sc.nextLine();
		
		System.out.print("Deseja realizar depósito inicial (y/n)? ");
		char res = sc.next().charAt(0);
		
		if (res == 'y') {
			System.out.print("Depósito inicial: ");
			double depositoInical = sc.nextDouble();
			conta = new Conta(numeroConta, titularConta, depositoInical);
		}else {
			conta = new Conta(numeroConta, titularConta);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.print("Valor do depósito: ");
		double valor = sc.nextDouble();
		conta.depositar(valor);
		System.out.println("Dados atualizado:");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.print("Valor do sque: ");
		valor = sc.nextDouble();
		conta.sacar(valor);
		System.out.println("Dados atualizado:");
		System.out.println(conta.toString());
		
		
		sc.close();
	}

}
