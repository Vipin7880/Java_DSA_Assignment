import java.util.Scanner;

public class CSACylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the base of the cylinder:");
        float r=sc.nextFloat();
        System.out.print("Enter the height of the cylinder:");
        float h=sc.nextFloat();

        float CSA=2*3.14159F*r*h;

        System.out.println("CSA of Cylinder is: " + String.format("%.2f", CSA));

    }
}
