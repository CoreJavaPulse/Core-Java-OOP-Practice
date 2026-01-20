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
					+ "\n4:Perform Transaction.\n5:Update The Account Details.\n6:Delete the Account.\n7:Add Interest "
					+ "8:Save Data\"");
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
				bankServicesobj.searchAccount();
				break;
			case 4:
				bankServicesobj.transaction();
				break;
			case 5:
				bankServicesobj.updateAccount();
				break;
			case 6:
				bankServicesobj.deleteAccount();
				break;
			case 7:
			    bankServicesobj.addInterestToAllAccounts();
			    break;
			default:
				System.out.println("Enter Valid Choice. (1-7)");
				break;
			}
			System.out.println("Do You Want To Continue.\nEnter Yes Or No.");
			str = sc.next();
		}while(str.equalsIgnoreCase("yes"));
		sc.close();
		System.out.println("--------------------Thank You--------------------");

	}

}
