package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Account;
import Entity.Address;
import Entity.BankAccount;
import Entity.CurrentAccount;
import Entity.Customer;
import Entity.SavingsAccount;
import bankExceptions.AccountNotFoundException;
import bankExceptions.InsufficientFundsException;
import bankExceptions.InvalidAmountException;
import enums.AccountType;

public class BankServices {
    
    // 1. Fields
    private final Scanner sc;
    private final List<Customer> custlist;
    private BankAccount accobj;
    
    // 2. Constructor
    public BankServices() {
        this.sc = new Scanner(System.in);
        this.custlist = new ArrayList<>();
    }
    
    // 3. Core Banking Operations (Public)
    public void addAccount() {
        try {
            int custId = getIntInput("Enter Customer ID: ");
            String custName = getStringInput("Enter Customer Name: ");
            
            int accNo = getIntInput("Enter Account Number: ");
            String ifscCode = getStringInput("Enter IFSC Code: ");
            double balance = getDoubleInput("Enter Initial Balance: ₹");
            String accType = getStringInput("Account Type (Savings/Current): ");
            
            BankAccount account = createAccount(accNo, ifscCode, balance, accType);
            Address address = getAddressInput();
            
            Customer customer = new Customer(custId, custName, account, address);
            custlist.add(customer);
            System.out.println("✅ Account created for " + custName);
            
        } catch (Exception e) {
            System.out.println("❌ Error creating account: " + e.getMessage());
        }
    }
    
