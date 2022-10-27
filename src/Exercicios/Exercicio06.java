package Exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void execute() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Informe um nome:");
			String nome = scanner.nextLine();
			System.out.println("Informe a idade:");
			String idade = scanner.nextLine();
			System.out.println("Informe o CPF: ___.___.___-__");
			String cpf = scanner.nextLine();
			System.out.println("Informe o genero (M/F):");
			String genero = scanner.nextLine();
			System.out.println("Informe o e-mail: _______@_______");
			String emailCompleto = scanner.nextLine();
			System.out.println("Informe o telefone: _____-___");
			String telefone = scanner.nextLine();
			System.out.println("Informe o nome da rua:");
			String rua = scanner.nextLine();
			System.out.println("Informe o número:");
			String numero = scanner.nextLine();
			System.out.println("Informe o bairro:");
			String bairro = scanner.nextLine();
			System.out.println("Informe a cidade:");
			String cidade = scanner.nextLine();
			
			System.out.println("################## Formulário Moderna #################");
			System.out.println("Nome: "+nome+" Idade: " + idade);
			System.out.println("CPF: "+cpf+" Genero: " + genero);
			System.out.println("Email: "+emailCompleto+ " Tel: " + telefone);
			System.out.println("------------------------ Endereço --------------------");
			System.out.println("Nº "+numero+" Rua: " + rua);
			System.out.println("Bairro: "+bairro+" Cidade: " + cidade);
			System.out.println("#####################################################");
		} finally {
			scanner.close();
		}
	}
}
