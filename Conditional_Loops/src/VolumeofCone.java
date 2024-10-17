import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the base of the cone:");
        float r=sc.nextFloat();

        System.out.print("Enter the height of the cone:");
        float h=sc.nextFloat();

        float pi=3.14159F;

        float Volume=(pi*r*r*h)/3;

        System.out.println("Volume of Cone is :"+ String.format("%.2f", Volume));


    }
}
