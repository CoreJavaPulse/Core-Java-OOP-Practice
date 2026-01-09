import java.util.Arrays;
import java.util.Scanner;

public class BankOp {

	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	Customer custArr[] = new Customer[0];
	public Customer[] createAccount()
	{
		System.out.println("------------------Customer Details------------------");
		System.out.println("Enter Customer Id.");
		int custId = sc.nextInt();
		System.out.println("Enter Customer Name.");
		String custname = sc.next();

		System.out.println("------------------Customer Address Details------------------");

		System.out.println("Enter Customer City");
		String city = sc.next();
		System.out.println("Enter Customer State");
		String state = sc.next();
		System.out.println("Enter Customer Pincode");
		int custPincode = sc.nextInt();

		Address addObj = new Address(city, state, custPincode);
		System.out.println("------------------Account Details------------------");
		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();
		System.out.print("Enter Initial Balance: ");
		double accbal = sc.nextDouble();
		System.out.print("Enter Account Type (savings/current): ");
		String accType = sc.next();

		Account acc = null;
		if (accType.equalsIgnoreCase("savings")) {
			System.out.print("Enter Interest Rate: ");
			double rate = sc.nextDouble();
			acc = new SavingsAccount(accNo, accbal, accType, rate);
		} else if (accType.equalsIgnoreCase("current")) {
			System.out.print("Enter Company Name: ");
			String company = sc.next();
			acc = new CurrentAccount(accNo, accbal, accType, company);
		} else {
			System.out.println("Invalid type, using basic Account.");
			acc = new Account(accNo, accbal, accType);
		}

		Customer custobj = new Customer(custId, custname, addObj, acc);
		custArr = Arrays.copyOf(custArr,cnt+1);
		custArr[cnt]=custobj;
		cnt++;
		System.out.println("Account Created Successfully: ");
		System.out.println("Total Customers :"+cnt);
		return custArr;
	}

	void displaycustomeracc(Customer[] cust) {
		// TODO Auto-generated method stub
		if(cust != null && cust.length > 0)
		{
			System.out.println("-------------------Customer Details----------------------");
			for(int i = 0;i<cust.length;i++)
			{
				System.out.println("Customer "+i+1);
				System.out.println("Customer Id: " +cust[i].getCustId());
				System.out.println("Customer Name: " +cust[i].getCustName());
				System.out.println("-----------------Customer Address Details---------------");
				System.out.println("Customer City: " +cust[i].getCustAddr().getCity());
				System.out.println("Customer State: " +cust[i].getCustAddr().getState());
				System.out.println("Customer Pin Code: " +cust[i].getCustAddr().getPincode());

				System.out.println("----------------Customer Account Details--------------- ");
				System.out.println("Account Number :" + cust[i].getCustAcc().getAccNumber());
				System.out.println("Account Type :"+ cust[i].getCustAcc().getAccType());
				System.out.println("Account Balance: $" + cust[i].getCustAcc().getAccbal());
				if (cust[i].getCustAcc() instanceof CurrentAccount) {
				    CurrentAccount ca = (CurrentAccount) cust[i].getCustAcc();
				    System.out.println("Company Name: " + ca.getCompanyName());
				} else if (cust[i].getCustAcc() instanceof SavingsAccount) {
				    SavingsAccount sa = (SavingsAccount) cust[i].getCustAcc();
				    System.out.println("Interest Rate: " + sa.getIntrestRate());
				}
			}
			System.out.println("Total Number Of Customers :"+cnt);
		}
		else
			System.out.println("No Customers To Display!");
	}
	
	public int findById(int custid)
	{
		for(int i = 0;i<cnt;i++)
		{
			if(custArr[i].getCustId()==custid)
				return i;
		}
		return -1;
	}

	public void searchCustomer(int custId) {
		// TODO Auto-generated method stub
		int index = findById(custId);
		if(index == -1)
		{
			System.out.println("Customer Id Does Not Exsit!");
			return;
		}
		System.out.println("Customer Id Found.");
		System.out.println("-------------------Customer Details----------------------");
		System.out.println("Customer Id: " +custArr[index].getCustId());
		System.out.println("Customer Name: " +custArr[index].getCustName());

		System.out.println("-----------------Customer Address Details---------------");
		System.out.println("Customer City: " +custArr[index].getCustAddr().getCity());
		System.out.println("Customer State: " +custArr[index].getCustAddr().getState());
		System.out.println("Customer Pin Code: " +custArr[index].getCustAddr().getPincode());

		System.out.println("----------------Customer Account Details--------------- ");
		System.out.println("Account Number :" + custArr[index].getCustAcc().getAccNumber());
		System.out.println("Account Type :"+ custArr[index].getCustAcc().getAccType());
		System.out.println("Account Balance: $" + custArr[index].getCustAcc().getAccbal());	
	}
	
	
}
