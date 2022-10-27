package Exercicios;

public class Exercicio04 {
	public static void execute() {
		String nome, emailp1, emailp2, senha;
		int cpfp1, cpfp2, cpfp3, cpfp4;
		
		nome = "Thiago Sant'Anna";
		emailp1 = "tss.webapps";
		emailp2 = "gmail.com";
		senha = "1020@TRS";
		
		cpfp1 = 044;
		cpfp2 = 906;
		cpfp3 = 274;
		cpfp4 = 8;
		
		System.out.println("######### USUÁRIO #########");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: "+cpfp1+"."+cpfp2+"."+cpfp3+"-"+cpfp4);
		System.out.println("Email: " + emailp1+"@"+emailp2);
		System.out.println("Senha: " + senha.replaceAll("[@#$%&*A-Za-z0-9]", "*"));
		System.out.println("###########################");	

	}
}
