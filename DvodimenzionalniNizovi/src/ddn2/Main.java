package ddn2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = sc.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();

		int[][] niz = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Elementi prvog reda su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Elementi druge kolone: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j == 1)
					System.out.println(niz[i][j]);
			}
		}

		sc.close();
	}

}
