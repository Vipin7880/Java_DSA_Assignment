package Intermediate;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Energy Consumption (kWh):");
        float kWh= sc.nextFloat();

        System.out.print("Enter Cost per kWh:");
        float cost=sc.nextFloat();

        System.out.print("Enter additional fee/taxes (0 if not applicable):");
        float tax=sc.nextFloat();

        float Ebill=(kWh*cost)+tax;

        System.out.println("Your final bill: "+ String.format("%.2f", Ebill));
    }
}
