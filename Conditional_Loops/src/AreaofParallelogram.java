
import java.util.Scanner;

public class AreaofParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length of Base:");
        float base= sc.nextFloat();

        System.out.print("Enter The height is the perpendicular distance between the base :");
        float height=sc.nextFloat();

        double A=base*height;

        System.out.println("Area of Given Parallelogram is: "+ String.format("%.2f", A));

    }
}