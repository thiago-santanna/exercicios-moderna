package Exercicios;

public class Exercicio02 {
	private static int valueA = 1900;
	private static int valueB = 2000;

	public static void execute() {
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
