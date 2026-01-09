import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			//System.out.println("Enter N1 ");
			//int n1 = sc.nextInt();
			//System.out.println("Enter N2 ");
			//int n2 = sc.nextInt();
			System.out.println("Enter Any 2 numbers");
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			double div = n1/n2;
			System.out.println("Result Is :"+div);
		} 
		catch (ArithmeticException|NullPointerException|InputMismatchException|ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Multi Excep Block :"+e);
		}
		
//		catch (ArithmeticException ex) {
//			// TODO Auto-generated catch block
//			System.out.println("Excep :"+ex);
//		}
//		catch (InputMismatchException ex) {
//			// TODO: handle exception
//			System.out.println("Excep :"+ex);
//		}
//		catch (ArrayIndexOutOfBoundsException ex) {
//			// TODO: handle exception
//			System.out.println("Excep : "+ex);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Any Other Excep : "+e);
//		}
		finally {
			System.out.println("This Is Finally Block");
		}
		
		
		System.out.println("Thank You...");
		
		sc.close();

	}

}
