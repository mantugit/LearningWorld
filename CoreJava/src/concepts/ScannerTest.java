package concepts;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc.next();
		System.out.println("String   "+s);
		System.out.println("Enter number   ");
		int i = sc.nextInt();
		
		System.out.println("int    "+i);
	}
}
