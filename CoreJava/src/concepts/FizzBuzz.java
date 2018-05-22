package concepts;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String l=s.nextLine();
		int len =Integer.parseInt(l);
		System.out.println("assa");
		String numArr=s.nextLine();
		String[] num = numArr.split(" ");
		
		for(int j=0;j<len;j++) {
			int number =Integer.parseInt(num[j]);
			
			for(int i=1;i<=number;i++){
				if(i%15 == 0 ) {
					System.out.println("FizzBuzz");
				}
				else if(i%5 == 0 ) {
					System.out.println("Buzz");
				}
				else if(i%3 == 0 ) {
					System.out.println("Fizz");
				}else 
					System.out.println(i);
			}
		}
		
	}
}
