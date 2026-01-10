
public class ThreadDemo {

	public static void main(String[] args) 
	{
		MyThread thread1 = new MyThread();//Thread Created
		thread1.setName("Java Thread.");
		thread1.start();//runnable stage i.e its in queue.
		System.out.println("Thank You.");
	}

}
