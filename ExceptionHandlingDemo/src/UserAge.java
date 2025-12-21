import java.util.Scanner;

public class UserAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.next();
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		try
		{
			if(age<18)
				throw new InvalidAgeException();
			System.out.println("Valid Age!");
		}
		catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("Exception Occured :"+e);
		}

	}

}
