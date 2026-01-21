package enums;

public enum AccountType {
    SAVINGS("Savings Account", true),
    CURRENT("Current Account", false);
    
    private final String displayName;
    private final boolean earnsInterest;
    
    AccountType(String displayName, boolean earnsInterest) {
        this.displayName = displayName;
        this.earnsInterest = earnsInterest;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public boolean earnsInterest() {
        return earnsInterest;
    }
    
    @Override
    public String toString() {
        return displayName;
    }
}
