package bank.service;

public interface BankService {

    void createAccount(int accNo, String name, double balance, String type);

    void deposit(int accNo, double amount);

    void withdraw(int accNo, double amount);

    void checkBalance(int accNo);
}