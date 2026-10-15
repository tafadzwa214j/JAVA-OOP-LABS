

import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S001", 500.00, 100.00));
        accounts.add(new CurrentAccount("C001", 50.00, 100.00));

        double[] withdrawals = {450.00, 120.00};

        for (int i = 0; i < accounts.size(); i++) {

            Account account = accounts.get(i);

            System.out.println("\nAccount: " + account.accountNumber);
            System.out.println("Starting balance: $" + account.getBalance());

            account.withdraw(withdrawals[i]);

            account.endOfMonth();

            System.out.println("Final balance: $" + account.getBalance());
        }
    }
}
