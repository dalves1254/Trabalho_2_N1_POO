package principal;
import java.util.Scanner;
import primo.util.Verificador;

public class Principal {
	public static void main(String[] args) {
		Verificador input = new Verificador();
		String resultado;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número: ");
		String numeroSTR = sc.next();
		if (input.verificaInteiro(numeroSTR) == true) {
			int numero = Integer.parseInt(numeroSTR);
			if (numero <= 1) {
				System.out.println("Entrada inválida! O número digitado deve ser maior que 1.");
			} else {
				int divisores = 0;
				for (int i = 1; i <= numero; i++) {
					if (numero % i == 0) {
						divisores++;
					}
				} if (divisores == 2) {
					System.out.println("O número digitado é primo.");
				} else {
					System.out.println("O número digitado não é primo.");
				}
			}
		} else {
			System.out.println("Entrada inválida! Coloque um número inteiro maior que 1.");
		}
	}
}