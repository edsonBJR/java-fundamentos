package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		// Resultado de uma expressão elevado a qualquer potencia
		
		int a = 2 + 3 * 4;
		int b = (int) Math.pow(a, 99);
		double c = Math.pow(a, 100);
		
//		System.out.println(b);
//		System.out.println(c);
		
		// Desafio
		/*
		 * (([6 *(3 + 2)]^2) / (3 * 2) - ((1 - 5) * (2 - 7) / 2)^2)^3 / 10^3
		 * 
		 * O resultado final é 125
		 */
		
		int numA = 6 * (3 + 2);
		int numB = (int) Math.pow(numA, 2);
		int numC = 3 * 2;
		int resultadoA = numB / numC;
		System.out.println(resultadoA);
		
		int numD = (1 - 5) * (2 - 7);
		int numE = numD / 2;
		int resultadoB = (int) Math.pow(numE, 2);
		System.out.println(resultadoB);
		
		int resultadoC = (int) Math.pow(resultadoA - resultadoB, 3) ;
		int resultadoD = (int) Math.pow(10, 3);
		
		int resultadoFinal = resultadoC / resultadoD;
		
		System.out.println(resultadoFinal);
		
	}
}
