package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	
	public double calcMedia() {
		this.notaFinal = nota1 + nota2 + nota3;
		return nota1 + nota2 + nota3;
	}
	
	public String status() {
		if(this.notaFinal > 60) {
			return "Passou";
		}else {
			return "Reprovou"
				+ String.format("%n")
				+ String.format("Faltam %.2f pontos para passsar",(60 - this.notaFinal));
		}		
	}
	
	public String toString() {
		return String.format("%n")
			+ String.format("Nota final: %.2f%n", calcMedia())
			+ status();
	}
	
}
