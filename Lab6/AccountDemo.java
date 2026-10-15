
package Lab6;

abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    abstract double monthlyFee();
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double monthlyFee() {
        return 5;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    double monthlyFee() {
        return 10;
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(100);
        Account current = new CurrentAccount(200);

        savings.deposit(50);
        current.deposit(100);

        System.out.println("Savings balance: $" + savings.balance);
        System.out.println("Savings monthly fee: $" + savings.monthlyFee());

        System.out.println("Current balance: $" + current.balance);
        System.out.println("Current monthly fee: $" + current.monthlyFee());
    }
}

