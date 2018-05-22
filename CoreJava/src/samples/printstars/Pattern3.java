package samples.printstars;

public class Pattern3 {

	public static void main(String[] args) {
		int a=5;
		
		for(int i=1;i<=a;i++) {
		for(int j=a;j>=1;j--) {
			System.out.print(" ");
			if(j<=i)
				System.out.print("*");
			
		}System.out.println();
		}
	}
}
