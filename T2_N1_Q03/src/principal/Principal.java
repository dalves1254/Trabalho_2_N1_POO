package principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		double a, b, c, Delta, x1, x2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a: ");
		a = sc.nextDouble();
		System.out.print("Digite b: ");
		b = sc.nextDouble();
		System.out.print("Digite c: ");
		c = sc.nextDouble();
		Delta = b*b - 4*a*c;
		x1 = ((-1)*b + (Math.sqrt(Delta)))/(2*a);
		x2 = ((-1)*b - (Math.sqrt(Delta)))/(2*a);
		System.out.println("\nValor de delta: " + Delta + "\nValor de x1: " + x1 + "\nValor de x2: " + x2);
	}
}