package Exercicios;

public class Exercicio02 {
	private int valueA = 1900;
	private int valueB = 2000;

	public void execute() {
		System.out.println("Add -> " + (valueA + valueB));
		System.out.println("Sub -> " + (valueA - valueB));
		System.out.println("Mul -> " + (valueA * valueB));
		System.out.println("Div -> " + (valueA / valueB));
		System.out.println("===========================");

		int anoNascimento = 1983;
		int anoAtual = 2022;
		System.out.println(
				"Thiago Sant'anna - Nascido em: " + anoNascimento + 
				" com idade de " + (anoAtual - anoNascimento));
	}
}
