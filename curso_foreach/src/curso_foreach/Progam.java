package curso_foreach;

public class Progam {

	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Maria", "bob", "Alex"};
 
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.err.println("--------------------");
		
		for(String nome: vetor) {
			System.out.println(nome);
		}
		
	}
}
