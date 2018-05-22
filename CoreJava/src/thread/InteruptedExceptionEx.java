package thread;

 class NewThread extends  Thread{
    Thread t;
	 public NewThread() {
		// TODO Auto-generated constructor st
		 t=new Thread(this);
		 t.start();
	}
	 public void run() {
		 for(int i=0;i<5;i++) {
			 System.out.println("Child    "+i+   Thread.currentThread().getName());
			 try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
}

public class InteruptedExceptionEx{
	
	public static void main(String[] args) {
		new  NewThread();
		
		/*for(int i=0;i<2;i++) {
			System.out.println("Main Thread    "+i+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
	
	
	
	
	
	
	
}