package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a,b;
        int result;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a string 1:");
        a = scan.next();
        System.out.println("Enter a string 2:");
        b = scan.next();
        
        result = a.compareToIgnoreCase(b);
        if(result==0)
        System.out.println("The two strings are the same.");
        else
        System.out.println("The two strings are not the same.");	
	}

}
