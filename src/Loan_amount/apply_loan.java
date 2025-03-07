package Loan_amount;
import java.util.Scanner;

class Customer {
    private String name;
    private double accountBalance;

    public Customer(String name, double accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void applyLoan(double loanAmount) {
        System.out.println("Loan of ₹" + loanAmount + "  successfully approved to  " + name);
    }
}

public class apply_loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer("name", 50000);

        System.out.println("Welcome, " + customer.getName() + "!");
        System.out.println("Current Account Balance: ₹" + customer.getAccountBalance());
        System.out.println("Enter the loan amount you wish to apply for: ");

        double loanAmount = scanner.nextDouble();

        if (loanAmount > 0) {
            customer.applyLoan(loanAmount);
        } else {
            System.out.println("Invalid loan amount");
        }

        scanner.close();
    }
}
