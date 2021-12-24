package uriJudge.inicinate1006;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Double a = 0.0, b = 0.0, c = 0.0, media = 0.0;

		Scanner s = new Scanner(System.in);

		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		
		media = (a * 2 + b * 3 + c * 5) / 10;
		System.out.printf("MEDIA = %.1f%n", media);

		s.close();
	}
}
