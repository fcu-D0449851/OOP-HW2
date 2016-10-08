package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		a = scan.nextInt();
		if(a%2==0) 
		System.out.println("The input integer is Even Number.");
		else if(a%2==1)
		System.out.println("The input integer is Odd Number.");	
	}

}
