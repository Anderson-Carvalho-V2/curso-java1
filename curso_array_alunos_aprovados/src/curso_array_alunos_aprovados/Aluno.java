package curso_array_alunos_aprovados;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;


	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return this.nome;
	}

	public double media() {
		return (this.nota1 + this.nota2) / 2;
	}
	

	
	
}
