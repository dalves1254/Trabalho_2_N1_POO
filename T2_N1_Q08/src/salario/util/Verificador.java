package salario.util;

public class Verificador {
	public boolean verificaInteiro(String str) {
		return str != null && str.matches("[0-9]*");
	}
}