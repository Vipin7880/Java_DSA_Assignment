import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting term:");
        int start=sc.nextInt();
        System.out.print("Enter end term:");
        int end= sc.nextInt();
        for (int i=start; i<=end; i++){
            if (ArmStrongCheck(i))
                System.out.print(i+" ");
        }

    }
    static boolean ArmStrongCheck(int num) {
        if (num < 10 && num >= 0)
            return true;

        int temp = num, digits = 0;
        int rem = 0, NewNum = 0;

        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }

        temp = num;

        while (num > 0) {
            rem = num % 10;
            NewNum = (int) (NewNum + Math.pow(rem, digits));
            num = num / 10;
        }

        if (NewNum == temp)
            return true;
        else
            return false;
    }
}
