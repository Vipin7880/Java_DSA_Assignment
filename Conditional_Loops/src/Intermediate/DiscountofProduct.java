package Intermediate;

import java.util.Scanner;

public class DiscountofProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Original price:");
        float Price=sc.nextFloat();
        System.out.print("Enter discount percentage:");
        float Dp=sc.nextFloat();

        float DisAmount=  Price*(Dp/100);
        float AmtPayable= Price-DisAmount;

        System.out.println("Discount Amt: "+ DisAmount);
        System.out.print("Payable Amt: "+ AmtPayable);
    }
}
