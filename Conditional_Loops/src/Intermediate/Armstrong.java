package Intermediate;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int num=sc.nextInt();

        boolean Result= ArmStrongCheck(num);

        System.out.println(Result);
    }

    static boolean ArmStrongCheck(int num) {
        if (num<10 && num>=0)
            return true;

        int temp = num;
        int rem=0, NewNum=0;
        while (num>0){
            rem=num%10;
            NewNum=NewNum+(rem*rem*rem);
            num=num/10;
        }

        if (NewNum==temp)
            return true;
        else
            return false;
    }
}
