package Entity;

import enums.AccountType;

public class CurrentAccount extends Account {
    
    // 1. Fields (private, final where appropriate)
    private final String compName;
    
    // 2. Constructor
    public CurrentAccount(int accNo, String ifscCode, double balance, AccountType accType, String compName) {
        super(accNo, ifscCode, balance, accType);
        this.compName = compName != null ? compName.trim() : "Unknown Company";
    }
    
    // 3. Business Getters
    public String getCompName() {
        return compName;
    }
    
    // 4. Interest Calculation (Current accounts = 0% interest)
    @Override
    public double calculateInterest() {
        return 0.0; // Current accounts don't earn interest
    }
    
    // 5. toString() - Professional format
    @Override
    public String toString() {
        return super.toString() + ", Company=" + compName;
    }
}
