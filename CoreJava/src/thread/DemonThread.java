package thread;

public class DemonThread {

	static {
		System.out.println("static block willnot execute if there is no main method"
				+ " From java 1.6");
		
	}
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("Customised Main Thread");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
	}
}
