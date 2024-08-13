class Account {
    int balance;
    public int accountNo;

    void display() {
        System.out.println("Account No.: " + accountNo + "\tBalance: " + balance);
    }

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + "\tCurrent Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + "\tCurrent Balance: " + balance);
    }
}

class TransactionDeposit implements Runnable {
    int amount;
    Account accountX;

    TransactionDeposit(Account X, int amount) {
        accountX = X;
        this.amount = amount;
        new Thread(this).start();
    }

    public void run() {
        accountX.deposit(amount);
    }
}

class TransactionWithdraw implements Runnable {
    int amount;
    Account accountY;

    TransactionWithdraw(Account y, int amount) {
        accountY = y;
        this.amount = amount;
        new Thread(this).start();
    }

    public void run() {
        accountY.withdraw(amount);
    }
}

/**
 * demons_119
 */
public class demons_119 {

    public static void main(String[] args) {
        Account ABC = new Account();
        ABC.balance = 10000;
        ABC.accountNo = 12345;
        TransactionDeposit T1 = new TransactionDeposit(ABC, 1000);
        TransactionWithdraw T2 = new TransactionWithdraw(ABC, 500);
    }
}