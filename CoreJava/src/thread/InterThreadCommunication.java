package thread;

public class InterThreadCommunication extends Thread{

	public static void main(String[] args) throws InterruptedException {
		final Product p=new Product();
		Thread t1=new Thread(new Runnable() {
			
			public void run() {
				try {
					p.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			public void run() {
				try {
					p.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		
		t1.start();
		
		t2.start();
		t1.join();
		t2.join();
		
	}
}

class Product {

	public void produce() throws InterruptedException {
		Thread.sleep(1000);
		synchronized (this) {
			System.out.println("Processing please wait.......");
			
			this.notify();
			System.out.println("Produced");
		}
	}

	public void consume() throws InterruptedException {

		synchronized (this) {
			System.out.println("Producer.. please produce  ");
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Consumed..........Thank you");
		}
	}
}
