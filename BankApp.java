class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500);
        myAccount.deposit(200);
        myAccount.withdraw(100);
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}
