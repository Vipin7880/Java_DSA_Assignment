package Intermediate;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year to Check:");
        int n = sc.nextInt();

        if (n<0)
            System.out.println("Enter positive year to check");

        else if ((n%4==0 && n%100!=0)||n%400==0)
            System.out.println("Leap Year");

        else
            System.out.println("Non Leap Year");
    }
}
