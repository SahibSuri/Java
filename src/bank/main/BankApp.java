package bank.main;

import java.util.Scanner;

import bank.service.BankService;
import bank.service.BankServiceImpl;
import bank.thread.TransactionThread;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankService bank = new BankServiceImpl();

        while(true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");

            System.out.println("1 Create Account");
            System.out.println("2 Deposit");
            System.out.println("3 Withdraw");
            System.out.println("4 Check Balance");
            System.out.println("5 Run Transaction Thread");
            System.out.println("6 Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Account Number: ");
                    int accNo = sc.nextInt();

                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Initial Balance: ");
                    double balance = sc.nextDouble();

                    System.out.print("Type (saving/current): ");
                    String type = sc.next();

                    bank.createAccount(accNo, name, balance, type);

                    break;

                case 2:

                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();

                    bank.deposit(accNo, amount);

                    break;

                case 3:

                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();

                    System.out.print("Amount: ");
                    amount = sc.nextDouble();

                    bank.withdraw(accNo, amount);

                    break;

                case 4:

                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();

                    bank.checkBalance(accNo);

                    break;

                case 5:

                    TransactionThread t1 = new TransactionThread("Deposit Thread");

                    t1.start();

                    break;

                case 6:

                    System.exit(0);
            }
        }
    }
}