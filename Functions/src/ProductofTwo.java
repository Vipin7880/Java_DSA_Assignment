import java.util.Scanner;

public class ProductofTwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int n1=sc.nextInt();
        System.out.print("Enter 1st number:");
        int n2=sc.nextInt();

        System.out.println("Product: "+ Product(n1,n2));
    }
    static int Product(int a, int b){
        return a*b;
    }
}
