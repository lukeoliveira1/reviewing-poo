package Bank;

class SavingsAccount extends Account implements Transaction {
    public static double withdrawLimit = 1000;

    public SavingsAccount(String accountNumber, String manager, double balance) {
        super(accountNumber, manager, balance);
    }

    public void withdraw(double value) throws InvalidValueException, InsufficientFundsException {
        if (value < 0) {
            throw new InvalidValueException("Valor inválido!");
        }
        if (value > withdrawLimit) {
            throw new InsufficientFundsException("Limite de saque na conta poupança excedido.");
        }
        if (value > this.getBalance()) {
            throw new InsufficientFundsException("Valor não disponível na sua conta!");
        }
        this.setBalance(this.getBalance() - value);
        System.out.println("Saque realizado com sucesso!");
        System.out.println("Valor atual na conta R$: " + this.getBalance());
    }

    public void deposit(double value) throws InvalidValueException {
        if (value < 0) {
            throw new InvalidValueException("Valor inválido!");
        }
        this.setBalance(this.getBalance() + value);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Valor atual na conta R$: " + this.getBalance());
    }
}
