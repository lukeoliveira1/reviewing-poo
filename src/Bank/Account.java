package Bank;

public abstract class Account {
    private String accountNumber;
    private String manager;
    private double balance;

    public Account(String accountNumber, String manager, double balance) {
        this.accountNumber = accountNumber;
        this.manager = manager;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}