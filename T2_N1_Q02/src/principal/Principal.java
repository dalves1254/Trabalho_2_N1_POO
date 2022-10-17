package principal;
import java.util.Scanner;
import somaraiz.util.Verificador;

public class Principal {
	public static void main(String[] args) {
		Verificador input = new Verificador();
		Scanner sc = new Scanner(System.in);
		System.out.print("MENU DE OPÇÕES\n1. Somar dois números\n2. Raiz quadrada de um número\n\nDigite sua opção: ");
		String op = sc.next();
		if (input.verificaInteiro(op) == true) {
			int opINT = Integer.parseInt(op);
			if (opINT == 1) {
				System.out.print("\nDigite um valor para o primeiro número: ");
				float num1 = sc.nextFloat();
				System.out.print("Digite um valor para o segundo número: ");
				float num2 = sc.nextFloat();
				float soma = num1 + num2;
				System.out.println("\nA soma de " + num1 + " + " + num2 + " é igual a " + soma + ".");
			} else if (opINT == 2) {
				System.out.print("\nDigite um valor: ");
				double num1 = sc.nextDouble();
				double raiz = Math.sqrt(num1);
				System.out.println("A raiz quadrada de " + num1 + " é " + raiz + ".");
			} else {
				System.out.println("\nOpção inválida!");
			}
		} else {
			System.out.println("\nOpção inválida!");
		}
	}
}