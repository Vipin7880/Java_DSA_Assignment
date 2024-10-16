import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle Amount: ");
        int p = sc.nextInt();

        System.out.print("Enter duration in Years: ");
        int t= sc.nextInt();

        System.out.print("Enter Intrest rate %: ");
        int r = sc.nextInt();

        int FinalAmount= p+(p*r*t)/100;

        System.out.println("Interest is :"+ (FinalAmount-p)+"\nFinal Amount is "+ FinalAmount);
    }
}
