
package Lab3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccount {

    private final String accountNumber;
    private String ownerName;
    private double balance;
    private final List<String> transactions = new ArrayList<>();

    // Constructor
    public BankAccount(String accountNumber, String ownerName,
                       double openingBalance) {

        if (openingBalance < 0) {
            throw new IllegalArgumentException(
                    "Opening balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        setOwnerName(ownerName);
        this.balance = openingBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
        
    }
    public List<String> getTransactions() {
    return Collections.unmodifiableList(
            new ArrayList<>(transactions));
}

    // Setter with validation
    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException(
                    "Owner name required");
        }

        this.ownerName = ownerName.trim();
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit must be positive");
        }

        balance += amount;
transactions.add("Deposited: " + amount);
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal must be positive");
        }

        if (amount > balance) {
            return false;
        }

        balance -= amount;
transactions.add("Withdrew: " + amount);
return true;
    }

    // Display account details
    @Override
    public String toString() {
        return String.format("%s [%s] balance: %.2f",
                accountNumber, ownerName, balance);
    }
}
