package hackerrank;

import java.util.Scanner;

public class PrintHashTag {

	public static void main(String[] args) {

		caractereFinalLinha();
//		arvoreNatal();
//		hashtag();
//		matriz();

	}

	private static void caractereFinalLinha() {

		int tamanhoTotalLinha = 6;
		int posicao = 6;

		for (int i = 0; i < 6; i++) {
			for (int j = 1; j <= tamanhoTotalLinha; j++) {
				if (j < posicao) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
			posicao--;
		}
	}

	private static void arvoreNatal() {

		int n = 6;
		int posicao = n;

		for (int i = 0; i <= 6; i++) {
			for (int j = 6; j >= 0; j--) {
				if (posicao >= j) {
					System.out.print(' ');
					posicao = posicao - 1;
				} else {
					System.out.print('#');
					posicao = n;
				}
			}
			System.out.println();
		}

	}

	private static void hashtag() {

		int posi = 6;
		int t = 0;

		for (int i = 0; i <= 5; ++i) {
			for (int j = 0; j <= 6; ++j)
				if (j == posi) {
					for (int i2 = 0; i2 <= t; ++i2) {
						System.out.print('#');
					}
					t += 1;
					posi--;

				}
			System.out.println();
		}
	}

	private static void matriz() {
		int[][] matriz = new int[3][3];

		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz M[3][2]\n");

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = entrada.nextInt();
			}
		}

		System.out.println("\nA Matriz ficou: \n");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
			System.out.println();
		}
	}
}
