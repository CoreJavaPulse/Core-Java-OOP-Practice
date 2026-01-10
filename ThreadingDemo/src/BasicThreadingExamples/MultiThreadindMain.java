package BasicThreadingExamples;

public class MultiThreadindMain {

	public static void main(String[] args) {
		
		MultiThreadingExample example1 = new MultiThreadingExample("Hitesh");
		MultiThreadingExample example2 = new MultiThreadingExample("Deepali");
		example1.start();
		example2.start();
		example1.setName("Thread 1");
		example2.setName("Thread 2");
		System.out.println("Thread 1 Name :"+example1.getName());
		System.out.println("Thank You.");
		
	}
}
