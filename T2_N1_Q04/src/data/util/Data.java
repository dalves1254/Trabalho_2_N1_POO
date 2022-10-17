package data.util;
import java.util.Calendar;

public class Data {
	public void DataHora() {
		int dia, mes, ano, hora, minuto;
		String mesExtenso, d, t, diaPrimeiro;
		Calendar cal = Calendar.getInstance();
		dia = cal.get(Calendar.DAY_OF_MONTH);
		mes = cal.get(Calendar.MONTH);
		ano = cal.get(Calendar.YEAR);
		hora = cal.get(Calendar.HOUR_OF_DAY);
		minuto = cal.get(Calendar.MINUTE);
		
		String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		mesExtenso = meses[mes];
		
		if (dia == 1) {
			diaPrimeiro = "º de ";
		} else {
			diaPrimeiro = " de ";
		}
		
		d = Integer.toString(dia) + diaPrimeiro + mesExtenso + " de " + Integer.toString(ano);
		t = Integer.toString(hora) + ":" + Integer.toString(minuto);
		System.out.println("Data atual: " + d + " – Hora atual: " + t);
	}
}