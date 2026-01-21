package Entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import enums.TransactionType;

public class Transaction {
	private int transactionId;
	private static int nextId = 1;

	private LocalDateTime timestamp;
	private TransactionType type;  // DEPOSIT, WITHDRAWAL, TRANSFER
	private double amount;
	private double balanceAfter;
	private String description;

	public Transaction(TransactionType type, double amount, double balanceAfter, String description) {
		this.transactionId = nextId++;
		this.timestamp = LocalDateTime.now();
		this.type = type;
		this.amount = amount;
		this.balanceAfter = balanceAfter;
		this.description = description;
	}

	@Override
	public String toString() {
		return String.format("[%s] ID:%-3d %8s ₹%-8.2f | Bal:₹%-8.2f | %s",
				timestamp.format(DateTimeFormatter.ofPattern("dd-MM HH:mm")),
				transactionId, type, amount, balanceAfter, description);
	}
}

