package Intermediate;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The total number of runs a batsman has scored: ");
        int runs=sc.nextInt();
        System.out.print("The number of times the batsman has been dismissed (out): ");
        int out=sc.nextInt();

        int battingavg=runs/out;

        System.out.println("Average : "+battingavg);
    }
}
