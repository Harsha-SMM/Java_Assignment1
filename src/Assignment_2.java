
public class Assignment_2 {
    public static double balance;

    public static void main(String[] args) {
        Account account = new Account();
        balance = account.getAccountBalance();
        account.setAccountBalance(balance);
    }
}

abstract class BankAccount {
    public abstract double getAccountBalance();

    public abstract void setAccountBalance(double account_balance);
}

class Account extends BankAccount {
    public double getAccountBalance() {
        double balance = 25000;
        return balance;
    }

    public void setAccountBalance(double account_balance) {
        double current_balance = account_balance + 5000;
        System.out.println("Current account balance is " + current_balance);
    }
}