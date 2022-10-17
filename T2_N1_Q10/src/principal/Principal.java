package principal;

public class Principal {
	public static void main(String[] args) {
		int i, j;
		for (j = 1; j <= 10; j++) {
			for (i = 1; i <= 10; i++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			if (j < 10) {
				System.out.println("");
			}
		}
	}
}