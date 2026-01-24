
public class LambdaWithThread {

	// Synchronized method (uses THIS object's lock)
	public synchronized void increment() {
		count++;  // Safe operation
	}
	private int count = 0;  // Shared variable

	public int getCount() {
		return count;
	}
	
	public static void main(String args[])  throws InterruptedException
	{
		LambdaWithThread counter = new LambdaWithThread();
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});
		
		t1.start();
        t2.start();
        t1.join();  // Wait for both to finish
        t2.join();
        
        System.out.println("Final: " + counter.getCount());  // 2000

	}

}
