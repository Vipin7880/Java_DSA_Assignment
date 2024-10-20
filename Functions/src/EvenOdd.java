import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no to check: ");
        int n=sc.nextInt();
        Even(n);
    }

    static void Even(int n){
        if (n%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
