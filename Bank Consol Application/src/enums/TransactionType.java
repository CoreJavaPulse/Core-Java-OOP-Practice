package enums;

public enum TransactionType {
    DEPOSIT("Deposit", true),
    WITHDRAWAL("Withdrawal", true),
    TRANSFER_IN("Transfer In", true),
    TRANSFER_OUT("Transfer Out", true);
    
    private final String displayName;
    private final boolean affectsBalance;
    
    TransactionType(String displayName, boolean affectsBalance) {
        this.displayName = displayName;
        this.affectsBalance = affectsBalance;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public boolean affectsBalance() {
        return affectsBalance;
    }
    
    @Override
    public String toString() {
        return displayName;
    }
}
