import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice = null;
		Customer[] cust = null;
		BankOp bankopobj = new BankOp();
		int id;
		do {
			System.out.println("--------------------------Main Menu----------------------");
			System.out.println("1:Add Customer.\n2:Display Customer Details.\n3:Search Customer By Id."
					+ ".\n4:Exit.");
			System.out.println("Enter Your Choice.");
			int ch=sc.nextInt();
			System.out.println();
			switch(ch)
			{
			case 1:
				cust=bankopobj.createAccount();
				break;
			case 2:
				bankopobj.displaycustomeracc(cust);
				break;
			case 3:
		        System.out.print("Enter Customer ID: ");
		        id = sc.nextInt();
		        bankopobj.searchCustomer(id);
		        break;
			case 4:
				break;
			default:
				System.out.println("\nEnter A Valid Choice!(1-4)");
				break;
			}
			System.out.println("\nDo You Want To Continue.\nEnter Yes or No.");
			choice=sc.next();
			System.out.println();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("---------------------------Thank You-------------------");
		sc.close();
	}

}
