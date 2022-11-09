package curso_matrizes;

import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
	
		int[][] matriz = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nDiagonal principal:");
		for(int i=0; i<n;i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		int count = 0;
		for(int i=0; i<matriz.length; i++) { //Acessando quatidade de linhas da matriz
			for(int j=0; j<matriz[i].length; j++) { //Acessando quatidade de colunas da matriz
				if(matriz[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println("\nNumeros negativos: " + count);
		
		sc.close();
	}
}
