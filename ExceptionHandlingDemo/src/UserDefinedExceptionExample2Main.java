import java.util.Scanner;

public class UserDefinedExceptionExample2Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name.");
		String name = sc.next();
		System.out.println("Enter Your Age");
		int age= sc.nextInt();
		System.out.println("Enter Your Percentage.");
		double percentage = sc.nextDouble();

		try {
			display(name,age,percentage);
			System.out.println("Congrats Admission SuccessFull");
		}
		catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		catch (InvalidPercentageException e) {
			e.printStackTrace();
		}
		System.out.println("Thank You!");
		sc.close();
	}

	private static void display(String name, int age, double percentage) throws InvalidAgeException,InvalidPercentageException
	{
			try {
				if(age<18)
					throw new InvalidAgeException();
				if(percentage<60)
					throw new InvalidPercentageException();
				System.out.println("Valid Profile.");
				System.out.println("Welcome!");
			} catch (InvalidAgeException | InvalidPercentageException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception Is :"+e);
				throw e;
			}
		
	}

}
