package uriJudge.iniciante1002;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double r = 0, a = 0;
		
		r = s.nextDouble();
		a = 3.14159 * Math.pow(r, 2);
		System.out.printf("A=%.4f%n", a);
s.close();
	}

}
