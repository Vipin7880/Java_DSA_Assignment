package Intermediate;

import java.util.Scanner;

public class CalcCGPA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Total subjects:");
        int n=sc.nextInt();
        float sum=0;

        for (int i = 1 ; i <= n; i++) {
            System.out.print("Enter Grade points for subject "+ i+": ");
            float gp=sc.nextFloat();
            sum+=gp;
        }

            float CGPA=sum/n;

        System.out.println("CGPA: "+ CGPA);

    }
}
