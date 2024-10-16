import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        System.out.print("Enter Number To check it is Even or Odd:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println(num +" is Even Number");
        else
            System.out.println(num + " is odd Number");
    }
}
