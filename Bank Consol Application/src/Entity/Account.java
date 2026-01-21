package Entity;

import java.util.ArrayList;
import java.util.List;

import bankExceptions.InsufficientFundsException;
import bankExceptions.InvalidAmountException;
import enums.AccountType;
import enums.TransactionType;

public abstract class Account implements BankAccount{

	private int accNo;
	private String ifscCode;
	private double balance;
	private AccountType accType;
	private List<Transaction> transactions = new ArrayList<>();

	public Account(int accNo, String ifscCode, double balance, AccountType accType) {
		super();
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.balance = balance;
		this.accType = accType;
	}
	@Override
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccType() {
		return accType;
	}

	public void setAccType(AccountType accType) {
		this.accType = accType;
	}

	@Override
	public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException(amount);
        
        double oldBalance = balance;
        balance += amount;
        
        transactions.add(new Transaction(TransactionType.DEPOSIT, amount, balance, 
            "Deposit to A/c " + getAccNo()));
        System.out.println("✅ Deposited ₹" + String.format("%.2f", amount));
    }


	@Override
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) throw new InvalidAmountException(amount);
        if (balance < amount) throw new InsufficientFundsException(amount, balance);
        
        balance -= amount;
        transactions.add(new Transaction(TransactionType.WITHDRAWAL, amount, balance,
            "Withdrawal from A/c " + getAccNo()));
        System.out.println("✅ Withdrew ₹" + String.format("%.2f", amount));
    }

	@Override
	public String toString() {
		return "AccNo=" + accNo + 
				", IFSC=" + ifscCode + 
				", Bal=₹" + String.format("%.2f", balance) + 
				", Type=" + accType;
	}

	public abstract double calculateInterest();

	public final void addInterestToBalance() {
		double interest = calculateInterest();
		balance += interest;
		System.out.println("Interest added: ₹" + interest);
	}
}