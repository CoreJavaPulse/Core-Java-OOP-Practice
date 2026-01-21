package Entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import enums.TransactionType;

public class Transaction {
    
    // 1. Fields (private, final everywhere)
    private final int transactionId;
    private static int nextId = 1;
    private final LocalDateTime timestamp;
    private final TransactionType type;
    private final double amount;
    private final double balanceAfter;
    private final String description;
    
    // 2. Constructor with validation
    public Transaction(TransactionType type, double amount, double balanceAfter, String description) {
        if (type == null) throw new IllegalArgumentException("Transaction type required");
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive: " + amount);
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description required");
        }
        
        this.transactionId = Transaction.nextId++;
        this.timestamp = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.description = description.trim();
    }
    
    // 3. Business Getters
    public int getTransactionId() {
        return transactionId;
    }
    
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
    public TransactionType getType() {
        return type;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public double getBalanceAfter() {
        return balanceAfter;
    }
    
    public String getDescription() {
        return description;
    }
    
    // 4. Professional toString() - Table formatted
    @Override
    public String toString() {
        return String.format("[%s] ID:%-3d %8s ₹%10.2f | Bal:₹%10.2f | %s",
            timestamp.format(DateTimeFormatter.ofPattern("dd-MM HH:mm")),
            transactionId, type, amount, balanceAfter, description);
    }
}
