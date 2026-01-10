package BasicThreadingExamples;
import java.util.Scanner;

public class ThreadMethod2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N1 And  N2.");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		ThreadMethod2 obj = new ThreadMethod2(n1,n2);
		Thread thread1 = new Thread(obj);
		thread1.start();
		System.out.println("Thank You!");
		sc.close();

	}

}
