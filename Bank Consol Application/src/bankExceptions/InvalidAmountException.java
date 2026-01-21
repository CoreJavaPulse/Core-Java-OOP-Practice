package bankExceptions;

public class InvalidAmountException extends Exception{

	public InvalidAmountException(double amount) {
		super("Invalid Amount :"+ amount + ". Must be > 0");
	}
	
	

}
