
public class SavingsAccount extends Account {
	
	private double interestRate;

	public SavingsAccount(int accNo, String ifscCode, double balance, AccountType accType, double interestRate) {
		super(accNo, ifscCode, balance, accType);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
    public String toString() {
        return super.toString() + ", Rate=" + String.format("%.2f%%", interestRate);
    }
	
}
