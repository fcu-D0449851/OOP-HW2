package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        String b;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a integer:");
        a = scan.nextInt();
        
        switch (a)
        {
        case 1: b = "ONE"; break;
        case 2: b = "TWO"; break;
        case 3: b = "THREE"; break;
        case 4: b = "FOUR"; break;
        case 5: b = "FIVE"; break;
        case 6: b = "SIX"; break;
        case 7: b = "SEVEN"; break;
        case 8: b = "EIGHT"; break;
        case 9: b = "NINE"; break;
        default: b = "OTHER";
        }
        
        System.out.printf("The input integer is \"%s\".",b);
	}

}
