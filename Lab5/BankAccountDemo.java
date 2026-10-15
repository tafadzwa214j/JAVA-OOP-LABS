
package Lab5;

class BankAccount {

    void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount);
    }
}

class SavingsAccount extends BankAccount {

    @Override
    void withdraw(double amount) {
        System.out.println("Savings account withdrawal: $" + amount);
    }
}

class CurrentAccount extends BankAccount {

    @Override
    void withdraw(double amount) {
        System.out.println("Current account withdrawal: $" + amount);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account;

        account = new SavingsAccount();
        account.withdraw(100);

        account = new CurrentAccount();
        account.withdraw(200);
    }
}

