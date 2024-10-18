package Intermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter num:");
        float n=sc.nextFloat();

        System.out.print("Enter power:");
        float pow=sc.nextFloat();

        double value=Math.pow(n,pow);

        System.out.println("Value is:"+value);

    }
}
