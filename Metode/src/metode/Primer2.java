package metode;

import java.util.Scanner;

public class Primer2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite dimenziju niza: ");
		int n = sc.nextInt();
		
		
		double[] niz = new double[n];
		
		System.out.println("Unesite elemente niza: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print("niz[" + i + "] = ");
			niz[i] = sc.nextDouble();
			
		}
		
		
		stampajNiz(niz);
		System.out.println("\nSrednja vrednost niza je " + srednjaVrednostNiza(n, niz));
		
		sc.close();
	}
	
	
	static void stampajNiz(double[] niz) {
		System.out.println("Uneti elementi niza su: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
	}
	
	static double srednjaVrednostNiza(int n, double[] niz) {

		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}

		return suma / n;
	}
	

}
