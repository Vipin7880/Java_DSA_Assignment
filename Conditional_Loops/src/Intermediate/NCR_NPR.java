package Intermediate;

import java.util.Scanner;

public class NCR_NPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Value of N:");
        int N=sc.nextInt();
        System.out.print("Value of r:");
        int r=sc.nextInt();

        int NCr=factorial(N)/(factorial(r)*factorial(N-r));
        int NPr= factorial(N)/factorial(N-r);

        System.out.println("NCR: "+NCr);
        System.out.println("NPR: "+NPr);
    }

    static int factorial(int n){
        if (n==0 || n==1)
            return 1;

        int fact=1;

        for (int i=n; i>=1; i--){
            fact*=i;
        }
        return fact;
    }
}
