package ArithmeticOperationsWithCustomThread;

public class ArithmeticOperation {
	private int n1;
	private int n2;
	
	public ArithmeticOperation(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void getSum()
	{
		int sum = n1+n2;
		System.out.println("Addition Is :"+sum);
	}
	public void getSub()
	{
		int sub = n1-n2;
		System.out.println("Substraction Is :"+sub);
	}
	public void getMul()
	{
		int mul = n1*n2;
		System.out.println("Multiplication  Is :"+mul);
	}
	public void getDiv()
	{
		int div = n1/n2;
		System.out.println("Division Is :"+div);
	}	
}
