package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void execute() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Qual nome de sua Mãe? ");
			String nomeMae = scanner.nextLine();
			System.out.println("Qual a idade dela?");
			String idadeMae = scanner.nextLine();
			
			System.out.println("Qual nome de seu Pai? ");
			String nomePai = scanner.nextLine();
			System.out.println("Qual a idade dele?");
			String idadePai = scanner.nextLine();
			
			System.out.println("Filiação");
			System.out.println("Mãe: " + nomeMae + " - Idade: " + idadeMae);
			System.out.println("Pai: " + nomePai + " - Idade: " + idadePai);
		} finally {
			scanner.close();
		}
	}
}
