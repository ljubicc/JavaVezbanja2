package matriceVezba;

import java.util.Scanner;

public class ZamenaDijagonala {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite velicinu matrice X (n <= 10):");
		int n = sc.nextInt();

		int[][] X = new int[n][n];

		System.out.println("Popunjavanje matrice X:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				X[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica X:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(X[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					int pom = X[i][j];
					X[i][j] = X[i][n - i - 1];
					X[i][n - i - 1] = pom;
				}
			}
		}
		System.out.println("Zamenjene dijagonale:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(X[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
