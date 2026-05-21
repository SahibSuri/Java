package bank.model;

public class SavingsAccount extends Account {

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}