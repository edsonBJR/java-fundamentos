package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira palavra: ");
		String a = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite a segunda palavra: ");
		String b = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite a terceira palavra: ");
		String c = entrada.nextLine().replace(",", ".");
		
		// Os últimos três salarios de um funcionario
		// Calcular a média dos últimos três salarios
		// Pode funcionar recebendo o salario com virgula ou com ponto nas casas decimais -> 8000,31 ou 8000.31
		
		double salarioA = Double.parseDouble(a);
		double salarioB = Double.parseDouble(b);
		double salarioC = Double.parseDouble(c);
		
		double mediaSalario = (salarioA + salarioB + salarioC) / 3;
		
		System.out.println("A média salarial é de: " + mediaSalario);
		
		entrada.close();
	}

}
