package uriJudge.inicinate1004;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int a = 0, b = 0, prod = 0;

		Scanner s = new Scanner(System.in);

		a = s.nextInt();
		b = s.nextInt();
		prod = a * b;
		System.out.println("PROD = " + prod);

		s.close();
	}

}
