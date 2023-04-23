package metode;

public class Primer3 {
	
	final static int red = 2;
	final static int kolona = 2;
	
	static void stampajMatricu(int[][] matrica) {
		System.out.println("Dobijena matrica izgleda: ");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		int[][] matrica = { {1, 2}, {3, 4} };
		
		stampajMatricu(matrica);
		
		
	}

}
