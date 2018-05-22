package samples.printstars;

public class Pattern10 {
	
	public static void main(String[] args) {
		int flag =0;
		for(int i=1;i<=3;i++) {
			for(int space=1;space<i;space++) {
				System.out.print(" ");
			}
			for(int j=i;j<=6-i;j++) {
				System.out.print(j);
			}
			System.out.println("    ");
		}
		
		for(int i=4;i>2;i--) {
			for(int space=4;space<=i;space++) {
				System.out.print(" ");
			}
			for(int j=i-2;j<=4+flag;j++) {
				System.out.print(j);
			}
			flag++;
			System.out.println();
		}
		
	}

}
