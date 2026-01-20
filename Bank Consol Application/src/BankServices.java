import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankServices {

	Scanner sc = new Scanner(System.in);
	List<Customer> custlist = new ArrayList<Customer>();
	BankAccount accobj;

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
				break;
			}

			System.out.println("Do You Want To Continue With Search.\nEnter Yes Or No.");
			str = sc.next();
		}while(str.equalsIgnoreCase("yes"));
	}

	private void searchByCustomerId() {
		System.out.println("Enter The Customer Id You Want To Search.");
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

	public void transaction() {
		String str  = null;
		Boolean flag = false;
		if(custlist.isEmpty()) {
			System.out.println("No Customers!");
			return;
		}

		do {
			System.out.print("Enter Customer ID: ");
			int id = sc.nextInt();
			sc.nextLine(); 
			Customer cust = findCustomerById(id);
			if (cust == null)
			{ 
				System.out.println("Customer not found!"); 
				continue; 
			}
			else
			{
				System.out.println("Account: " + cust.getCustAcc());	
				System.out.println("1:Deposit\n2:Withdraw");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter The Amount To Be Deposited To Customer AccountNo :"+cust.getCustAcc().getAccNo());
					double deposit = sc.nextDouble();
					flag = cust.getCustAcc().deposit(deposit);
					if(flag == true)
						System.out.println("Transaction Successful\nAmount Deposited");
					else
						System.out.println("Transaction UnSuccessful\nPlease Try Later.");
					break;
				case 2:
					System.out.println("Enter The Amount To Be WithDraw from Customer AccountNo :"+cust.getCustAcc().getAccNo());
					double withdraw = sc.nextDouble();
					flag=cust.getCustAcc().withdraw(withdraw);
					if(flag == true)
						System.out.println("Transaction Successful\nAmount Withdrawed");
					else
						System.out.println("Transaction UnSuccessful\nPlease Try Later.");
					break;
				default:
					System.out.println("Invalid Choice!\nTransaction Failed!!! ");
					return;
				}
			}

			System.out.println("Do you Want To Continue.\n Yes Or No");
			str = sc.next();
		}while(str.equalsIgnoreCase("yes"));

	}

	private Customer findCustomerById(int id)
	{
		for (Customer c : custlist) 
			if (c.getCustId() == id)
				return c;
		return null;
	}

	public void updateAccount() {
		if (custlist.isEmpty()) 
		{ 
			System.out.println("No accounts!"); 
			return; 
		}
		System.out.print("Enter Customer ID: ");
		int id = sc.nextInt();
		Customer cust = findCustomerById(id);
		if (cust == null) 
		{ 
			System.out.println("Not found!"); 
			return; 
		}
		displayCustomerDetails(cust);
		System.out.println("Update: 1.Name 2.Address");
		int opt = sc.nextInt();
		switch (opt) {
		case 1:
			System.out.print("New name: ");
			sc.nextLine(); 
			cust.setCustName(sc.nextLine());
			break;
		case 2:
			sc.nextLine(); 
			System.out.print("New city: "); 
			String city = sc.nextLine();
			System.out.print("New state: "); 
			String state = sc.nextLine();
			System.out.print("New pin: "); 
			int pin = sc.nextInt();
			cust.setCustAddr(new Address(city, state, pin));
			break;
		}
		System.out.println("Updated Customer Details!");
		displayCustomerDetails(cust);
	}

	public void deleteAccount() {
		if (custlist.isEmpty())
		{ 
			System.out.println("No accounts!"); 
			return; 
		}
		System.out.print("Enter Customer ID: ");
		int id = sc.nextInt();
		Customer cust = findCustomerById(id);
		if (cust == null) 
		{ 
			System.out.println("Not found!"); 
			return; 
		}
		displayCustomerDetails(cust);
		System.out.print("Confirm Delete (yes/no): ");
		sc.nextLine(); 
		if (sc.nextLine().equalsIgnoreCase("yes"))
		{
			custlist.remove(cust);
			System.out.println("Deleted successfully!");
		} 
		else 
		{
			System.out.println("Cancelled.");
		}
	}

	public void addInterestToAllAccounts()
	{
		for(Customer cust : custlist) 
		{
			Account acc = (Account) cust.getCustAcc();  
			acc.addInterestToBalance();  
		}
	}
}
