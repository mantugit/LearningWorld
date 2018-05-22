package java8;

@FunctionalInterface
interface LambdaInterface{
	void show();
	
}
public class LambdaEx {
	public static void main(String[] args) {

		LambdaInterface l=()->{
			System.out.println("Lambda worked");
		};
		
		l.show();
	}
}
