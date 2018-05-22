package thread;

public class JoinDemo extends Thread {
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException {
       Thread.currentThread().setName("Main Thread ");
       JoinDemo j=new JoinDemo();
       j.setName("Child ");
       j.start();
       j.join();
       for(int i=1;i<5;i++) {
    	   System.out.println(Thread.currentThread().getName());
       }
		
	}
}
