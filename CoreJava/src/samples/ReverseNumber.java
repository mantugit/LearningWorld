package samples;

public class ReverseNumber {

	public static void main(String[] args) {
		/*int a=123456;
		StringBuilder s=new StringBuilder(String.valueOf(a));
		System.out.println(s.reverse());
		int a2=Integer.parseInt(s.toString());
		System.out.println(a2);*/
		
		int num=1234;
		int rev=0;
		
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
	String s="";
	char [] ch = s.toCharArray();
		System.out.println(rev);
	}
}
