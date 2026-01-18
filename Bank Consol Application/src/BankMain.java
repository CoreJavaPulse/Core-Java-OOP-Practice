import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankServices bankServicesobj = new BankServices();
		String str = null;
		do
		{
			System.out.println("---------------------Main Menu--------------------");
			System.out.println("1:Add a Account.\n2:Display All Acounts Details.\n3:Search Account."
					+ "\n4:Update The Account Details.\n5:Delete the Account.");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				bankServicesobj.addAccount();
				break;
			case 2:
				bankServicesobj.displayAllAccounts();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Enter Valid Choice. (1-5)");
				break;
			}
			System.out.println("Do You Want To Continue.\nEnter Yes Or No.");
			str = sc.next();
		}while(str.equalsIgnoreCase("yes")||str.equalsIgnoreCase("yess"));
		sc.close();
		System.out.println("--------------------Thank You--------------------");

	}

}
