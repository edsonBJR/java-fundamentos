package teste;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EstruturaDeDados {

	public static void main(String[] args) {

		arrayTestes();	
		listaEncadeadaTestes();
		pilhaTestes();
		setTestes();
		hashMapTestes();

	}

	private static void hashMapTestes() {
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		String palavra = "Estrutura de Dados Java";

		for (char c : palavra.toCharArray()) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		
		String collect = charCountMap.entrySet().stream().filter(Predicate.not(entry -> entry.getKey().equals(' ')))
		.map(entry -> entry.getKey() + ": " + entry.getValue())
		.collect(Collectors.joining(", "));
		
		System.out.println(collect);
	}

	private static void setTestes() {
		HashSet<String> conjuntoFrutas = new HashSet<>(List.of("Maca", "Uva", "Banana", "Banana"));
		conjuntoFrutas.add("Abacaxi");
		conjuntoFrutas.add("Abacaxi");

		String collect = String.join(", ", conjuntoFrutas);
		System.out.println("Todas as frutas -> " + collect);
	}

	private static void pilhaTestes() {
		Stack<String> history = new Stack<>();
		history.push("Algoritmos");
		history.push("Estrutura de Dados");
		history.push("Java");
		System.out.println("Topo : " + history.peek());
		System.out.println(history.contains("Jav"));

		String collect = String.join(", ", history);
		System.out.println("Todos -> " + collect);
	}

	private static void listaEncadeadaTestes() {
		LinkedList<String> frutas = new LinkedList<>(List.of("maca", "mamao", "banana"));
		frutas.push("Laranja");
		System.out.println(frutas);

		String removido = frutas.poll();
		System.out.println(removido);
		System.out.println(frutas);

		String collect = frutas.stream().sorted().collect(Collectors.joining(", "));
		System.out.println(collect);
	}

	private static void arrayTestes() {
		int[] arrayDeInteiros = new int[5];
		int[] numeros = { 5, 1, 3, 4, 2 };

		System.out.println(numeros.length);
		System.out.println(numeros[0]);

		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
	}

}
