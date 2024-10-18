package Intermediate;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Principal amount (the initial amount of money): ");
        int p=sc.nextInt();
        System.out.print("Annual interest rate in %:");
        float r=sc.nextFloat()/100;// to convert from % to decimal
        System.out.print("Number of years the money is invested: ");
        int n= sc.nextInt();

        double FV=p*Math.pow((1+r), n);

        System.out.println("Future Value of the Investment is :  "+ String.format("%.2f", FV));
    }
}
