package BasicThreadingExamples;

public class MyThread  extends Thread{

	public void run()//Thread running stage
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello Thread Is Running.");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}//thread dead
	
}
