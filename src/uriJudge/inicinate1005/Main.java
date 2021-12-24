package uriJudge.inicinate1005;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Double a = 0.0, b = 0.0, media = 0.0;

		Scanner s = new Scanner(System.in);

		a = s.nextDouble();
		b = s.nextDouble();
		media = (a*3.5 + b*7.5)/11;
		System.out.printf("MEDIA = %.5f%n", media);

		s.close();
	}

}
