import java.util.Scanner;

public class sumofNnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter N: ");
        int n=sc.nextInt();

        System.out.println(SumofN(n));
    }
    static int SumofN(int n){
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}
