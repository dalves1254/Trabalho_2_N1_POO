package principal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
		DecimalFormat BR = new DecimalFormat("#,##0.##");
		int num, soma, qtd, maior, menor, qtd_par, soma_par, qtd_impar;
		float media, media_par, perc;
		soma = 0; qtd = 0; qtd_par = 0; soma_par = 0; qtd_impar = 0; maior = 0; menor = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Digite! ");
			num = sc.nextInt();
			if (num != 30000) {
				if (qtd == 0) {
					maior = num;
					menor = num;
				} else {
					if (num > maior) {
						maior = num;
					} if (num < menor) {
						menor = num;
					}
				} qtd++;
				soma = soma + num;
				if (num % 2 == 0) {
					qtd_par++;
					soma_par = soma_par + num;
				} else {
					qtd_impar++;
				}
			}
		} while (num != 30000);

		if (qtd == 0) {
			System.out.println("\nNenhum número digitado");
		} else {
			media = soma/qtd;
			media_par = soma_par/qtd_par;
			perc = qtd_impar*100/qtd;
			System.out.println("\nSoma dos números digitados: " + soma);
			System.out.println("Quantidade de números digitados: " + qtd);
			System.out.println("Média dos números digitados: " + BR.format(media));
			System.out.println("O maior número digitado: " + maior);
			System.out.println("O menor número digitado: " + menor);
			if (qtd_par == 0) {
				System.out.println("Nenhum número par digitado");
			} else {
				System.out.println("Média dos números pares: " + BR.format(media_par));
			}
			System.out.println("Porcentagem dos números ímpares: " + BR.format(perc) + "%");	
		}
	}
}