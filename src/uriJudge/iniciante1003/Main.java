package uriJudge.iniciante1003;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int a = 0, b = 0, soma = 0;

		Scanner s = new Scanner(System.in);

		a = s.nextInt();
		b = s.nextInt();
		soma = a + b;
		System.out.println("SOMA = " + soma);

		s.close();
	}

}
