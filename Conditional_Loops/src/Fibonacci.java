import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last term :");
        int N= sc.nextInt();

        int a=0,b=1,temp;

        System.out.print(a+","+ b);

        for (int i=2; i<N; i++){
            temp=b;
            b=b+a;
            a=temp;
            System.out.print(","+b);
        }
    }
}
