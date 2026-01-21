package bankExceptions;

public class InsufficientFundsException extends Exception{
	
	private double attemptedAmount;
	private double availableBalance;
	
	public InsufficientFundsException(double attempted, double balance)
	{
		
		super("Insufficient funds! Attempted: ₹" + 
	              String.format("%.2f", attempted) + ", Available: ₹" + String.format("%.2f", balance));
		
		this.attemptedAmount = attempted;
		this.availableBalance = balance;
	}
	
	

}
