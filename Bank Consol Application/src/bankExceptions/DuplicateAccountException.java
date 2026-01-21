package bankExceptions;

public class DuplicateAccountException extends Exception{
	
	public DuplicateAccountException(int accNo)
	{
		super("Account No "+accNo +"  Already Exist.");
	}

}
