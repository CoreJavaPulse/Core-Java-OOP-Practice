
public interface BankAccount {
	public int getAccNo();
	double getBalance();
	boolean deposit(double amount);
	boolean withdraw(double amount);
}
