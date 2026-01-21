package Entity;

import bankExceptions.InsufficientFundsException;
import bankExceptions.InvalidAmountException;

public interface BankAccount {
	
	public int getAccNo();
	double getBalance();
	void deposit(double amount) throws InvalidAmountException;
	void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException;
}
