package entities;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public void aumentarSalario(double porcentagem) {
		this.salario = getSalario() + (getSalario() * porcentagem / 100);
	}
	
	
	public Double getSalario() {
		return salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("R$ %.2f", salario);
	}
}
