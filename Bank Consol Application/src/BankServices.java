import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankServices {

	Scanner sc = new Scanner(System.in);
	List<Customer> custlist = new ArrayList<Customer>();
	Account accobj;
	public void addAccount() {

		System.out.println("Enter Customer Id.");
		int custId = sc.nextInt();
		System.out.println("Enter Customer Name.");
		String custName = sc.next();

		System.out.println("Enter The Account Number.");
		int accNo = sc.nextInt();
		System.out.println("Enter The ifsc Code.");
		String ifsccode = sc.next();
		System.out.println("Enter The Initial Balance.");
		double balance = sc.nextDouble();
		System.out.println("Enter The Account Type(Savings/Current)");
		String accType = sc.next();

		if(accType.equalsIgnoreCase("savings")) {
			System.out.print("Enter Interest Rate: ");
			double rate = sc.nextDouble();
			accobj = new SavingsAccount(accNo, ifsccode, balance, AccountType.Savings, rate);
		} else if(accType.equalsIgnoreCase("current")) {
			System.out.print("Enter Company Name: ");
			String company = sc.next();
			accobj = new CurrentAccount(accNo, ifsccode, balance, AccountType.Current, company);
		}

		System.out.println("Enter The Customers City.");
		String city = sc.next();
		System.out.println("Enter The Customers State.");
		String state = sc.next();
		System.out.println("Enter The Customers Pincode.");
		int pincode = sc.nextInt();
		Address addobj = new Address(city, state, pincode);

		Customer customerobj = new Customer(custId, custName, accobj, addobj);

		custlist.add(customerobj);	
		System.out.println("Account created for " + custName);
	}

	public void displayAllAccounts() {
		if (custlist.isEmpty()) {
			System.out.println("No accounts found!");
			return;
		}

		System.out.println("\n=== ALL ACCOUNTS ===");
		System.out.println("ID | Name | Account Details | City");
		System.out.println("---------------------------------");

		for (Customer cust : custlist) {
			System.out.println(cust.getCustId() + " | " + 
					cust.getCustName() + " | " + 
					cust.getCustAcc().toString()+ " | " + 
					cust.getCustAddr().toString());
		}
	}

	private void displayCustomerDetails(Customer cust) {
		System.out.println("\n✅ ═══════════════════════════════════════════════");
		System.out.println("         CUSTOMER DETAILS FOUND");
		System.out.println("   ═══════════════════════════════════════════════");
		System.out.printf("   ID     : %d%n", cust.getCustId());
		System.out.printf("   Name   : %s%n", cust.getCustName());
		System.out.printf("   Account: %s%n", cust.getCustAcc());
		System.out.printf("   Address: %s%n", cust.getCustAddr());
		System.out.println("   ═══════════════════════════════════════════════");
	}


	public void searchAccount() {
		String str = null;
		if (custlist.isEmpty()) {
			System.out.println("No accounts found!");
			return;
		}
		do
		{
			System.out.println("\nSEARCH BY:");
			System.out.println("1. Customer ID");
			System.out.println("2. Account Number"); 
			System.out.println("3. Customer Name");
			System.out.print("Choose (1-3): ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				searchByCustomerId();
				break;
			case 2:
				searchByAccountNo();
				break;
			case 3:
				sc.nextLine(); // Clear buffer
				searchByName(); 
				break;
			default:
				System.out.println("Invalid choice!");
				return;
			}

			System.out.println("Do You Want To Continue With Search.\nEnter Yes Or No.");
			str = sc.next();
		}while(str.equalsIgnoreCase("yes")||str.equalsIgnoreCase("yess"));
	}

	private void searchByCustomerId() {
		System.out.println("Enter The Customer Id You Want To Serach.");
		int custId = sc.nextInt();
		boolean found = false;

		for(Customer customer : custlist)
		{
			if(customer.getCustId() == custId)
			{
				displayCustomerDetails(customer);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Customer ID not found!");
		}
	}

	private void searchByAccountNo() {

		System.out.println("Enter The Account Number You Want To Search.");
		int accNo  = sc.nextInt();
		boolean found = false;
		for(Customer customer : custlist)
		{
			if(customer.getCustAcc().getAccNo() == accNo)
			{
				displayCustomerDetails(customer);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Account Number not found!");
		}
	}

	private void searchByName() {
		System.out.print("Enter name (partial OK): ");
		String name = sc.nextLine().toLowerCase().trim();

		boolean foundAny = false;
		for (Customer cust : custlist) {
			if (cust.getCustName().toLowerCase().contains(name)) {
				displayCustomerDetails(cust);
				foundAny = true;
			}
		}

		if (!foundAny) {
			System.out.println("No customers found with name: '" + name + "'");
		}

	}




}
