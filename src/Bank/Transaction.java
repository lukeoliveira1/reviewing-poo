package Bank;

interface Transaction {
    void withdraw(double value) throws InvalidValueException, InsufficientFundsException;

    void deposit(double value) throws InvalidValueException;
}
