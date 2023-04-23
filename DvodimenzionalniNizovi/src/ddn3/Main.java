package ddn3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int[][] niz = new int[red][kolona];

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("niz[" + i + ", " + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Parni elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Neparni elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 != 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Elementi parnih redova:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if ((i + 1) % 2 == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Elementi sa parnim indeksima redova:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if((i + 1) % 2 == 0) parni redovi
				if (i % 2 == 0) // parni indeksi redova
					System.out.print(niz[i][j] + " ");
			}
		}

		sc.close();
	}

}
