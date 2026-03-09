package bank.service;

import java.util.HashMap;
import java.util.Map;

import bank.model.Account;
import bank.model.SavingsAccount;
import bank.model.CurrentAccount;

public class BankServiceImpl implements BankService {

    Map<Integer, Account> accounts = new HashMap<>();

    @Override
    public void createAccount(int accNo, String name, double balance, String type) {

        Account acc;

        if(type.equalsIgnoreCase("saving")) {
            acc = new SavingsAccount(accNo, name, balance);
        } else {
            acc = new CurrentAccount(accNo, name, balance);
        }

        accounts.put(accNo, acc);

        System.out.println("Account created successfully");
    }

    @Override
    public void deposit(int accNo, double amount) {

        Account acc = accounts.get(accNo);

        if(acc != null) {
            acc.deposit(amount);
            System.out.println("Deposit successful");
        } else {
            System.out.println("Account not found");
        }
    }

    @Override
    public void withdraw(int accNo, double amount) {

        Account acc = accounts.get(accNo);

        if(acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    @Override
    public void checkBalance(int accNo) {

        Account acc = accounts.get(accNo);

        if(acc != null) {
            acc.displayDetails();
        } else {
            System.out.println("Account not found");
        }
    }
}