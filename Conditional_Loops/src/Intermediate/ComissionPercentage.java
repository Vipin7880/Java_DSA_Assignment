package Intermediate;

import java.util.Scanner;

public class ComissionPercentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The total value of the sales made:");
        float sales=sc.nextFloat();
        System.out.print("Enter The amount of money earned as commission:");
        float comission_amt= sc.nextFloat();

        float compercent=(comission_amt/sales)*100;

        System.out.println("Commission  percentage: "+compercent+"%");
    }
}
