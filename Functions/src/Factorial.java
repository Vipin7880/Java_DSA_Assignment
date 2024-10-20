import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num to get Factorial:");
        double n=sc.nextInt();

        System.out.printf("%.0f", factorial(n));
    }
    static double  factorial(double num){
        if (num==0||num==1)
            return 1;
        else
            return num*factorial(num-1);
    }
}
