package ArithmeticOperationsWithCustomThread;

public class ArithmeticThread extends Thread // implements Runnable
{

	ArithmeticOperation aOperation;

	public ArithmeticThread(ArithmeticOperation aOperation) {
		super();
		this.aOperation = aOperation;
		//Thread thread = new Thread(this);
		//thread.start();
		this.start();
	}
	
	public void run()
	{
		aOperation.getSum();
		aOperation.getSub();
		aOperation.getMul();
		aOperation.getDiv();
	}
}
