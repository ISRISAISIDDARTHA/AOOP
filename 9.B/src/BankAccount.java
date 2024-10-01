public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", New Balance: " + balance);
        }
    }
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw: " + amount + ", Insufficient funds.");
        }
    }
    public synchronized double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        Thread user1 = new Thread(new TransactionTask(account, true, 200), "User1");
        Thread user2 = new Thread(new TransactionTask(account, false, 150), "User2");
        Thread user3 = new Thread(new TransactionTask(account, true, 300), "User3");
        Thread user4 = new Thread(new TransactionTask(account, false, 500), "User4");

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
class TransactionTask implements Runnable {
    private BankAccount account;
    private boolean deposit;
    private double amount;
    public TransactionTask(BankAccount account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }
    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}
