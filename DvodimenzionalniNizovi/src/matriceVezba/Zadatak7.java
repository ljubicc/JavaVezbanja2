package matriceVezba;

import java.util.Scanner;

public class Zadatak7 {

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
		System.out.println("Glavna dijagonala matrice");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				if (i == j)
					System.out.print(niz[i][j] + " ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println("Samo clanovi na sporednoj");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (i + j == niz.length - 1)
					System.out.print(niz[i][j] + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("clanovi sa parnim indeksom kolone su: \n");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if ((j + 1) % 2 == 0)
					System.out.print(niz[i][j] + " ");

			}
			System.out.println();
		}

		sc.close();
	}

}
