package ThreadMethodsDemo;

public class MobileThreadMain {

	public static void main(String[] args) {
		Mobile thread1 = new Mobile("Java"); //Thread Created
		Mobile thread2 = new Mobile("Python");
		
		thread1.setName("Java");
		System.out.println("Thread 1 Id Is : "+thread1.getId());
		System.out.println("Thread 1 Name Is : "+thread1.getName());
		System.out.println("Thread 1 Priority Is : "+thread1.getPriority());
		
		System.out.println(thread1);
		
		thread2.setName("Python");
		System.out.println("Thread 2 Id Is : "+thread2.getId());
		System.out.println("Thread 2 Name Is : "+thread2.getName());
		System.out.println("Thread 2 Priority Is : "+thread2.getPriority());
		
		System.out.println(thread2);
		
		thread1.setPriority(Thread.MAX_PRIORITY);//10

		thread2.setPriority(Thread.MIN_PRIORITY);//1
		
		thread1.start();//runnable
		thread2.start();
		
		try {
			Thread.sleep(2000);
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thank You");
	}
}
