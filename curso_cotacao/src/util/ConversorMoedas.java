package util;

public class ConversorMoedas {

	public static final double IOF = 0.06;
	
	public static double converterDolar(double valorDollar, double Qtddollar) {
		return (valorDollar * Qtddollar) - IOF;
	}
	
}
