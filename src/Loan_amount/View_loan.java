package Loan_amount;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Loan {
    private double loanAmount;
    private double interestRate;
    private int tenure;

    public Loan(double loanAmount, double interestRate, int tenure) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTenure() {
        return tenure;
    }

    public double calculateEMI() {
        double monthlyInterestRate = (interestRate / 100) / 12;
        return (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenure)) /
                (Math.pow(1 + monthlyInterestRate, tenure) - 1);
    }

    @Override
    public String toString() {
        return "Loan Amount: ₹" + loanAmount +
                ", Interest Rate: " + interestRate + "%" +
                ", Tenure: " + tenure + " months" +
                ", EMI: ₹" + String.format("%.2f", calculateEMI());
    }
}

public class View_loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Loan> loanList = new ArrayList<>();

        System.out.println("Welcome to the Loan Management System");
        System.out.println("if you wan to view all apply for a loan? yes/no: ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter loan amount: ");
            double loanAmount = scanner.nextDouble();

            System.out.println("Enter interest rate in percentage: ");
            double interestRate = scanner.nextDouble();

            System.out.println("Enter loan tenure in month: ");
            int tenure = scanner.nextInt();

            Loan loan = new Loan(loanAmount, interestRate, tenure);
            loanList.add(loan);

            System.out.println("Loan successfully applied");
            System.out.println("details of loan:");
            System.out.println(loan);
        }

        System.out.println("if you wan to view all loans? (yes/no): ");
        scanner.nextLine();
        response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            if (loanList.isEmpty()) {
                System.out.println("No loans found.");
            } else {
                System.out.println("Your Loans:");
                for (Loan loan : loanList) {
                    System.out.println(loan);
                }
            }
        }

        scanner.close();
    }
}
