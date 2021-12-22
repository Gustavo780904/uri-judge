package uriJudge.iniciante1001;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		
		int a=0, b=0, x = 0;

		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		b = s.nextInt();
		x = a + b;
		System.out.println("X = " + x);
		
s.close();
	}

}
