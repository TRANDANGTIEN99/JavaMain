package D4.q4;

public class BankAccount {
    private final String accountNumber;
    private final String password;
    private int balance;
    private static int accountCount = 0;
    private static int totalBalance = 0;

    public BankAccount(String accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = 0;
        accountCount += 1;
    }

    public int deposit(int amount) {
        this.balance += amount;
        totalBalance += amount;
        return this.balance;
    }

    public boolean withdraw(int amount, String password) {
        if (!this.password.equals(password) || this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        totalBalance -= amount;
        return true;
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public static int getTotalBalance() {
        return totalBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

}
