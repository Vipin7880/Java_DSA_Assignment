import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of a Circle: ");
        int r=sc.nextInt();
        double area=3.14159*r*r;
        System.out.println("Area of circle: "+String.format("%.2f", area));
    }
}
