package bank.model;

public class CurrentAccount extends Account {

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) {

        balance -= amount;
        System.out.println("Withdrawal successful");
    }
}