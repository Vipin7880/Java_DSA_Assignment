
import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Rectangle: ");
        int l=sc.nextInt();
        System.out.print("Enter Width of Rectangle: ");
        int w=sc.nextInt();

        double A=l*w;

        System.out.println("Area of given Rectangle is : "+String.format("%.2f", A));

    }
}