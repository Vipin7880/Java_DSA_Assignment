package Intermediate;

import java.util.Scanner;

public class IntermediateFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 int negative=0;
 int PositiveOdd =0;
 int PositiveEven=0;
        while (true){
            System.out.print("Enter number;");
            int n=sc.nextInt();

            if (n==0)
                break;
            else if (n<0) {
                negative-=n;
            }
            else if (n>0){
                if (n%2==0)
                    PositiveEven+=n;
                else
                    PositiveOdd +=n;
            }

        }

        negative=Math.abs(negative);//to absolute negative number
        System.out.println("Sum of Negative Number: "+ negative);
        System.out.println("Sum of Positive Even Numeber: "+ PositiveEven);
        System.out.println("Sum of Positive Odd Numeber: "+ PositiveOdd);
    }
}
