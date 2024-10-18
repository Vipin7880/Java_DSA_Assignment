package Intermediate;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The original value of the asset: ");;
        int original=sc.nextInt();

        System.out.print("The value of the asset at the end of its useful life: ");
        int salvage= sc.nextInt();

        System.out.print("The expected number of years the asset will be in use(in yrs): ");
        int yrs=sc.nextInt();

        float depreciation=(original-salvage)/yrs;

        System.out.println("Depreciation of Amt "+depreciation+" per year");
    }
}
