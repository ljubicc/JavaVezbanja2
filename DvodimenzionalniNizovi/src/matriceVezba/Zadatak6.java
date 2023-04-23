package matriceVezba;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int kolone = sc.nextInt();

		int[][] niz = new int[red][kolone];

		System.out.println("Unesite elemente matrice:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("niz[" + i + "][" + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Svi elementi matrice:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				if (niz[i][j] < min)
					min = niz[i][j];
				if (niz[i][j] > max)
					max = niz[i][j];
			}

		}

		System.out.println("Max = " + max);
		System.out.println("Min = " + min);

		sc.close();

	}

}
