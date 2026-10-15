
package Lab7;

class InsufficientFundsException extends Exception {

    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient funds. Balance: $" + balance
            );
        }

        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccountExceptionDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);

        try {
            account.deposit(50);
            account.withdraw(30);
            account.withdraw(200);

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final balance: $" + account.getBalance());
    }
}


