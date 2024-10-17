import java.util.Scanner;

public class ZeroP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.print("Enter Integer: ");
            int n=sc.nextInt();


            if (n==0)
                break;
            else
                sum+=n;
        }
        System.out.println("Sum of all entered value: "+ sum);
    }
}
