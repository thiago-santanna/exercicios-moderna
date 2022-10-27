package Exercicios;

public class Exercicio03 {

	public static void execute() {
		/* Primeira parte */
		long variavelUm = 10;
		long variavelDois = 15;

		long moduloVariaveis = variavelUm % variavelDois;
		System.out.println("O módulo das duas variáveis é: " + moduloVariaveis);

		/* Segunda parte */
		@SuppressWarnings("unused")
		String result = ((123 * 344) + 2344) >= (8799) != false 
				? "Moderna " + "Tecnologia" 
				: "Tá saindo !!!";
		
		System.out.println(result);
	}

}
