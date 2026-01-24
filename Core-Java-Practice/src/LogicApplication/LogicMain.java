package LogicApplication;
import java.util.Scanner;

public class LogicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Logic lobj = new Logic();
		String ch = null;
		int num=0;
		do
		{
			System.out.println("------------------------Main Menu------------------------");
			System.out.println("1:Factors\n2:Factorial\n3:Prime\n4:Reverse Number\n5:Fibbo\n6:Sum Of The Digits"
					+ "\n7:Armstrong Number\n8:Neon Number\n9:Perfect Number\n10:Palindrome Number\n11:Base And Power");
			System.out.println("Enter Your Choice :");
			ch = sc.next();

			switch(ch)
			{
			case "1":
				System.out.println("Enter The Number To Find The Factors :");
				num = sc.nextInt();
				lobj.factor(num);
				break;
			case "2":
				System.out.println("Enter The Number To Find Its Factorial.");
				num = sc.nextInt();
				lobj.factorial(num);
				break;
			case "3":
				System.out.println("Enter The Number To Check Ifs Its Prime Number.");
				num = sc.nextInt();
				lobj.prime(num);
				break;
			case "4":
				System.out.println("Enter the Number You Want To Reverse!");
				num=sc.nextInt();
				lobj.reversenumber(num);
				break;
			case "5":
				System.out.println("Enter The Number Of Elements You Want In Fibbo Series.");
				num = sc.nextInt();
				lobj.fibbo(num);
				break;
			case "6":
				System.out.println("Enter The Number To Find Sum Of Its Digit.");
				num = sc.nextInt();
				lobj.sumofdigit(num);
				break;
			case "7":
				System.out.println("Enter The Number To Find If Its Armstrong Or Not.");
				num = sc.nextInt();
				lobj.armstrongnumber(num);
				break;
			case "8":
				System.out.println("Enter The Number To Find If Its Neon Or Not.");
				num = sc.nextInt();
				lobj.neonnumber(num);
				break;
			case "9":
				System.out.println("Enter The Number To Find If Its Perfect Or Not.");
				num = sc.nextInt();
				lobj.perfectnumber(num);
				break;
			case "10":
				System.out.println("Enter The Number To Find If Its Pallindrome Or Not.");
				num = sc.nextInt();
				lobj.pallindromenumber(num);
				break;
			case "11":
				System.out.println("Enter The Base And Its Power To Find Its Value.");
				int base=sc.nextInt();
				int pow=sc.nextInt();
				lobj.baseandpower(base,pow);
				break;
			default:
				System.out.println("Please Enter The Valid Choice");
				break;
			}
			System.out.println("\nDo You Want To Continue!\nEnter Yes or No");
			ch=sc.next();	
		}while(ch.equalsIgnoreCase("yes"));
		System.out.println("------------------------------Thank You----------------------------------");
		sc.close();
	}
}
