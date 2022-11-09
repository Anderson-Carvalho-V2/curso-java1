package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Funcionario;

public class Progam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Qunatos funcinários você vai cadastrar? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("\nFuncionário #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(temId(funcionarios, id)) {
				System.out.print("Id já existe! Tente novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			funcionarios.add(funcionario);
		}
		
		System.out.println();
		System.out.print("Digite o Id do funcionario que receberá aumento salarial: ");
		int id = sc.nextInt();
	
		/*Integer posicao = posicaoId(funcionarios, id);
		
		if (posicao == null) {
			System.out.println("Esse id não existe!");
		}else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			funcionarios.get(posicao).aumentarSalario(porcentagem);
		}*/
		
		Funcionario func = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (func == null) {
			System.out.println("Esse id não existe!");
		}else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.aumentarSalario(porcentagem);
		}
				
		System.out.println("\nLista de funcionários: ");
		for(Funcionario funcionario: funcionarios) {
			System.out.println(funcionario.toString());
		}
		
		sc.close();
	}
	
		//Método para achar a posição do funcionario com id digitado (Sem usar funções lambda)
		public static Integer posicaoId(ArrayList<Funcionario> list, int id) {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == id) {
					return i;
				}
			}
			return null;
		}
		
		//Método para saber se o id digitado já existe na lista
		public static boolean temId (ArrayList<Funcionario> list, int id) {
			Funcionario funcId = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return funcId != null;
		}
}
