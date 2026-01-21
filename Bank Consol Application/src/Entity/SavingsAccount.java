package Entity;

import enums.AccountType;

public class SavingsAccount extends Account {
    
    // 1. Fields (private, final)
    private final double interestRate;
    
    // 2. Constructor with validation
    public SavingsAccount(int accNo, String ifscCode, double balance, AccountType accType, double interestRate) {
        super(accNo, ifscCode, balance, accType);
        if (interestRate < 0 || interestRate > 20) {
            throw new IllegalArgumentException("Interest rate must be 0-20%: " + interestRate);
        }
        this.interestRate = interestRate;
    }
    
    // 3. Business Getters
    public double getInterestRate() {
        return interestRate;
    }
    
    // 4. Interest Calculation (Monthly simple interest)
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100) * (1.0 / 12); // Monthly interest
    }
    
    // 5. Professional toString()
    @Override
    public String toString() {
        return super.toString() + ", Rate=" + String.format("%.2f%%", interestRate);
    }
}
