package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Byte b = 100; // Tipo primitivo byte
		Short s = 1000; // Tipo primitivo short
		Integer i = 10000; // Tipo primitivo int
		Integer parseInt = Integer.parseInt("10000");
		Long l = 10000000L; // Tipo primitivo long, necessário colocar o caracter L no final do número
		
		// A partir de agora temos métodos associados ao objetos instânciados
		System.out.println(b.byteValue()); // O valor do byte primitivo que está dentro dessa classe
		System.out.println(s.byteValue());
		System.out.println(i.byteValue());
		System.out.println(l.byteValue());
		System.out.println(parseInt.getClass());
		System.out.println(l / 3);
		System.out.println(l / 3.00);
		
		Float f = 123.10F; // Necessário colocar o F na final do valor porque ele nao consegue converter int ou double pra Float
		System.out.println(f);
		
		Double d = 1234.4567;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // Convertemos uma String para Boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Convertemos um valor Boolean para String
		
		Character c = '#';
		System.out.println(c + "...");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		Integer valorDigitado = Integer.parseInt(entrada.next());
		System.out.println(valorDigitado * 3);
		entrada.close();
		
	}
}
