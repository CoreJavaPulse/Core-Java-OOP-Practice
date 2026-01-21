package bankExceptions;

public class AccountNotFoundException  extends Exception{

	public AccountNotFoundException(int idoraccNO) {
		super("Account/Customer "+idoraccNO +" Not Found");
	}
}
