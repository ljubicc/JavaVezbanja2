package metode;

public class Primer4 {
	
	static int zbir(int a, int b) {
		return a + b;
	}
	
	static double zbir(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		int a = 3, b = 4;
		double x = 2.3, y = 4.5;
		
		System.out.println("Poziv za podatke tipa double: " + zbir(x, y));
		System.out.println("Poziv za podatke tipa int: " + zbir(a, b));
		
	}

}
