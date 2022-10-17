package principal;
import java.util.Scanner;
import fat.util.Fatorial;

public class Principal {
	public static void main(String[] args) {
		int n, num, i, fat;
		Fatorial input = new Fatorial();
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de valores a serem perguntados: ");
		n = sc.nextInt();
		int numeros[] = new int[n];
		int fatoriais[] = new int[n];
		for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.println("");
			} System.out.print("Digite um número: ");
			num = sc.nextInt();
			fat = input.fatorial(num);
			numeros[i] = num;
			fatoriais[i] = fat;
		} for (i = 0; i < n; i++) {
			if (i == 0) {
				System.out.println("");
			} System.out.println("Número: " + numeros[i] + " | Fatorial: " + fatoriais[i]);
		}
	}
}