import java.util.Scanner;

public class perimtrofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle:");
        float l=sc.nextFloat();

        System.out.print("Enter the width of the rectangle:");
        float w=sc.nextFloat();

        float P=2*(l+w);

        System.out.println("Perimeter is :" + String.format("%.2f", P));

    }
}
