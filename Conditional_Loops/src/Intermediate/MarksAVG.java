package Intermediate;

import java.util.Scanner;

public class MarksAVG {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Total subjects:");
        int n=sc.nextInt();
        float sum=0;

        for (int i = 1 ; i <= n; i++) {
            System.out.print("Enter Marks for subject "+ i+": ");
            float marks =sc.nextFloat();
            sum+= marks;
        }

        float Average =sum/n;

        System.out.println("Average: "+ Average);

    }
}
