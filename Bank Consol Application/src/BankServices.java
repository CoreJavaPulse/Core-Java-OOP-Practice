import java.util.ArrayList;
import java.util.Iterator;
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
		double accBal = sc.nextDouble();
		System.out.println("Enter The Account Type(Savings/Current)");
		String accType = sc.next();
		if(accType.equalsIgnoreCase("savings")) {
			System.out.print("Enter Interest Rate: ");
			double rate = sc.nextDouble();
			accobj = new SavingsAccount(accNo, ifsccode, accBal, accType, rate);
		}
		else if(accType.equalsIgnoreCase("current")) {
			System.out.print("Enter Company Name: ");
			String company = sc.next();
			accobj = new CurrentAcount(accNo, ifsccode, accBal, accType, company);
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
	}
	public void displayAllAccounts() {
		for(Customer customer : custlist)
		{
			System.out.println(customer.getCustId());
		}
		
	}
	
}
