package application;

import java.util.Scanner;
import entities.Triangulo;;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Digite a altura e a altura do triangulo: ");
		triangulo.altura = sc.nextDouble();
		triangulo.largura = sc.nextDouble();

		System.out.println(triangulo.toString());
		
		sc.close();
	}

}
