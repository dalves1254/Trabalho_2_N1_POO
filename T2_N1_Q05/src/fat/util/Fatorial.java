package fat.util;

public class Fatorial {
	public int fatorial (int num1) {
		if (num1 == 0) {
			return 1;
		} else {
			int fact = 1;
			for (int i = num1; i >= 1; i--) {
				fact = fact * i;
			} return fact;
		}
	}
}