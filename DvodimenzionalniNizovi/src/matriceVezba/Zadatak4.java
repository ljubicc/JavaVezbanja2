package matriceVezba;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.println("Unesite broj kolona: ");
		int kolone = sc.nextInt();

		int[][] niz1 = new int[red][kolone];
		int[][] niz2 = new int[red][kolone];
		int[][] zbir = new int[red][kolone];
		int[][] razlika = new int[red][kolone];
		int[][] proizvod = new int[red][kolone];
		int[][] proizvodS = new int[red][kolone];

		System.out.println("Unesite elemente prve matrice:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("niz1[" + i + "][" + j + "] = ");
				niz1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Unesite elemente druge matrice:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print("niz2[" + i + "][" + j + "] = ");
				niz2[i][j] = sc.nextInt();
			}
		}

		System.out.println("Svi elementi prve matrice:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(niz1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Svi elementi druge matrice:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(niz2[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < red; i++)
			for (int j = 0; j < kolone; j++)
				zbir[i][j] = niz1[i][j] + niz2[i][j];

		System.out.println("Zbir elemenata prve i druge matrice");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(zbir[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < red; i++)
			for (int j = 0; j < kolone; j++)
				razlika[i][j] = niz1[i][j] - niz2[i][j];

		System.out.println("Razlika elemenata prve i druge matrice");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(razlika[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < red; i++)
			for (int j = 0; j < kolone; j++)
				proizvod[i][j] = niz1[i][j] * niz2[i][j];

		System.out.println("Proizvod elemenata prve i druge matrice");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				proizvod[i][j] = 0;
				for (int t = 0; t < kolone; t++) {
					proizvod[i][j] += niz1[i][t] * niz2[t][j];
				}
			}
		}
		for (int i = 0; i < proizvodS.length; i++) {
			for (int j = 0; j < proizvodS.length; j++) {
				System.out.print(proizvod[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Unesite vrednost skalara: ");
		int skalar = sc.nextInt();
		System.out.println("Unesite elemente matrice koju mnozimo skalarom:");
		for (int i = 0; i < red; i++)
			for (int j = 0; j < kolone; j++) {
				niz1[i][j] = sc.nextInt();
				proizvodS[i][j] = niz1[i][j] * skalar;
			}

		System.out.println("Proizvod matrice skalarom:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolone; j++) {
				System.out.print(proizvodS[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
