package thread;

public class DeadLockWithMainThread {
	public static void main(String[] args) {

		System.out.println("This will do a dead lock");
		try {
			Thread.currentThread().join();
			
			
			System.out.println("This will never execute");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
