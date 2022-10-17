package principal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import salario.util.Verificador;

public class Principal {
	public static void main(String[] args) {
		float salario, imposto, aumento, novoSalario;
		Locale.setDefault(new Locale("pt", "BR"));
		DecimalFormat BRL = new DecimalFormat("#,##0.00");

		Verificador input = new Verificador();
		Scanner sc = new Scanner(System.in);
		System.out.print("MENU DE OPÇÕES\n1. Imposto\n2. Novo salário\n3. Classificação\n4. Finalizar o programa\n\nDigite a opção desejada: ");
		String op = sc.next();
		if ((input.verificaInteiro(op) == true) && (Integer.parseInt(op) >= 1) && (Integer.parseInt(op) <= 4)) {
			int opINT = Integer.parseInt(op);
			if (opINT == 1) {
				System.out.print("\nSalário: R$ ");
				salario = sc.nextFloat();
				if (salario < 500) {
					imposto = salario*5/100;
				} else if ((salario >= 500) && (salario <= 850)) {
					imposto = salario*10/100;
				} else {
					imposto = salario*15/100;
				} System.out.println("Imposto sobre o salário: R$ " + BRL.format(imposto));
			} if (opINT == 2) {
				System.out.print("Salário: R$ ");
				salario = sc.nextFloat();
				if (salario > 1500) {
					aumento = 25;		
				} else if ((salario >= 750) && (salario <= 1500)) {
					aumento = 50;
				} else if ((salario >= 450) && (salario < 750)) {
					aumento = 75;
				} else {
					aumento = 100;
				} novoSalario = salario+aumento;
				System.out.println("Novo salário: R$ " + BRL.format(novoSalario));
			} if (opINT == 3) {
				System.out.print("Salário: R$ ");
				salario = sc.nextFloat();
				if (salario <= 700) {
					System.out.println("Classificação: mal-remunerado");
				} else {
					System.out.println("Classificação: bem-remunerado");
				}
			} if (opINT == 4) {
				System.exit(0);
			}
		} else {
			System.out.println("\nOpção inválida!");
		}
	}
}