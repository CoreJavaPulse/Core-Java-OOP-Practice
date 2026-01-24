package BasicThreadingExamples;
import java.util.Scanner;

public class CalculationMainThread {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N1 And  N2.");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		CalculationThread cThread = new CalculationThread(n1,n2);
		//cThread.getSum(); this Is Not Allowed in threading.
		cThread.start();
		sc.close();
	}

}
