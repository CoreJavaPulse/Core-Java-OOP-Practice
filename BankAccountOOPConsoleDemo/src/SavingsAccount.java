
public class SavingsAccount extends Account{

	private double intrestRate;

	public SavingsAccount(int accNumber, double accbal, String accType, double intrestRate) {
		super(accNumber, accbal, accType);
		this.intrestRate = intrestRate;
	}

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}
	
	
}
