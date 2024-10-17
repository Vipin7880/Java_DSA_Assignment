import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter 1st Num:");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd Num:");
        int n2=sc.nextInt();

        System.out.println("Sum="+(n1+n2));
    }
}
