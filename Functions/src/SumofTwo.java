import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int n1=sc.nextInt();
        System.out.print("Enter 1st number:");
        int n2=sc.nextInt();

        System.out.println("sum: "+Sum(n1,n2));
    }
    static int Sum(int a, int b){
        return a+b;
    }

}
