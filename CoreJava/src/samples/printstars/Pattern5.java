package samples.printstars;

public class Pattern5 {

	public static void main(String[] args) {
		int j=1;
		int a=5;
		for(int i=1;i<=a;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(j+" ");j++;
			}System.out.println();
		}
	}
}
