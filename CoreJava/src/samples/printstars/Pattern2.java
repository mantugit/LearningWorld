package samples.printstars;

public class Pattern2 {
	public static void main(String[] args) {

		int a=5;
		
		for(int k=1;k<=a;k++) {
		for(int i=1;i<=a;i++) {
			
			if((i+k)>a)
				System.out.print("*");
			else
				System.out.print(" ");
			
			
			/*if(i<=k)System.out.print("*");
			else System.out.print(" ");*/
		}System.out.println();
		}
	}
}
