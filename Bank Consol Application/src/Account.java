
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


	public void setBalance(double accbal) {
		this.balance = accbal;
	}

	public AccountType getAccType() {
		return accType;
	}

	public void setAccType(AccountType accType) {
		this.accType = accType;
	}
	 @Override
	    public String toString() {
	        return "AccNo=" + accNo + 
	               ", IFSC=" + ifscCode + 
	               ", Bal=₹" + String.format("%.2f", balance) + 
	               ", Type=" + accType;
	    }

	
}