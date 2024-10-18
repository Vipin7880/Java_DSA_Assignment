package Intermediate;

import java.util.Scanner;

public class DistanceofTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        float x1=sc.nextFloat();
        float y1=sc.nextFloat();
        System.out.print("Enter x2, y2: ");
        float x2= sc.nextFloat();
        float y2= sc.nextFloat();

        double Distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        System.out.println("Distance B/W Two Point: "+ String.format("%.3f",Distance));

    }
}
