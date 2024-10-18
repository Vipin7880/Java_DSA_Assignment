package Intermediate;


import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual interest rate (r) in percentage: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time (t) in years: ");
        int time = sc.nextInt();

        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int n = sc.nextInt();

        rate = rate / 100; //to convert rate from % to decimal

        double amount = principal * Math.pow(1 + (rate / n), n * time);
        double compoundInterest = amount - principal;

        System.out.println("Final Amount (A): " + String.format("%.2f",amount));
        System.out.println("Compound Interest: " + String.format("%.2f",compoundInterest));

        sc.close();
    }

}
