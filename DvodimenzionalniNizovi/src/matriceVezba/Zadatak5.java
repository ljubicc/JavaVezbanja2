package matriceVezba;

import java.util.Scanner;

public class Zadatak5 {

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

		int zbirSvih = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				zbirSvih += niz[i][j];
			}
		}

		System.out.println("Zbir svih elemenata matrice je " + zbirSvih);
		sc.close();
	}

}
