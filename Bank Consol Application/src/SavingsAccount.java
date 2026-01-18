
public class SavingsAccount extends Account {
	
	private double interestRate;

	public SavingsAccount(int accNo, String ifscCode, double accbal, AccountType accType, double interestRate) {
		super(accNo, ifscCode, accbal, accType);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	
}
