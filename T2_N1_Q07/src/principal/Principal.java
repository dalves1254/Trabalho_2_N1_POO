package principal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));
		DecimalFormat BR = new DecimalFormat("#0.##");
		int cont_time, cont_jog, idade, altura, peso, qtde18;
		float media_idade, media_altura, porc, tot80;
		qtde18 = 0; tot80 = 0; media_idade = 0; media_altura = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de times: ");
		cont_time = sc.nextInt();
		System.out.print("Quantidade de jogadores: ");
		cont_jog = sc.nextInt();
		
		for (int i = 1; i <= cont_time; i++) {
			for (int j = 1; j <= cont_jog; j++) {
				System.out.print("\nIdade: ");
				idade = sc.nextInt();
				if (idade < 18) {
					qtde18++;
				} media_idade = media_idade + idade;
				System.out.print("Altura (em cm): ");
				altura = sc.nextInt();
				media_altura = media_altura + altura;
				System.out.print("Peso: ");
				peso = sc.nextInt();
				if (peso > 80) {
					tot80 = tot80 + 1;
				}
			} media_idade = media_idade/cont_jog;
			System.out.println("Média de idade dos jogadores do time: " + BR.format(media_idade) + " anos");
		}
		media_altura = media_altura/(cont_time*cont_jog)/100;
		porc = tot80*100/(cont_time*cont_jog);
		System.out.println("\nQuantidade de jogadores menores de 18 anos: " + qtde18);
		System.out.println("Média de altura dos jogadores: " + BR.format(media_altura) + " m");
		System.out.println("Porcentagem de jogadores com mais de 80 kg: " + BR.format(porc) + "%");
	}
}