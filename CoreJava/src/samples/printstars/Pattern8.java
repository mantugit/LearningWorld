package samples.printstars;

public class Pattern8 {

	public static void main(String[] args) {
		int a = 5;
		for (int i = 1; i <= a; i++) {
			int p=1;
			for (int k = a; k >= 1; k--) {
				System.out.print(" ");
				if(k<=i) {
				System.out.print(p);p++;}
			}
			p=0;
			System.out.println();
		}
	}
}
