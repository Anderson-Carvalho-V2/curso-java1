import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//Chamando o médtodo max e guardando o retorno dentro de uma variavel.
		int maior = max(a, b, c);
		
		//Chamando o método mostrarResultado para mostrar uma msg na tela.
		mostrarResultado(maior);
		
		sc.close();
		
	}
	
	//Criando um método que retorna o mairo valor entre tres números.
	public static int max(int n1, int n2, int n3) {
		int maior;
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		}else if(n2 > n3) {
			maior = n2;
		}else {
			maior = n3;
		}
		return maior;
	}
	
	//Criando um método sem retorno que recebe um inteiro e mostra na tela que esse valor interiro é o maior valor.
	public static void mostrarResultado(int valor) {
		System.out.println("Maior " + valor);
	}
}