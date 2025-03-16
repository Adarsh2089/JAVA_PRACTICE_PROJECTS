class BankAccount {
    private int balance = 5000; // Initial balance

    // Synchronized method to prevent race condition
    public synchronized void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing $" + amount);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            balance -= amount;
            System.out.println(name + " successfully withdrew $" + amount);
        } else {
            System.out.println(name + " tried to withdraw $" + amount + " but insufficient balance!");
        }
        System.out.println("Current Balance: $" + balance);
    }
}

class Customer extends Thread {
    private BankAccount account;
    private String name;
    private int amount;

    public Customer(BankAccount account, String customerName, int withdrawAmount) {
        this.account = account;
        this.name = customerName;
        this.amount = withdrawAmount;
    }

    public void run() {
        account.withdraw(name, amount);
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Creating two customer threads trying to withdraw money
        Customer user1 = new Customer(account, "Alice", 3000);
        Customer user2 = new Customer(account, "Bob", 3000);

        user1.start();
        user2.start();
    }
}
