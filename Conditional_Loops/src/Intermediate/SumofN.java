package Intermediate;

import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while (true)
        {
            System.out.print("Enter integer Value(0 to terminate):");
            int n=sc.nextInt();

            if (n==0)
                break;
            else
                sum+=n;
        }

        System.out.println("Sum of Total: "+sum);
    }
}
