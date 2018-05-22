package samples.printstars;

public class Pattern7 {
	public static void main(String[] args) {

		int a = 5;
		for (int i = 1; i <= a; i++) {
			for (int k = a; k >= 1; k--) {
				if (k <= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
