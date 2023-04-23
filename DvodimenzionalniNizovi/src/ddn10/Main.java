package ddn10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int kolone = sc.nextInt();

		if (kolone < 5)
			System.out.println("Broj kolona mora biti barem 5!");
		else {

			int[][] matrica = new int[red][kolone];

			for (int i = 0; i < red; i++) {
				for (int j = 0; j < kolone; j++) {
					System.out.print("matrica[" + i + "," + j + "] = ");
					matrica[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < red; i++) {
				for (int j = 0; j < kolone; j++) {
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}

			int suma = 0;
			for (int i = 0; i < red; i++) {
				for (int j = 0; j < kolone; j++) {
					if (j == 4)
						suma += matrica[i][j];
				}
			}
			System.out.println("Suma pete kolone je " + suma);

		}
		sc.close();

	}

}
