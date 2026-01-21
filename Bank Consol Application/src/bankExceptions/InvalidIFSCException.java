package bankExceptions;

public class InvalidIFSCException extends Exception
{
	public InvalidIFSCException(String ifsc)
	{
		super("Invalid IFSC :"+ifsc +". Format : [A-Z]{4}0[A-Z]{6}");
	}
}
