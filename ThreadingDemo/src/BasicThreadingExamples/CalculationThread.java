package BasicThreadingExamples;

public class CalculationThread extends Thread{
	private int n1,n2;
	
	public CalculationThread(int n1,int n2)
	{
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void getSum()
	{
		int sum = n1+n2;
		System.out.println("Addition Is :"+sum);
	}
	
	public void run()
	{
		getSum();
	}

}
