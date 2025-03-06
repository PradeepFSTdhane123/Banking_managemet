
class BankAccount {
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }


    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }


    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Available Balance: ₹" + balance);
    }
}

public class Available_balance {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Monkey D. Luffy", 5000.0);


        account.displayAccountInfo();


        account.deposit(1000.0);
        account.withdraw(2000.0);
        account.withdraw(6000.0);


        account.displayAccountInfo();
    }
}
