package Bank;

class CheckingAccount extends Account implements Transaction {
    private static final double withdrawFee = 2.50;

    public CheckingAccount(String accountNumber, String manager, double balance) {
        super(accountNumber, manager, balance);
    }

    @Override
    public void withdraw(double value) throws InvalidValueException, InsufficientFundsException {
        if (value < 0) {
            throw new InvalidValueException("Valor inválido!");
        }
        if (value > this.getBalance()) {
            throw new InsufficientFundsException("Valor não disponível na sua conta!");
        }
        this.setBalance(this.getBalance() - (value + withdrawFee));
        System.out.println("Saque realizado com sucesso!");
        System.out.println("Valor atual na conta R$: " + this.getBalance());
    }

    @Override
    public void deposit(double value) throws InvalidValueException {
        if (value < 0) {
            throw new InvalidValueException("Valor inválido!");
        }
        this.setBalance(this.getBalance() + value);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Valor atual na conta R$: " + this.getBalance());
    }
}
