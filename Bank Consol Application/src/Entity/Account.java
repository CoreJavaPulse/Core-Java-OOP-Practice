package Entity;

import java.util.ArrayList;
import java.util.List;
import bankExceptions.InsufficientFundsException;
import bankExceptions.InvalidAmountException;
import enums.AccountType;
import enums.TransactionType;
import Entity.Transaction;  // ADD this import at top


public abstract class Account implements BankAccount {
    
    // 1. Fields (private, final first)
    private final int accNo;
    private final String ifscCode;
    private double balance;
    private final AccountType accType;
    private final List<Transaction> transactions = new ArrayList<>();
    
    // 2. Constructor
    public Account(int accNo, String ifscCode, double balance, AccountType accType) {
        this.accNo = accNo;
        this.ifscCode = ifscCode;
        this.balance = Math.max(0, balance); // Prevent negative initial balance
        this.accType = accType;
    }
    
    // 3. Interface Methods (BankAccount)
    @Override
    public int getAccNo() {
        return accNo;
    }
    
    @Override
    public double getBalance() {
        return balance;
    }
    
    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException(amount);
        
        balance += amount;
        transactions.add(new Transaction(TransactionType.DEPOSIT, amount, balance, 
            "Deposit to A/c " + accNo));
        System.out.println("✅ Deposited ₹" + String.format("%.2f", amount));
    }
    
    @Override
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) throw new InvalidAmountException(amount);
        if (balance < amount) throw new InsufficientFundsException(amount, balance);
        
        balance -= amount;
        transactions.add(new Transaction(TransactionType.WITHDRAWAL, amount, balance,
            "Withdrawal from A/c " + accNo));
        System.out.println("✅ Withdrew ₹" + String.format("%.2f", amount));
    }
    
    // 4. Getters/Setters (Business fields)
    public String getIfscCode() {
        return ifscCode;
    }
    
    public AccountType getAccType() {
        return accType;
    }
    
    // 5. Transaction Management
    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions); // Defensive copy
    }
    
    public void printStatement(int count) {
        System.out.println("\n=== LAST " + count + " TRANSACTIONS ===");
        System.out.println("Date      | Type      | Amount   | Balance  | Desc");
        System.out.println("------------------------------------------------");
        
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        
        int start = Math.max(0, transactions.size() - count);
        for (int i = start; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }
    
    // 6. Interest Management (Abstract method + utility)
    public abstract double calculateInterest();
    
    public final void addInterestToBalance() {
        double interest = calculateInterest();
        if (interest > 0) {
            balance += interest;
            transactions.add(new Transaction(TransactionType.DEPOSIT, interest, balance,
                "Interest credited to A/c " + accNo));
            System.out.println("✅ Interest added: ₹" + String.format("%.2f", interest));
        }
    }
    
    // 7. toString() - Last
    @Override
    public String toString() {
        return String.format("AccNo=%d, IFSC=%s, Bal=₹%.2f, Type=%s", 
            accNo, ifscCode, balance, accType);
    }
}
