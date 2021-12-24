package uriJudge.inicinate1007;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int a = 0, b = 0, c = 0, d = 0, diferenca = 0;

		Scanner s = new Scanner(System.in);

		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		diferenca = (a * b - c * d);
		System.out.println("DIFERENCA = " + diferenca);

		s.close();
	}

}
