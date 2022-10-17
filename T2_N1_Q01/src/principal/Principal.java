package principal;
import java.util.Scanner;
import imparpar.util.Verificador;

public class Principal {
	public static void main(String[] args) {
		Verificador input = new Verificador();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número: ");
		String numeroSTR = sc.next();
		if (input.verificaInteiro(numeroSTR) == true) {
			int numero = Integer.parseInt(numeroSTR);
			if (numero % 2 == 0) {
				System.out.println("O número digitado é par.");
			} else {
				System.out.println("O número digitado é ímpar.");
			}
		} else {
			System.out.println("Entrada inválida! Coloque um número inteiro.");
		}
	}
}