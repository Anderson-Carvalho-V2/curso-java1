package curso_array_aprovados;

public class Aluno {
	public String nomeAluno;
	private double nota1;
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nomeAluno = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double media() {
		return (this.nota1 + this.nota2) / 2;
	}

	public String getNome() {
		return this.nomeAluno;
	}

	public void setNome(String nome) {
		this.nomeAluno = nome;
	}

	public double getNota1() {
		return this.nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return this.nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public String toString() {
		return nomeAluno;
	}
	
	
	
	
}
