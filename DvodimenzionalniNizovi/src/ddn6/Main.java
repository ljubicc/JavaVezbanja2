package ddn6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int[][] matrica = new int[red][kolona];

		System.out.println("Unesite elemente: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("matrica[" + i + "," + j + "] = ");
				matrica[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		int sumaKvadrata = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				sumaKvadrata += Math.pow(matrica[i][j], 2);
			}
		}

		System.out.println("Suma kvadrata elemenata matrice je: " + sumaKvadrata);
		sc.close();

	}

}
