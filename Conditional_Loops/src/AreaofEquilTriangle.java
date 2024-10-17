import java.util.Scanner;

public class AreaofEquilTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of one side:");
        float s=sc.nextFloat();
        double A=(Math.sqrt(3)/4)*s*s;

        System.out.println("Area is: "+ String.format("%.2f", A));
    }
}
