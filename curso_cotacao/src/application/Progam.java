package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoedas;

public class Progam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do Dollar? ");
		double dollar = sc.nextDouble();
		
		System.out.print("Quantos dolares serão comprados? ");
		double quantidade = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reias = %.2f", ConversorMoedas.converterDolar(dollar, quantidade));
	
		sc.close();
	}

}
