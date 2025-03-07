

class BankAccount1 {
    private String accountHolderName;
    private double balance;


    public BankAccount1(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Available balance: ₹" + balance);
        } else {
            System.out.println("Invalid withdrawal .");
        }
    }


    public double getBalance() {
        return balance;
    }
}

public class Withdraw_balance {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("name", 5000.0);


        System.out.println("Available Balance: ₹" + account.getBalance());
        account.withdraw(2000.0);
        System.out.println("Available Balance: ₹" + account.getBalance());
        account.withdraw(4000.0);
    }
}
