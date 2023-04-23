package nizovi;

import java.util.Scanner;

public class Primer4 {
	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();

		int x[] = new int[n], p = 1;

		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();			
			if (x[i] % 4 != 0)
				p *= x[i];
		}

		System.out.println("P = " + p);

		ulaz.close();
	}
}