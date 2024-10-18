package Intermediate;

import java.util.Scanner;

public class AvgofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int count=0;
        while (true){
            System.out.println("Enter integer (0 to end):");
            int n= sc.nextInt();

            if (n==0)
                break;
            else {
                sum += n;
                count++;
            }
        }
        float Avg=(float) sum/count;
        System.out.print("Average of Entered Num is : "+ Avg);
    }
}
