package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThrdTest implements Runnable {
	String name;

	public ThrdTest(String name) {
		this.name = name;
	}

	public void run() {
		try {
			for (int i = 0; i < 2; i++) {
				if (i == 0) {
					System.out.println("Thread Started   " + this.name);
				} else {
					System.out.println("Thread running   " + this.name);
				}
			}

			Thread.sleep(1000);
			System.out.println(" Execution Completed     "+this.name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThrdPool {
	public static void main(String[] args) {

		
		Runnable r1=new ThrdTest("Thrd 1");
		Runnable r2=new ThrdTest("Thrd 2");
		Runnable r3=new ThrdTest("Thrd 3");
		Runnable r4=new ThrdTest("Thrd 4");
		Runnable r5=new ThrdTest("Thrd 5");
		
		 ExecutorService pool = Executors.newFixedThreadPool(3);
		 pool.execute(r1);
		 pool.execute(r2);
		 pool.execute(r3);
		 pool.execute(r4);
		 pool.execute(r5);
		
		 pool.shutdown();
	}

}
