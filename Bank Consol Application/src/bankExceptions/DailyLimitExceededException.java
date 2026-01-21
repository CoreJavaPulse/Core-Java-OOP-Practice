package bankExceptions;

public class DailyLimitExceededException extends Exception{
	
	public DailyLimitExceededException()
	{
		super("Daily Transation Linit is ₹50,000 exceeded");
	}

}
