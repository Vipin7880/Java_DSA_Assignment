package Intermediate;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Number to Check: ");
        int n=sc.nextInt();
        int newNum=0;
        int temp=n;
        while (n>0){
            int r=n%10;
            newNum=newNum*10+r;
            n=n/10;
        }

        if (newNum==temp)
            System.out.println("true");
        else
            System.out.println("false");

    }


}