    public void displayAllAccounts() {
        if (custlist.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        
        System.out.println("\n=== ALL ACCOUNTS ===");
        System.out.println("ID | Name | Account Details | City");
        System.out.println("-------------------------------------------------");
        
        for (Customer cust : custlist) {
            System.out.printf("%-2d | %-12s | %-35s | %s%n", 
                cust.getCustId(), cust.getCustName(), 
                cust.getCustAcc(), cust.getCustAddr().getCity());
        }
    }
    
    public void transaction() {
        if (custlist.isEmpty()) {
            System.out.println("No Customers!");
            return;
        }
        
        String str;
        do {
            try {
                int id = getIntInput("Enter Customer ID: ");
                Customer cust = findCustomerById(id);
                
                System.out.println("\nAccount: " + cust.getCustAcc());
                System.out.println("1:Deposit  2:Withdraw");
                int choice = getIntInput("Choose (1-2): ");
                
                switch (choice) {
                    case 1 -> performDeposit(cust);
                    case 2 -> performWithdraw(cust);
                    default -> System.out.println("Invalid choice!");
                }
            } catch (AccountNotFoundException e) {
                System.out.println("❌ " + e.getMessage());
            }
            
            str = getStringInput("Continue? (yes/no): ");
        } while (str.equalsIgnoreCase("yes"));
    }
    
    public void viewStatement() {
        if (custlist.isEmpty()) {
            System.out.println("No accounts!");
            return;
        }
        
        try {
            int custId = getIntInput("Enter Customer ID: ");
            Customer cust = findCustomerById(custId);
            Account acc = (Account) cust.getCustAcc();
            
            String countStr = getStringInput("Last how many? (10/all): ");
            int count = countStr.equalsIgnoreCase("all") ? 50 : Integer.parseInt(countStr);
            acc.printStatement(count);
        } catch (AccountNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Invalid input!");
        }
    }
    
    public void updateAccount() {
        if (custlist.isEmpty()) {
            System.out.println("No accounts!");
            return;
        }
        System.out.println("⚠️ Update feature disabled - immutable design");
    }
    
    public void deleteAccount() {
        if (custlist.isEmpty()) {
            System.out.println("No accounts!");
            return;
        }
        System.out.println("⚠️ Delete feature disabled - production safety");
    }
    
    public void addInterestToAllAccounts() {
        if (custlist.isEmpty()) {
            System.out.println("No accounts!");
            return;
        }
        
        System.out.println("\n=== ADDING INTEREST TO ALL ACCOUNTS ===");
        for (Customer cust : custlist) {
            try {
                Account acc = (Account) cust.getCustAcc();
                acc.addInterestToBalance();
            } catch (Exception e) {
                System.out.println("Error adding interest: " + e.getMessage());
            }
        }
    }
    
    // 4. Search Operations
    public void searchAccount() {
        if (custlist.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        
        String continueSearch;
        do {
            System.out.println("\n🔍 SEARCH BY:");
            System.out.println("1. Customer ID  2. Account Number  3. Name");
            int choice = getIntInput("Choose (1-3): ");
            
            switch (choice) {
                case 1 -> searchByCustomerId();
                case 2 -> searchByAccountNo();
                case 3 -> searchByName();
                default -> System.out.println("Invalid choice!");
            }
            
            continueSearch = getStringInput("Continue search? (yes/no): ");
        } while (continueSearch.equalsIgnoreCase("yes"));
    }
    
    // 5. Private Helper Methods
    private Customer findCustomerById(int id) throws AccountNotFoundException {
        for (Customer c : custlist) {
            if (c.getCustId() == id) return c;
        }
        throw new AccountNotFoundException(id);
    }
    
    private BankAccount createAccount(int accNo, String ifscCode, double balance, String accType) {
        if (accType.equalsIgnoreCase("savings")) {
            double rate = getDoubleInput("Enter Interest Rate (%): ");
            return new SavingsAccount(accNo, ifscCode, balance, AccountType.SAVINGS, rate);
        } else {
            String company = getStringInput("Enter Company Name: ");
            return new CurrentAccount(accNo, ifscCode, balance, AccountType.CURRENT, company);
        }
    }
    
    private Address getAddressInput() {
        String city = getStringInput("Enter City: ");
        String state = getStringInput("Enter State: ");
        int pincode = getIntInput("Enter Pincode: ");
        return new Address(city, state, pincode);
    }
    
    private void performDeposit(Customer cust) {
        try {
            double amount = getDoubleInput("Enter deposit amount: ₹");
            cust.getCustAcc().deposit(amount);
            System.out.println("✅ Deposit successful");
        } catch (InvalidAmountException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
    
    private void performWithdraw(Customer cust) {
        try {
            double amount = getDoubleInput("Enter withdrawal amount: ₹");
            cust.getCustAcc().withdraw(amount);
            System.out.println("✅ Withdrawal successful");
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
    
    private void searchByCustomerId() {
        try {
            int custId = getIntInput("Enter Customer ID: ");
            Customer cust = findCustomerById(custId);
            displayCustomerDetails(cust);
        } catch (AccountNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
    
    private void searchByAccountNo() {
        int accNo = getIntInput("Enter Account Number: ");
        boolean found = false;
        
        for (Customer cust : custlist) {
            if (cust.getCustAcc().getAccNo() == accNo) {
                displayCustomerDetails(cust);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("❌ Account Number not found!");
        }
    }
    
    private void searchByName() {
        sc.nextLine(); // Clear buffer
        String name = getStringInput("Enter name (partial OK): ").toLowerCase().trim();
        
        boolean foundAny = false;
        for (Customer cust : custlist) {
            if (cust.getCustName().toLowerCase().contains(name)) {
                displayCustomerDetails(cust);
                foundAny = true;
            }
        }
        if (!foundAny) {
            System.out.println("❌ No customers found with name: '" + name + "'");
        }
    }
    
    private void displayCustomerDetails(Customer cust) {
        System.out.println("\n✅ ═══════════════════════════════════════════════");
        System.out.println("         CUSTOMER DETAILS FOUND");
        System.out.println("   ═══════════════════════════════════════════════");
        System.out.printf("   ID     : %d%n", cust.getCustId());
        System.out.printf("   Name   : %s%n", cust.getCustName());
        System.out.printf("   Account: %s%n", cust.getCustAcc());
        System.out.printf("   Address: %s%n", cust.getCustAddr());
        System.out.println("   ═══════════════════════════════════════════════");
    }
    
    // 6. Input Helper Methods
    private int getIntInput(String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }
    
    private double getDoubleInput(String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }
    
    private String getStringInput(String prompt) {
        System.out.print(prompt);
        sc.nextLine(); // Clear buffer
        return sc.nextLine().trim();
    }
}
