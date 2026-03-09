package bank.thread;

public class TransactionThread extends Thread {

    private String transactionName;

    public TransactionThread(String name) {
        transactionName = name;
    }

    public void run() {

        System.out.println("Processing transaction: " + transactionName);

        try {

            Thread.sleep(1000);

        } catch(InterruptedException e) {

            System.out.println("Thread interrupted");
        }

        System.out.println("Transaction completed: " + transactionName);
    }
}