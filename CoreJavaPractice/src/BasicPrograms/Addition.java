package BasicPrograms;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 and num2");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Addition of 2 numbers is : "+(num1+num2));
		sc.close();

	}

}
