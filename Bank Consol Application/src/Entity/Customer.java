package Entity;

public class Customer {
    
    // 1. Fields (private, final everywhere)
    private final int custId;
    private final String custName;
    private final BankAccount custAcc;
    private final Address custAddr;
    
    // 2. Constructor with validation
    public Customer(int custId, String custName, BankAccount custAcc, Address custAddr) {
        if (custId <= 0) throw new IllegalArgumentException("Customer ID must be positive");
        if (custName == null || custName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty");
        }
        if (custAcc == null) throw new IllegalArgumentException("Account required");
        if (custAddr == null) throw new IllegalArgumentException("Address required");
        
        this.custId = custId;
        this.custName = custName.trim();
        this.custAcc = custAcc;
        this.custAddr = custAddr;
    }
    
    // 3. Getters only (immutable - no setters)
    public int getCustId() {
        return custId;
    }
    
    public String getCustName() {
        return custName;
    }
    
    public BankAccount getCustAcc() {
        return custAcc;
    }
    
    public Address getCustAddr() {
        return custAddr;
    }
    
    // 4. Professional toString()
    @Override
    public String toString() {
        return String.format("ID:%-4d %-15s | %-35s | %s", 
            custId, custName, custAcc, custAddr);
    }
    
    // 5. equals() + hashCode() for uniqueness
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Customer)) return false;
        
        Customer other = (Customer) obj;
        return custId == other.custId;
    }
    
    @Override
    public int hashCode() {
        return custId;
    }
}
