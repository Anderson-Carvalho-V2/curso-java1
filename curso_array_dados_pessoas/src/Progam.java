import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qunatas pessoas serão cadastradas? ");
		int n = sc.nextInt();
		
		char[] sexos = new char[n];
		double[] alturas = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa", i+1);
			System.out.print("\nAltura: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Sexo: ");
			sexos[i] = sc.next().charAt(0);
		}
		
		double mulheres = 0, homens = 0, mediaMulheres = 0, somaMulheres = 0;
		double menor = alturas[0], maior = alturas[0];
		
		for (int i = 0; i < n; i++) {
			if (alturas[i] > maior) {
				maior = alturas[i];
			}
			
			if (alturas[i] < menor) {
				menor = alturas[i];
			}
			
			if (sexos[i] == 'f') {
				somaMulheres = somaMulheres + alturas[i];
				mulheres ++;
			}else {
				homens ++;
			}
		}
		
		mediaMulheres = somaMulheres / mulheres;
		
		System.out.printf("\nMenor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Média das altura das mulheres = %.2f%n", mediaMulheres);
		System.out.printf("Número de homens = %.0f%n", homens);
		
		sc.close();
	}

}
