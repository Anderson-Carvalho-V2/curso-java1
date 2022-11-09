package application;

import java.util.Scanner;
import entities.Triangle;

public class Progam {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		//Criando a variavel do tipo triangle
		Triangle x, y;
		//Instanciando os objetos do tipo triangule
		x = new Triangle();
		y = new Triangle();
		
		//Armazendo valores dentro dos atributos(dados) dos objetos do tipo triangulo
		System.out.println("Digite as areas do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as areas do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
			
		double areaX = x.area();
		double areaY = y.area();
	
		System.out.printf("Area do tringulo X: %.4f%n", areaX);
		System.out.printf("Area do tringulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area: X");
		}else {
			System.out.println("Maior area: Y");
		}
		
		sc.close();
	}

}
