package Bank;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("12345", "John", 500);
        SavingsAccount savingsAccount = new SavingsAccount("67890", "Ana", 1500);

        try {
            System.out.println("Conta Corrente - John:");
            checkingAccount.deposit(200.00);
            checkingAccount.withdraw(100.00);

            System.out.println("\nConta Poupança - Ana:");
            savingsAccount.deposit(500.00);  //
            savingsAccount.withdraw(1200.00);
            savingsAccount.withdraw(2000.00);
        } catch (InvalidValueException | InsufficientFundsException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
