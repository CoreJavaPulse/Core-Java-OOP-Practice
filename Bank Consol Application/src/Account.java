
public class Account {
	
	private int accNo;
	private String ifscCode;
	private double balance;
	private AccountType accType;
	
	public Account(int accNo, String ifscCode, double balance, AccountType accType) {
		super();
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.balance = balance;
		this.accType = accType;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccType() {
		return accType;
	}

	public void setAccType(AccountType accType) {
		this.accType = accType;
	}
	
	public boolean deposit(double amount)
	{
		if (amount <= 0)
		{
	        System.out.println("Invalid deposit amount!");
	        return false;
	    }
		balance = balance+amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
	    if (amount <= 0 || balance < amount) {
	        System.out.println("Invalid withdrawal!");
	        return false;
	    }
	    balance -= amount;
	    System.out.println("Withdrew ₹" + String.format("%.2f", amount));
	    return true;
	}
	
	 @Override
	    public String toString() {
	        return "AccNo=" + accNo + 
	               ", IFSC=" + ifscCode + 
	               ", Bal=₹" + String.format("%.2f", balance) + 
	               ", Type=" + accType;
	    }	
}