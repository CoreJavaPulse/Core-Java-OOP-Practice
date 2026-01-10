package BasicThreadingExamples;

public class MultiThreadingExample extends Thread{
	
	public String str;

	public MultiThreadingExample(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		for(int i = 1;i<=5;i++)
		{
			System.out.println(str+"\t"+i);
		}
	}
}
