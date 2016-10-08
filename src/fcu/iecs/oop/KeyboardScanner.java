package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  I;
		float F;
		String  S;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		I = scan.nextInt();
		System.out.println("Enter a float point number:");
		F = scan.nextFloat();
		System.out.println("Enter a your name:");
		S = scan.next();
		double D = I*F;
		
		
		System.out.printf("Hi %s, the multiplication of %d and %.5f is %.2e.",S,I,F,D);
	}

}
