package fundamentos;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // Aqui sempre será um resultado inteiro, o java Trunca o valor
		System.out.println(a / (double) b); // Aqui estamos fazendo um CAST para que o resultado seja um double com casas decimais
		System.out.println(a / (float) b); // Aqui estamos fazendo um CAST para float assim vamos ter uma precisão menor de casas decimais
		
		// Operador de Modulo -> o resto da divisão
		System.out.println(8 % 3); // O resto da divisão entre 8 e 3 é dois
		System.out.println(a % b); // O resto da divisão entre 8 e 3 é dois
		
		// Aqui vamos ter o resultado levando em consideração a precedência das operações
		System.out.println(x + y - a * b);
	}

}
