package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o n�mero de linhas da matriz: ");
		int linhas = scan.nextInt();
		scan.nextLine();
		System.out.print("Digite o n�mero de colunas da matriz: ");
		int colunas = scan.nextInt();
		scan.nextLine();
		System.out.println();

		int[][] mat = new int[linhas][colunas];

		for (int i = 0; i < mat.length; i++) {
			System.out.println("Linha: " + i);
			System.out.println();
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Digite um valor para a posi��o " + j + ": ");
				mat[i][j] = scan.nextInt();
				System.out.println();
			}
		}
		System.out.println("Matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Digite um n�mero: ");
		int x = scan.nextInt();
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posi��o - Linhas: " + i + ", Coluna: " + j);
					if (j > 0) {
						System.out.println("N�mero a esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("N�mero a cima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("N�mero a direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("N�mero a baixo: " + mat[i + 1][j]);
					}
				}
			}
			System.out.println();
		}

		scan.close();
	}

}
