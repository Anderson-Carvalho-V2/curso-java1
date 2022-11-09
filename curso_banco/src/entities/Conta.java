package entities;

public class Conta {
	private int numeroConta;
	private String titularConta;
	private double saldo;
	
	//Construtor-------------------------
	public Conta (int numeroConta, String titularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.depositar(depositoInicial);
	}
	
	//Construtor2-------------------------
	public Conta (int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}

	//Métodos de get e set-------------------------
	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	//Métodos adicionais---------------------------
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor + 5;
	}
	
	public String toString() {
		return "Conta: "
			+ numeroConta
			+ ", Titular: "
			+ titularConta
			+ ", Saldo: R$"
			+ String.format("%.2f", saldo);
	}
	
	
	
}
